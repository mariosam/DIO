/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

var NOTAS = []int{100, 50, 20, 10, 5, 2, 1}

/**
 * Count the number of cedules to each note.
 */
func countNotes(total int) []int {
	arResult := []int{0, 0, 0, 0, 0, 0, 0}

	for i, nota := range NOTAS {
		if total >= nota {
			arResult[i] = total / nota

			total = total % nota
		}
	}

	return arResult
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

const POSSIVEL = "possible"
const IMPOSSIVEL = "impossible"

var NOTAS = []int{2, 5, 10, 20, 50, 100}

/**
 * Check if is possible (or impossible) to give two notes change.
 */
func hasTwoNotesChange(x int64, y int64) string {
	var result string = IMPOSSIVEL
	var change int = int(y - x)

	for i := 0; i < len(NOTAS); i++ {
		for j := 0; j < len(NOTAS); j++ {
			if change == NOTAS[i]+NOTAS[j] {
				result = POSSIVEL
				break
			}
		}
	}

	return result
}

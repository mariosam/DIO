/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Do the math for identify if the square is white or black
 */
func tableColor(L int, C int) int {
	var result int = 0

	if L%2 == C%2 {
		result = 1
	}

	return result
}

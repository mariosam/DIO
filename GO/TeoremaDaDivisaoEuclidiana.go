/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "math"

/**
 * Get the quocient and rest of the division.
 */
func getQuoAndRest(a int, b int) []int {
	q := a / b
	r := a % b

	if r < 0 {
		r += int(math.Abs(float64(b)))

		q = (a - r) / b
	}

	return []int{q, r}
}

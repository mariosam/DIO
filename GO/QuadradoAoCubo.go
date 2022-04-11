/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "math"

/**
 * Load all square and cumbe numbers.
 */
func loadSquareAndCumbe(n int) [][]int {
	results := [][]int{}

	for i := 1; i <= n; i++ {
		results = append(results, []int{i, int(math.Pow(float64(i), 2)), int(math.Pow(float64(i), 3))})
	}

	return results
}

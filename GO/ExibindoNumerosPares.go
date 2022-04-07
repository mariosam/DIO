/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Show only the eve numbers.
 */
func countEve(n int) []int {
	results := []int{}

	for i := 2; i <= n; i += 2 {
		results = append(results, i)
	}

	return results
}

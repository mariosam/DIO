/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Count positives numbers.
 */
func sumPositives(ar []float32) int {
	result := 0

	for _, num := range ar {
		if num > 0 {
			result++
		}
	}

	return result
}

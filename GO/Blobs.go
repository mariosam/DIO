/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * How many days do we have available food.
 */
func countDays(food float64) int {
	var result int = 0

	for food > 1.0 {
		result++
		food = food / 2
	}

	return result
}

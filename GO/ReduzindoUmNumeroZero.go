/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Get a number and reduce to zero.
 */
func reduceNumber(num int) int {
	times := 0

	for num > 0 {
		times++

		//se for par
		if num%2 == 0 {
			num = num / 2
		} else {
			num = num - 1
		}
	}

	return times
}

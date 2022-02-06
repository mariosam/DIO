/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Return the factorial number.
 */
func simpleFactorial(N int) int {
	var result int = 1
	N++

	for N > 1 {
		result = result * (N - 1)
		N--
	}

	return result
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * How many odds do we have between two numbers.
 */
func oddsBetween(X int, Y int) int {
	var result int = 0

	if X < Y {
		for i := X + 1; i < Y; i++ {
			if i%2 != 0 {
				result += i
			}
		}
	} else {
		for i := Y + 1; i < X; i++ {
			if i%2 != 0 {
				result += i
			}
		}
	}

	return result
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

const N = "N"
const S = "S"

/**
 * Check if is possible to travel in time.
 */
func possibleTravel(a int, b int, c int) string {
	var result string = N

	if a == b || b == c || a == c || a+b == c || a+c == b || b+c == a {
		result = S
	}

	return result
}

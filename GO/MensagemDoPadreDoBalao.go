/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Decode the message.
 */
func decodeMsg(a string, nums []int) string {
	result := ""

	for _, n := range nums {
		result += string(a[n-1])
	}

	return result
}

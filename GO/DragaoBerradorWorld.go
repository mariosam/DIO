/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Put in the guesst list only people higher than MIN and lower than MAX size.
 */
func numberOfGuests(inp []int, ops []int) int {
	conta := 0

	for _, v := range ops {
		if v >= inp[1] && v <= inp[2] {
			conta++
		}
	}

	return conta
}

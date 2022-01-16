/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Calculate time and timezone to inform the localtime/gap of travel.
 */
func localTime(S int, T int, F int) int {
	adj := S + T + F

	if adj >= 24 {
		adj -= 24
	} else if adj < 0 {
		adj += 24
	}

	return adj
}

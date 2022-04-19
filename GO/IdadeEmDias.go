/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "math"

/**
 * Split age in days, month and year
 */
func splitAgeDays(days int) []int {
	year := math.Floor(float64(days) / 365)
	month := math.Floor((float64(days) - (year * 365)) / 30)
	day := days % 365 % 30

	return []int{int(year), int(month), int(day)}
}

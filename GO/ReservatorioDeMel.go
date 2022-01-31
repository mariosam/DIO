/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "math"

const PI = 3.14

/**
 * Calculate and return the high of object.
 */
func getHigh(v float64, d float64) float64 {
	f := v / (PI * ((d / 2) * (d / 2)))

	return math.Round(f*100) / 100
}

/**
 * Calculate and return the area of object.
 */
func getArea(d float64) float64 {
	f := PI * ((d / 2) * (d / 2))

	return math.Floor(f*100) / 100
}

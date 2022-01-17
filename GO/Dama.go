/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import (
	"math"
)

/**
 * Inform the minimun of moviments required.
 */
func minMoviments(x1 float64, y1 float64, x2 float64, y2 float64) int {
	result := 2

	if x1 == x2 && y1 == y2 {
		result = 0
	} else if x1 == x2 || y1 == y2 || math.Abs(x1-x2) == math.Abs(y1-y2) {
		result = 1
	}

	return result
}

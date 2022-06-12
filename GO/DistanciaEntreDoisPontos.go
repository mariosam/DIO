/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import (
	"fmt"
	"math"
)

/**
 * Do the math: Calculate the distance between two points.
 */
func getDistance(x1 float64, y1 float64, x2 float64, y2 float64) string {
	return fmt.Sprintf("%.4f", math.Sqrt(math.Pow(x2-x1, 2)+math.Pow(y2-y1, 2)))
}

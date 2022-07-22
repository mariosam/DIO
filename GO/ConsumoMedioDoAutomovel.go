/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import (
	"fmt"
	"strconv"
)

/**
 * Return the average consumption of the car.
 */
func averageConsumption(x float64, y float64) float64 {
	res := fmt.Sprintf("%.3f", x/y)

	s, _ := strconv.ParseFloat(res, 64)

	return s
}

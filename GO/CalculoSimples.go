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
 * Multiply product value by quantity and return the total.
 */
func calcTotalToPay(pecas1 []float64, pecas2 []float64) float64 {
	res := fmt.Sprintf("%.2f", (pecas1[1]*pecas1[2])+(pecas2[1]*pecas2[2]))
	num, _ := strconv.ParseFloat(res, 64)

	return num
}

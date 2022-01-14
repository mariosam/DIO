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
 * Calculate the amount of corn to delivery.
 */
func cornToReceive(x int) int64 {
	base := float64(x)
	amount := int64(math.Pow(2, base))

	return amount / 12000
}

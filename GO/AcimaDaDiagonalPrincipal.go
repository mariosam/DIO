/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "math"

const MEDIA = "M"

/**
 * Get only numbers above the line and check if is sum or average.
 */
func mathResult(ope string, nums []int) float64 {
	var result float64 = 0
	var i int = 0

	for x := 0; x < 12; x++ {
		for y := 0; y < 12; y++ {
			var num float64 = float64(nums[i])
			i++

			if y > x {
				result += num
			}
		}
	}

	if ope == MEDIA {
		result /= 66.0
	}

	output := math.Pow(10, float64(1))
	return float64(round(result*output)) / output
}

//just to use 1.1 (one decimal)
func round(num float64) int {
	return int(num + math.Copysign(0.5, num))
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import (
	"fmt"
	"strconv"
	"strings"
)

const NOTAINVALIDA = "nota invalida"
const MEDIA = "media = "
const NOVOCALCULO = "novo calculo (1-sim 2-nao)"

var n1 = -1.0
var n2 = -1.0
var arr = []string{}

/**
 * Control the calls to the systems checks.
 */
func startSystem(nums []string) []string {
	for i := 0; i < len(nums); i++ {
		if !checkNumber(nums[i]) {
			if nums[i] == "2" {
				break
			}

			n, _ := strconv.ParseInt(nums[i], 0, 8)
			if !checkSystem(n) {
				arr = append(arr, NOVOCALCULO)
				continue
			}
			i++
		}
		n, _ := strconv.ParseFloat(nums[i], 64)
		scoreValidate(n)
	}

	return arr
}

/**
 * Check if is a valid score to sum.
 */
func checkNumber(num string) bool {
	return strings.Contains(num, ".")
}

/**
 * Check if must continue or stop.
 */
func checkSystem(num int64) bool {
	if num == 1 {
		return true
	} else {
		return false
	}
}

/**
 * Check the entry and do the math to score.
 */
func scoreValidate(num float64) {
	if num >= 0 && num <= 10 {
		if n1 > -1 {
			n2 = num
		} else {
			n1 = num
		}

		if n2 > -1 {
			average := ((n1 + n2) / 2)

			arr = append(arr, MEDIA+fmt.Sprintf("%.2f", average))
			arr = append(arr, NOVOCALCULO)

			n1 = -1
			n2 = -1
		}
	} else {
		arr = append(arr, NOTAINVALIDA)
	}
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Calculate and return the average of ages.
 */
func calcAverage(ages []float64) float64 {
	var result float64

	for _, age := range ages {
		result += age
	}

	return result / float64(len(ages))
}

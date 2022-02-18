/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "math"

/**
 * Fibonacci value using Binet formule.
 */
func binetFormule(N int) float64 {
	return (math.Pow((1+math.Sqrt(5))/2, float64(N)) - math.Pow((1-math.Sqrt(5))/2, float64(N))) / math.Sqrt(5)
}

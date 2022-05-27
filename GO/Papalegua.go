/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Get values and return the minor value, the faster one.
 */
func theFaster(arr []float64) float64 {
	faster := 999.0

	for _, value := range arr {
		if value < faster {
			faster = value
		}
	}

	return faster
}

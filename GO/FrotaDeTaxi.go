/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Return the more economic combustivel.
 */
func moreEconomic(a float64, g float64, ra float64, rg float64) string {
	result := "A"
	precoPorKmAlcool := a / ra
	precoPorKmGasolina := g / rg

	if precoPorKmGasolina <= precoPorKmAlcool {
		result = "G"
	}

	return result
}

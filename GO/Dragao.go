/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

const MAISDE8000 = "Mais de 8000!"
const INSETO = "Inseto!"

/**
 * Return the drogon message about the energy level identified.
 */
func checkEnergyLevel(energy int) string {
	var result string = INSETO

	if energy > 8000 {
		result = MAISDE8000
	}

	return result
}

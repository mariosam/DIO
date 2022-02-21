/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

const SIM = "Sao Multiplos"
const NAO = "Nao sao Multiplos"

/**
 * Check if the numers are multiply.
 */
func areTheyMulti(x int, y int) string {
	result := NAO

	if x%y == 0 || y%x == 0 {
		result = SIM
	}

	return result
}

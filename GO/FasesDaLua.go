/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

const NOVA = "nova"
const CRESCENTE = "crescente"
const CHEIA = "cheia"
const MINGUANTE = "minguante"

/**
 * Check the fase of the Moon.
 */
func moonFase(day1 int, day2 int) string {
	var result string = CHEIA

	if day1 >= 0 && day2 <= 2 {
		result = NOVA
	} else if day2 > day1 && day2 <= 96 {
		result = CRESCENTE
	} else if day1 >= day2 && day2 <= 96 {
		result = MINGUANTE
	}

	return result
}

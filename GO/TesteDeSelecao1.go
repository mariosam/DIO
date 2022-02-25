/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

const sim = "Valores aceitos"
const nao = "Valores nao aceitos"

/**
 * Check if order of numbers are valid.
 */
func checkSequence(a int, b int, c int, d int) string {
	result := nao

	if b > c && d > a && c > 0 && d > 0 && (c+d) > (a+b) && a%2 == 0 {
		result = sim
	}

	return result
}

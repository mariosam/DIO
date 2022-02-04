/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

const HOJE = "Farei hoje!"
const AMANHA = "Deixa para amanha!"

/**
 * Dobby will do the work today or tomorrow.
 */
func todayOrTomorrow(n int, a int, b int) string {
	var result string = HOJE

	if n < (a + b) {
		result = AMANHA
	}

	return result
}

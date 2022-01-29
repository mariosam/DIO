/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

const BLOCKED = "Senha Invalida"
const GRANTED = "Acesso Permitido"
const SWORDFISH = 2002

/**
 * Check if the password is valid.
 */
func checkPass(pass int) string {
	var result string = BLOCKED

	if pass == SWORDFISH {
		result = GRANTED
	}

	return result
}

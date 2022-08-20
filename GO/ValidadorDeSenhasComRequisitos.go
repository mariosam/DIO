/**
 * @version GO 1.19
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import (
	"regexp"
	"strings"
)

const VALIDO = "Senha valida."
const INVALIDO = "Senha invalida."

/**
 * Check if password is valid.
 */
func passwordValidator(pwd string) string {
	result := VALIDO

	//regex de validacao
	check_invalids, _ := regexp.Compile(`[[:punct:]]`)
	check_low_az, _ := regexp.Compile(`[[:lower:]]`)
	check_up_az, _ := regexp.Compile(`[[:upper:]]`)
	check_num, _ := regexp.Compile(`[[:digit:]]`)

	//valida o tamanho
	if len(pwd) < 6 || len(pwd) > 32 {
		result = INVALIDO
		//valida se possui espacos ou caracteres nao alphanumericos
	} else if check_invalids.MatchString(pwd) || strings.Contains(pwd, " ") {
		result = INVALIDO
		//valida se possui elementos obrigatorios (maiusculas, minusculas, e numeros)
	} else if !check_low_az.MatchString(pwd) || !check_up_az.MatchString(pwd) || !check_num.MatchString(pwd) {
		result = INVALIDO
	}

	return result
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

const NONE = "DDD nao cadastrado"
const BRASILIA = "Brasilia"
const SALVADOR = "Salvador"
const SAOPAULO = "Sao Paulo"
const RIODEJANEIRO = "Rio de Janeiro"
const JUIZDEFORA = "Juiz de Fora"
const CAMPINAS = "Campinas"
const VITORIA = "Vitoria"
const BELOHORIZONTE = "Belo Horizonte"

/**
 * Return the name of the city using DDD reference.
 */
func dddCity(cod int) string {
	var result string = NONE

	switch cod {
	case 61:
		result = BRASILIA
	case 71:
		result = SALVADOR
	case 11:
		result = SAOPAULO
	case 21:
		result = RIODEJANEIRO
	case 32:
		result = JUIZDEFORA
	case 19:
		result = CAMPINAS
	case 27:
		result = VITORIA
	case 31:
		result = BELOHORIZONTE
	}

	return result
}

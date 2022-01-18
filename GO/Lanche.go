/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Sum total to pay.
 */
func totalToPay(cod int, qtd int) float32 {
	var result float32

	switch cod {
	case 1:
		result = float32(qtd) * 4.00
	case 2:
		result = float32(qtd) * 4.50
	case 3:
		result = float32(qtd) * 5.00
	case 4:
		result = float32(qtd) * 2.00
	case 5:
		result = float32(qtd) * 1.50
	}

	return result
}

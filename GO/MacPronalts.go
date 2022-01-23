/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Multiply product value by quantity and return the total.
 */
func shopValue(prods []int, qtds []int) float64 {
	var result float64 = 0.0

	for i := 0; i < len(prods); i++ {
		switch prods[i] {
		case 1001:
			result += 1.50 * float64(qtds[i])
		case 1002:
			result += 2.50 * float64(qtds[i])
		case 1003:
			result += 3.50 * float64(qtds[i])
		case 1004:
			result += 4.50 * float64(qtds[i])
		case 1005:
			result += 5.50 * float64(qtds[i])
		}
	}

	return result
}

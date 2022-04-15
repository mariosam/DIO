/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "fmt"

const IMPOSSIVEL = "divisao impossivel"

/**
 * Do the math: DIV two values.
 */
func divTwoValues(x float64, y float64) string {
	var result string = IMPOSSIVEL

	if y != 0 {
		value := x / y

		result = fmt.Sprintf("%.1f", value)
	}

	return result
}

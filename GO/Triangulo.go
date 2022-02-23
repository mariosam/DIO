/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "fmt"

/**
* Calculate area or perimeter.
 */
func calcArea(a float64, b float64, c float64) string {
	result := ""
	maior := c
	soma := b + a

	if a > b && a > c {
		maior = a
	} else if b > c {
		maior = b
	}

	if maior == a {
		soma = b + c
	} else if maior == b {
		soma = a + c
	}

	if soma > maior {
		result = fmt.Sprintf("Perimetro = %.1f", float64(a+b+c))
	} else {
		result = fmt.Sprintf("Area = %.1f", float64(((a+b)*c)/2))
	}

	return result
}

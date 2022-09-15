/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "fmt"

/**
 * Print all values of vector.
 */
func printAllVector2(x int) {
	j := 0
	for i := 0; i < 10000; i++ {
		fmt.Sprintf("N[%d] = %d", i, j)
		j++

		if j == (x - 1) {
			j = -1
		}
	}
}

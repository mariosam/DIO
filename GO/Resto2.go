/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "fmt"

/**
 * Print all values where rest is equals 2.
 */
func printAllRest2(x int) {
	for i := 1; i < 10000; i++ {
		if i%x == 2 {
			fmt.Println(i)
		}
	}
}

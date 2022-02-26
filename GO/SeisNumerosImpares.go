/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "fmt"

/**
 * Print the next six odd.
 */
func printSixOdd(x int) {
	//if even transform in odd.
	if x%2 != 0 {
		x = x - 1
	}

	for i := 1; i < 12; i = i + 2 {
		fmt.Println(x + i)
	}
}

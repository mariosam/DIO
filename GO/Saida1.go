/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "fmt"

/**
 * Print the sysmbols.
 */
func printBox(n1 string, n2 string) {
	fmt.Print("\n" + n1)
	for i := 0; i < 37; i++ {
		fmt.Print(n2)
	}
	fmt.Print(n1 + "\n")
}

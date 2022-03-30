/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "strings"

/**
 * Count how many boys and girls do we have to count each toys.
 */
func howManyToys(inputs []string) []int {
	boys := 0

	for i := 0; i < len(inputs); i++ {
		if strings.ToUpper(inputs[i][len(inputs[i])-1:]) == "M" {
			boys++
		}
	}

	return []int{boys, len(inputs) - boys}
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import (
	"sort"
)

/**
 * Remove duplicates and organize my list.
 */
func checkMyList(items []string) []string {
	var result []string

	for _, item := range items {
		var contem bool = false

		for _, r := range result {
			if r == item {
				contem = true
				break
			}
		}

		if !contem {
			result = append(result, item)
		}
	}

	sort.Strings(result)
	return result
}

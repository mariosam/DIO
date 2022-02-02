/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "strings"

const YES = "YES"
const NO = "NO"

/**
 * Check if the size of name is valid.
 */
func checkNameSize(name string) string {
	result := NO

	if len(strings.TrimSpace(name)) < 81 {
		result = YES
	}

	return result
}

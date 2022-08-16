/**
 * @version GO 1.19
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "strings"

/**
 * Compare two strings and return the biggest substring that is common to both words.
 */
func findTheBiggestSubstring(w1 string, w2 string) int {
	for size := len(w1); size >= 0; size-- {
		for i := 0; i <= len(w1)-size; i++ {
			sub := w1[i : i+size]

			if strings.Contains(w2, sub) {
				return size
			}
		}
	}

	return 0
}

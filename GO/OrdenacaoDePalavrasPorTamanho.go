/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import (
	"sort"
	"strings"
)

/**
 * Return the words ordered by size (desc).
 */
func orderWordsBySize(words string) string {
	wordsArray := strings.Split(words, " ")

	sort.Slice(wordsArray, func(i, j int) bool {
		return len(wordsArray[i]) > len(wordsArray[j])
	})

	return strings.Join(wordsArray, " ")
}

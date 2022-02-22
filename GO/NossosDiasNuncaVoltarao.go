/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

const WORD = "LIFE IS NOT A PROBLEM TO BE SOLVED"

/**
 * Return only part of the word.
 */
func cutWord(pos int) string {
	return string(WORD[0:pos])
}

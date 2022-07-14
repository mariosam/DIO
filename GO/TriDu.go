/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Check what it is the greatest card.
 */
func greatestCard(A int, B int) int64 {
	result := A

	if B > A {
		result = B
	}

	return int64(result)
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

//const sim = "S"
//const nao = "N"

/**
 * Check if mattress pass through the door.
 */
func checkSize(A int, B int, C int, H int, L int) string {
	var result string = N

	if (A <= H && B <= L) || (A <= H && C <= L) || (B <= H && A <= L) || (B <= H && C <= L) || (C <= H && A <= L) || (C <= H && B <= L) {
		result = S
	}

	return result
}

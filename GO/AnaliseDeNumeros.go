/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Count number of positives negatives odd and even.
 */
func numberAnalysis(nums []int) []int {
	pos, neg, odd, eve := 0, 0, 0, 0

	for i := 0; i < len(nums); i++ {
		n := nums[i]

		//check if odd or even
		if n%2 == 0 {
			eve++
		} else {
			odd++
		}

		//check if positive or negative
		if n != 0 {
			if n > 0 {
				pos++
			} else {
				neg++
			}
		}
	}

	return []int{eve, odd, pos, neg}
}

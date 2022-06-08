/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Forbiden to enter less than 18 years old.
 */
func forbidenUnder18(ages []int) []int {
	var forbiden []int

	for _, age := range ages {
		if age < 18 {
			forbiden = append(forbiden, age)
		}
	}

	return forbiden
}

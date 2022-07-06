/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Cont how many orders will be delivered per people.
 */
func howManyOrdersPerPeople(people int) int {
	var result int = 0

	if people%2 != 0 {
		result = (people * 2) - 1
	} else {
		result = (people * 2) - 2
	}

	return result
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Return the result of sum of all numbers in the array
 */
func resultOfSum(inputs []int) []int {
	var result []int

	for _, value := range inputs {
		result = append(result, value%2)
	}

	return result
}

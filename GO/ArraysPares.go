/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Return only even numbers from an array.
 */
func returnOnlyEven(inputs []int) []int {
	var result []int

	for _, value := range inputs {
		if value%2 == 0 {
			result = append(result, value)
		}
	}

	return result
}

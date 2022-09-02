/**
 * @version GO 1.19
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Get the multiples of array numbers.
 */
func getMultiples(ar []int) []int {
	result := []int{0, 0, 0, 0}

	for i := 0; i < len(ar); i++ {
		if ar[i]%2 == 0 {
			result[0]++
		}
		if ar[i]%3 == 0 {
			result[1]++
		}
		if ar[i]%4 == 0 {
			result[2]++
		}
		if ar[i]%5 == 0 {
			result[3]++
		}
	}

	return result
}

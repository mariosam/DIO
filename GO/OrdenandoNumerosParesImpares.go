/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "sort"

/**
 * Return numbers even asc and odd desc.
 */
func orderOddsEvenNumbers(inputs []int) []int {
	var evens []int
	var odds []int

	//separate odd and even numbers
	for _, number := range inputs {
		if number%2 == 0 {
			evens = append(evens, number)
		} else {
			odds = append(odds, number)
		}
	}

	//put even numbers in ascending order
	sort.Ints(evens)

	//put odd numbers in descending order
	sort.Sort(sort.Reverse(sort.IntSlice(odds)))

	return append(evens, odds...)
}

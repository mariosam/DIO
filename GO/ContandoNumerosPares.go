/**
 * @version GO 1.19
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import (
	"strconv"
	"unsafe"
)

/**
 * Get a number and sum all even digits.
 */
func countEven(num int) int {
	count := 0

	for i := 1; i <= num; i++ {
		//controle para 1 digito
		if unsafe.Sizeof(i) == 1 {
			//se for par
			if i%2 == 0 {
				count++
			}
			continue
		}

		//controle para multiplos digitos
		multi := []rune(strconv.Itoa(i))
		var sum int64 = 0
		for x := 0; x < len(multi); x++ {
			temp, _ := strconv.ParseInt(string(multi[x]), 0, 64)

			sum += temp
		}

		//se for par
		if sum%2 == 0 {
			count++
		}
	}

	return count
}

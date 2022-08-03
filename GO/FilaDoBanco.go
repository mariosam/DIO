/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "sort"

/**
 * Count how many changes need to right the queue.
 */
func changingPlaces(ar []float64) int {
	result := 0
	//faz uma copia do array (sem usar a mesma referencia da memoria)
	var pwdOrder []float64
	for _, v := range ar {
		pwdOrder = append(pwdOrder, v)
	}
	//inverte a ordem do array
	sort.Sort(sort.Reverse(sort.Float64Slice(pwdOrder)))

	//verifica se alguem precisa trocar de lugar na fila
	for i := 0; i < len(ar); i++ {
		if ar[i] == pwdOrder[i] {
			result++
		}
	}

	return result
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import (
	"reflect"
	"testing"
)

func TestOrdenandoNumerosParesImpares(t *testing.T) {
	tables := []struct {
		inputs []int
		want   []int
	}{
		{[]int{4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98}, []int{4, 32, 34, 98, 654, 3456, 6789, 567, 543, 87}},
		//Test 2
		{[]int{10, 5, 6, 7}, []int{6, 10, 7, 5}},
	}

	for _, table := range tables {
		got := orderOddsEvenNumbers(table.inputs)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

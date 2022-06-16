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

func TestQuemPagaraConta(t *testing.T) {
	tables := []struct {
		inputs []int
		want   []int
	}{
		{[]int{3, 11, 7, 18}, []int{1, 1, 1, 0}},
		//Test 2
		{[]int{7, 1, 1, 3, 3, 1, 7, 99}, []int{1, 1, 1, 1, 1, 1, 1, 1}},
		//Test 3
		{[]int{6, 2, 2, 4, 8, 10, 128}, []int{0, 0, 0, 0, 0, 0, 0}},
	}

	for _, table := range tables {
		got := resultOfSum(table.inputs)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

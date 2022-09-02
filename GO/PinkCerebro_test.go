/**
 * @version GO 1.19
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import (
	"reflect"
	"testing"
)

func TestPinkCerebro(t *testing.T) {
	tables := []struct {
		ops  []int
		want []int
	}{
		{[]int{2, 5, 4, 20, 10}, []int{4, 0, 2, 3}},
		{[]int{100}, []int{1, 0, 1, 1}},
		{[]int{3, 4, 5}, []int{1, 1, 1, 1}},
	}

	for _, table := range tables {
		got := getMultiples(table.ops)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v to %v but the return was this: %v", table.want, table.ops, got)
		}
	}
}

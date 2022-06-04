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

func TestArraysPares(t *testing.T) {
	tables := []struct {
		inputs []int
		want   []int
	}{
		{[]int{2, 3, 5, 7, 11, 13, 18, 34}, []int{2, 18, 34}},
	}

	for _, table := range tables {
		got := returnOnlyEven(table.inputs)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

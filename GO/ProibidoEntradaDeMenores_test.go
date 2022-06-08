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

func TestProibidoEntradaDeMenores(t *testing.T) {
	tables := []struct {
		ops  []int
		want []int
	}{
		{[]int{4, 18, 22, 15, 50}, []int{4, 15}},
		{[]int{6, 54, 12, 30, 17, 8, 24}, []int{6, 12, 17, 8}},
		{[]int{18, 22, 15, 99}, []int{15}},
	}

	for _, table := range tables {
		got := forbidenUnder18(table.ops)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

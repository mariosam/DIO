/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestMacPronalts(t *testing.T) {
	tables := []struct {
		prods []int
		qtds  []int
		want  float64
	}{
		{[]int{1001, 1005}, []int{2, 3}, 19.50},
		{[]int{1003}, []int{500}, 1750.00},
		{[]int{1001, 1005, 1003, 1002, 1004}, []int{500, 300, 23, 52, 44}, 2808.50},
	}

	for _, table := range tables {
		got := shopValue(table.prods, table.qtds)

		if got != table.want {
			t.Errorf("Waiting for this %.2f but the return was this: %.2f", table.want, got)
		}
	}
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestDragaoBerradorWorld(t *testing.T) {
	tables := []struct {
		p1   []int
		p2   []int
		want int
	}{
		{[]int{8, 160, 182}, []int{160, 182, 183, 159, 250, 170, 172, 173}, 5},
		{[]int{5, 155, 176}, []int{149, 154, 172, 182, 167}, 2},
	}

	for _, table := range tables {
		got := numberOfGuests(table.p1, table.p2)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

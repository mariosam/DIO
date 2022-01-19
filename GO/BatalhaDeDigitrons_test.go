/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestBatalhaDeDigitrons(t *testing.T) {
	tables := []struct {
		x    int
		p1   []int
		p2   []int
		want string
	}{
		{5, []int{12, 23, 15}, []int{42, 12, 20}, "Guarte"},
		{2, []int{52, 1, 11}, []int{1, 52, 1}, "Empate"},
		{3, []int{95, 12, 22}, []int{5, 51, 21}, "Bruno"},
	}

	for _, table := range tables {
		got := winnerBattle(table.x, table.p1, table.p2)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestXadrez(t *testing.T) {
	tables := []struct {
		L    int
		C    int
		want int
	}{
		{8, 8, 1},
		{5, 91, 1},
		{6, 9, 0},
	}

	for _, table := range tables {
		got := tableColor(table.L, table.C)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestDama(t *testing.T) {
	tables := []struct {
		x1   float64
		y1   float64
		x2   float64
		y2   float64
		want int
	}{
		{4, 4, 6, 2, 1},
		{3, 5, 3, 5, 0},
		{5, 5, 4, 3, 2},
	}

	for _, table := range tables {
		got := minMoviments(table.x1, table.y1, table.x2, table.y2)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

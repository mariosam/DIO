/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import (
	"testing"
)

func TestPneu(t *testing.T) {
	tables := []struct {
		x    int
		y    int
		want int
	}{
		{30, 18, 12},
		{27, 27, 0},
		{27, 30, -3},
	}

	for _, table := range tables {
		got := difPression(table.x, table.y)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

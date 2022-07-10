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

func TestPatinhos(t *testing.T) {
	tables := []struct {
		x    int
		want int
	}{
		{0, 0},
		{1, 0},
		{10, 9},
	}

	for _, table := range tables {
		got := returnedDucks(table.x)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

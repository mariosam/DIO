/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestSomaImparesConsecutivos(t *testing.T) {
	tables := []struct {
		X    int
		Y    int
		want int
	}{
		{6, -5, 5},
		{15, 12, 13},
		{12, 12, 0},
		{1, 5, 3},
	}

	for _, table := range tables {
		got := oddsBetween(table.X, table.Y)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

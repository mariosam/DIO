/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestBlobs(t *testing.T) {
	tables := []struct {
		N    float64
		want int
	}{
		{40.0, 6},
		{200.0, 8},
		{300.0, 9},
	}

	for _, table := range tables {
		got := countDays(table.N)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

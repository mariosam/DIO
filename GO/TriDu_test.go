/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestTriDu(t *testing.T) {
	tables := []struct {
		A    int
		B    int
		want int64
	}{
		{10, 7, 10},
		{2, 2, 2},
	}

	for _, table := range tables {
		got := greatestCard(table.A, table.B)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

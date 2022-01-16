/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestFusoHorario(t *testing.T) {
	tables := []struct {
		S    int
		T    int
		F    int
		want int
	}{
		{10, 7, 3, 20},
		{22, 6, -2, 2},
		{0, 3, -4, 23},
	}

	for _, table := range tables {
		got := localTime(table.S, table.T, table.F)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

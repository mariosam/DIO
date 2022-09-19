/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestReduzindoUmNumeroZero(t *testing.T) {
	tables := []struct {
		num  int
		want int
	}{
		{14, 6},
		{8, 4},
	}

	for _, table := range tables {
		got := reduceNumber(table.num)

		if got != table.want {
			t.Errorf("Waiting for this %d to %d but the return was this: %d", table.want, table.num, got)
		}
	}
}

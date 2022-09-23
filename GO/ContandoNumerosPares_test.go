/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestContandoNumerosPares(t *testing.T) {
	tables := []struct {
		num  int
		want int
	}{
		{4, 2},
		{30, 14},
	}

	for _, table := range tables {
		got := countEven(table.num)

		if got != table.want {
			t.Errorf("Waiting for this %d to %d but the return was this: %d", table.want, table.num, got)
		}
	}
}

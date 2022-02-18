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

func TestFolhaDePagamento(t *testing.T) {
	tables := []struct {
		t    int
		v    float64
		want float64
	}{
		{100, 5.50, 550.00},
		{200, 20.50, 4100.00},
		{145, 15.55, 2254.75},
	}

	for _, table := range tables {
		got := calcSalary(table.t, table.v)

		if got != table.want {
			t.Errorf("Waiting for this %.2f but the return was this: %.2f", table.want, got)
		}
	}
}

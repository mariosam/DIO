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

func TestFrotaDeTaxi(t *testing.T) {
	tables := []struct {
		a    float64
		g    float64
		ra   float64
		rg   float64
		want string
	}{
		{1.20, 2.30, 10.00, 15.00, "A"},
		{1.00, 1.00, 9.00, 9.01, "G"},
		{1.00, 1.00, 11.00, 11.00, "G"},
	}

	for _, table := range tables {
		got := moreEconomic(table.a, table.g, table.ra, table.rg)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

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

func TestConsumoMedioDoAutomovel(t *testing.T) {
	tables := []struct {
		x    float64
		y    float64
		want float64
	}{
		{500, 35.00, 14.286},
		{2254, 124.4, 18.119},
		{4554, 464.6, 9.802},
	}

	for _, table := range tables {
		got := averageConsumption(table.x, table.y)

		if got != table.want {
			t.Errorf("Waiting for this %.3f but the return was this: %.3f", table.want, got)
		}
	}
}

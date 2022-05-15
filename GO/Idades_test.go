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

func TestIdades(t *testing.T) {
	tables := []struct {
		ages []float64
		want float64
	}{
		{[]float64{34, 56, 44, 23}, 39.25},
		{[]float64{28, 17, 41, 23, 34}, 28.60},
		{[]float64{24, 29, 48, 52}, 38.25},
		{[]float64{10, 2, 6, 54, 22, 89, 16, 25}, 28.00},
	}

	for _, table := range tables {
		got := calcAverage(table.ages)

		if got != table.want {
			t.Errorf("Waiting for this %.2f but the return was this: %.2f", table.want, got)
		}
	}
}

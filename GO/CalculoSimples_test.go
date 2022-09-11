/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestCalculoSimples(t *testing.T) {
	tables := []struct {
		pecas1 []float64
		pecas2 []float64
		want   float64
	}{
		{[]float64{12, 1, 5.30}, []float64{16, 2, 5.10}, 15.50},
		{[]float64{13, 2, 15.30}, []float64{161, 4, 5.20}, 51.40},
		{[]float64{1, 1, 15.10}, []float64{2, 1, 15.10}, 30.20},
	}

	for _, table := range tables {
		got := calcTotalToPay(table.pecas1, table.pecas2)

		if got != table.want {
			t.Errorf("Waiting for this %.2f but the return was this: %.2f", table.want, got)
			//t.Errorf("Waiting for this %2f to %2f but the return was this: %2f", table.want, table.pecas1[2], got)
		}
	}
}

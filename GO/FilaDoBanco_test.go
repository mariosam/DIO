/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestFilaDoBanco(t *testing.T) {
	tables := []struct {
		nums []float64
		want int
	}{
		{[]float64{100, 80, 90}, 1},
		{[]float64{100, 120, 30, 50}, 0},
		{[]float64{100, 90, 30, 25}, 4},
	}

	for _, table := range tables {
		got := changingPlaces(table.nums)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

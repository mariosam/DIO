/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestPapalegua(t *testing.T) {
	tables := []struct {
		nums []float64
		want float64
	}{
		{[]float64{9.81, 9.71}, 9.71},
		//Test 2
		{[]float64{9.82, 9.72, 9.92}, 9.72},
		//Test 3
		{[]float64{9.75, 9.55, 9.23}, 9.23},
		//Test 4
		{[]float64{9.82, 9.92, 9.1}, 9.10},
	}

	for _, table := range tables {
		got := theFaster(table.nums)

		if got != table.want {
			t.Errorf("Waiting for this %f but the return was this: %f", table.want, got)
		}
	}
}

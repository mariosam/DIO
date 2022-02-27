/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestQuantidadeNumerosPositivos(t *testing.T) {
	tables := []struct {
		nums []float32
		want int
	}{
		{[]float32{7, -5, 6, -3.4, 4.6, 12}, 4},
		{[]float32{70, 67, 77, 99, 23, 1}, 6},
	}

	for _, table := range tables {
		got := sumPositives(table.nums)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

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

func TestReservatorioDeMel(t *testing.T) {
	tables := []struct {
		v    float64
		d    float64
		want float64
	}{
		{1450.00, 25.00, 2.96},
		{760.00, 40.00, 0.61},
		{7500.00, 15.00, 42.46},
	}

	for _, table := range tables {
		got := getHigh(table.v, table.d)

		if got != table.want {
			t.Errorf("Waiting for this %.2f but the return was this: %.2f", table.want, got)
		}
	}

	tables2 := []struct {
		d    float64
		want float64
	}{
		{25.00, 490.62},
		{40.00, 1256.00},
		{15.00, 176.62},
	}

	for _, table := range tables2 {
		got := getArea(table.d)

		if got != table.want {
			t.Errorf("Waiting for this %.2f but the return was this: %.2f", table.want, got)
		}
	}
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestCoxinhaDeBueno(t *testing.T) {
	tables := []struct {
		h    float64
		p    float64
		want string
	}{
		{10, 90, "0.11"},
		{840, 11, "76.36"},
		{1, 50, "0.02"},
		{9, 90, "0.10"},
	}

	for _, table := range tables {
		got := calcCoxinha(table.h, table.p)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

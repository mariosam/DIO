/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestSomaSimples(t *testing.T) {
	tables := []struct {
		A    int
		B    int
		want int
	}{
		{30, 10, 40},
		{-30, 10, -20},
		{0, 0, 0},
	}

	for _, table := range tables {
		got := simpleSum(table.A, table.B)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

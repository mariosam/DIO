/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestDividindoXporY(t *testing.T) {
	tables := []struct {
		x    float64
		y    float64
		want string
	}{
		{3, -2, "-1.5"},
		{-8, 0, "divisao impossivel"},
		{0, -8, "-0.0"},
	}

	for _, table := range tables {
		got := divTwoValues(table.x, table.y)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

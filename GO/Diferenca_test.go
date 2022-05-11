/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestDiferenca(t *testing.T) {
	tables := []struct {
		A    int
		B    int
		C    int
		D    int
		want int
	}{
		{5, 6, 7, 8, -26},
		{0, 0, 7, 8, -56},
		{5, 6, -7, 8, 86},
	}

	for _, table := range tables {
		got := showDifference(table.A, table.B, table.C, table.D)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

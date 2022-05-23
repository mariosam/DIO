/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestSomaDeNumerosNaturais(t *testing.T) {
	tables := []struct {
		A    int
		B    int
		want int
	}{
		{1, 5, 15},
		{1, 1000, 500500},
	}

	for _, table := range tables {
		got := sumAllNaturals(table.A, table.B)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

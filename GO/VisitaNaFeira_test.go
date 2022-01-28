/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestVisitaNaFeira(t *testing.T) {
	tables := []struct {
		a    int
		b    int
		want int
	}{
		{11, 7, 18},
		{-11, 6, -5},
		{11, -2, 9},
	}

	for _, table := range tables {
		got := totalPeppers(table.a, table.b)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

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

func TestTesteDeSelecao1(t *testing.T) {
	tables := []struct {
		a    int
		b    int
		c    int
		d    int
		want string
	}{
		{5, 6, 7, 8, "Valores nao aceitos"},
		{2, 3, 2, 6, "Valores aceitos"},
	}

	for _, table := range tables {
		got := checkSequence(table.a, table.b, table.c, table.d)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

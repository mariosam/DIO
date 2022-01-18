/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestLanche(t *testing.T) {
	tables := []struct {
		cod  int
		qtd  int
		want float32
	}{
		{3, 2, 10.00},
		{4, 3, 6.00},
		{2, 3, 13.50},
	}

	for _, table := range tables {
		got := totalToPay(table.cod, table.qtd)

		if got != table.want {
			t.Errorf("Waiting for this %.2f but the return was this: %.2f", table.want, got)
		}
	}
}

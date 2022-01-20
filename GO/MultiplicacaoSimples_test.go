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

func TestMultiplicacaoSimples(t *testing.T) {
	tables := []struct {
		x    int
		y    int
		want int
	}{
		{3, 9, 27},
		{-30, 10, -300},
		{0, 9, 0},
	}

	for _, table := range tables {
		got := getMulti(table.x, table.y)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

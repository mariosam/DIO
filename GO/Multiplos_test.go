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

func TestMultiplos(t *testing.T) {
	tables := []struct {
		x    int
		y    int
		want string
	}{
		{6, 24, "Sao Multiplos"},
		{6, 25, "Nao sao Multiplos"},
	}

	for _, table := range tables {
		got := areTheyMulti(table.x, table.y)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

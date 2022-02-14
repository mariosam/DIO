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

func TestGuilhermeSuasPipas(t *testing.T) {
	tables := []struct {
		x    int
		want int
	}{
		{4, 2},
		{10, 35},
		{11, 44},
	}

	for _, table := range tables {
		got := numberOfTwine(table.x)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

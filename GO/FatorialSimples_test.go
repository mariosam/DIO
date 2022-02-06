/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestFatorialSimples(t *testing.T) {
	tables := []struct {
		N    int
		want int
	}{
		{4, 24},
		{6, 720},
		{1, 1},
	}

	for _, table := range tables {
		got := simpleFactorial(table.N)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

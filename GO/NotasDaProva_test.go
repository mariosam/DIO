/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestNotasDaProva(t *testing.T) {
	tables := []struct {
		top  int
		want string
	}{
		{12, "D"},
		{87, "A"},
		{0, "E"},
	}

	for _, table := range tables {
		got := takeResult(table.top)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

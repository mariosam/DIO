/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestParOuImpar(t *testing.T) {
	tables := []struct {
		x    int
		want string
	}{
		{-5, "ODD NEGATIVE"},
		{0, "NULL"},
		{3, "ODD POSITIVE"},
		{-4, "EVEN NEGATIVE"},
	}

	for _, table := range tables {
		got := typeNumberMsg(table.x)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestTopN(t *testing.T) {
	tables := []struct {
		top  int
		want string
	}{
		{7, "Top 10"},
		{25, "Top 25"},
		{26, "Top 50"},
	}

	for _, table := range tables {
		got := topRange(table.top)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

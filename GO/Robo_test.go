/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestRobo(t *testing.T) {
	tables := []struct {
		in   string
		want bool
	}{
		{"WS", true},
		{"AA", false},
	}

	for _, table := range tables {
		got := originPosition(table.in)

		if got != table.want {
			t.Errorf("Waiting for this %t to %s but the return was this: %t", table.want, table.in, got)
		}
	}
}

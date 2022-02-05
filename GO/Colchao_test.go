/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestColchao(t *testing.T) {
	tables := []struct {
		A    int
		B    int
		C    int
		H    int
		L    int
		want string
	}{
		{25, 120, 220, 200, 100, "S"},
		{25, 205, 220, 200, 100, "N"},
		{25, 200, 220, 200, 100, "S"},
	}

	for _, table := range tables {
		got := checkSize(table.A, table.B, table.C, table.H, table.L)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

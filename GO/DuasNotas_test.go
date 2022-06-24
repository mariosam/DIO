/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestDuasNotas(t *testing.T) {
	tables := []struct {
		x    int64
		y    int64
		want string
	}{
		{11, 23, "possible"},
		{500, 650, "possible"},
		{100, 600, "impossible"},
		{9948, 9963, "possible"},
		{1, 2, "impossible"},
		{2, 4, "impossible"},
	}

	for _, table := range tables {
		got := hasTwoNotesChange(table.x, table.y)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

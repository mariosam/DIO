/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestTempoDoDobby(t *testing.T) {
	tables := []struct {
		n    int
		a    int
		b    int
		want string
	}{
		{20, 15, 6, "Deixa para amanha!"},
		{20, 10, 10, "Farei hoje!"},
	}

	for _, table := range tables {
		got := todayOrTomorrow(table.n, table.a, table.b)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

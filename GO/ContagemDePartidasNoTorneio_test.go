/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestContagemDePartidasNoTorneio(t *testing.T) {
	tables := []struct {
		teams int
		want  int
	}{
		{7, 6},
		{14, 13},
	}

	for _, table := range tables {
		got := numberOfGames(table.teams)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

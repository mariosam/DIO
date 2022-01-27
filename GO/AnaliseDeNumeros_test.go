/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestAndandoNoTempo(t *testing.T) {
	tables := []struct {
		a    int
		b    int
		c    int
		want string
	}{
		{22, 5, 22, "S"},
		{31, 110, 79, "S"},
		{45, 8, 7, "N"},
	}

	for _, table := range tables {
		got := possibleTravel(table.a, table.b, table.c)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

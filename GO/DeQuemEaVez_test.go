/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import (
	"testing"
)

func TestDeQuemEaVez(t *testing.T) {
	tables := []struct {
		ops  []string
		want string
	}{
		{[]string{"Quico", "PAR", "Chiquinha", "IMPAR", "9", "7"}, "Quico"},
		{[]string{"Dami", "PAR", "Marcus", "IMPAR", "12", "3"}, "Marcus"},
		{[]string{"Dayran", "PAR", "Conrado", "IMPAR", "3", "1000000000"}, "Conrado"},
		{[]string{"Popis", "PAR", "Chaves", "IMPAR", "2", "7"}, "Chaves"},
	}

	for _, table := range tables {
		got := evenOrOdd(table.ops)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

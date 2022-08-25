/**
 * @version GO 1.19
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import (
	"testing"
)

func TestPedraPapelTesouraLagartoSpock(t *testing.T) {
	tables := []struct {
		p1   string
		p2   string
		want string
	}{
		//Test 1
		{"spock", "spock", "empate"},
		//Test 2
		{"tesoura", "spock", "Marcia"},
		//Test 3
		{"lagarto", "spock", "Fernanda"},
	}

	for _, table := range tables {
		got := jokenpoSpock(table.p1, table.p2)

		if got != table.want {
			t.Errorf("Waiting for this %s to %s but the return was this: %s", table.want, table.p1, got)
		}
	}
}

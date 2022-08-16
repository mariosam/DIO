/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestEncontreMaiorSubstring(t *testing.T) {
	tables := []struct {
		w1   string
		w2   string
		want int
	}{
		{"abcdef", "cdofhij", 2},
		{"TWO", "FOUR", 1},
		{"abracadabra", "open", 0},
		{"Hey This java is hot", "Java is a new paradigm", 7},
	}

	for _, table := range tables {
		got := findTheBiggestSubstring(table.w1, table.w2)

		if got != table.want {
			t.Errorf("Waiting for this %.d but the return was this: %.d", table.want, got)
		}
	}
}

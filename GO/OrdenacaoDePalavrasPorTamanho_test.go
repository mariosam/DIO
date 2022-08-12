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

func TestOrdenacaoDePalavrasPorTamanho(t *testing.T) {
	tables := []struct {
		word string
		want string
	}{
		{"One three four mond at midnight", "midnight three four mond One at"},
		{"one three five", "three five one"},
	}

	for _, table := range tables {
		got := orderWordsBySize(table.word)

		if got != table.want {
			t.Errorf("Waiting for this: %s - but the return was this: %s", table.want, got)
		}
	}
}

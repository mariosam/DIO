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

func TestNomeNoFormulario(t *testing.T) {
	tables := []struct {
		name string
		want string
	}{
		{"Fulano de Tal", "YES"},
		{"Pedro de Alcantara Francisco Antonio Joao Carlos Xavier de Paula Miguel Rafael Joaquim Jose Gonzaga Pascoal Cipriano Serafim", "NO"},
	}

	for _, table := range tables {
		got := checkNameSize(table.name)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

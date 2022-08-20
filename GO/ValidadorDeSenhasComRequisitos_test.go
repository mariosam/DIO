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

func TestValidadorDeSenhasComRequisitos(t *testing.T) {
	tables := []struct {
		pass string
		want string
	}{
		//Test 1
		{"Digital Innovation One", "Senha invalida."},
		//Test 2
		{"AbcdEfgh99", "Senha valida."},
		//Test 3
		{"DigitalInnovationOne123", "Senha valida."},
		//Test 4
		{"Digital Innovation One 123", "Senha invalida."},
		//Test 5
		{"Aass9", "Senha invalida."},
		//Test 6
		{"Aassd9", "Senha valida."},
		//Test 7
		{"Aa@ssd9!", "Senha invalida."},
		//Test 8
		{"DIO123456", "Senha invalida."},
		//Test 9
		{"Ano2020", "Senha valida."},
		//Test 10
		{"Digita!123", "Senha invalida."},
	}

	for _, table := range tables {
		got := passwordValidator(table.pass)

		if got != table.want {
			t.Errorf("Waiting for this %s to %s but the return was this: %s", table.want, table.pass, got)
		}
	}
}

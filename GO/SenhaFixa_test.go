/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestSenhaFixa(t *testing.T) {
	tables := []struct {
		pass int
		want string
	}{
		{2200, "Senha Invalida"},
		{1020, "Senha Invalida"},
		{2022, "Senha Invalida"},
		{2002, "Acesso Permitido"},
	}

	for _, table := range tables {
		got := checkPass(table.pass)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

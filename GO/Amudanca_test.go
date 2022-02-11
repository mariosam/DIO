/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestAmudanca(t *testing.T) {
	tables := []struct {
		cod  int
		want string
	}{
		{0, "Bom Dia!!"},
		{45, "Bom Dia!!"},
		{360, "Bom Dia!!"},
		{90, "Boa Tarde!!"},
		{180, "Boa Noite!!"},
	}

	for _, table := range tables {
		got := salutation(table.cod)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

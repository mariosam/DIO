/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestDDD(t *testing.T) {
	tables := []struct {
		cod  int
		want string
	}{
		{11, "Sao Paulo"},
		{13, "DDD nao cadastrado"},
	}

	for _, table := range tables {
		got := dddCity(table.cod)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

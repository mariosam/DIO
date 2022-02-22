/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestNossosDiasNuncaVoltarao(t *testing.T) {
	tables := []struct {
		pos  int
		want string
	}{
		{1, "L"},
		{3, "LIF"},
		{7, "LIFE IS"},
	}

	for _, table := range tables {
		got := cutWord(table.pos)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestDragao(t *testing.T) {
	tables := []struct {
		energy int
		want   string
	}{
		{8001, "Mais de 8000!"},
		{100, "Inseto!"},
		{200, "Inseto!"},
	}

	for _, table := range tables {
		got := checkEnergyLevel(table.energy)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestFasesDaLua(t *testing.T) {
	tables := []struct {
		day1 int
		day2 int
		want string
	}{
		{0, 2, "nova"},
		{2, 3, "crescente"},
		{99, 97, "cheia"},
		{97, 94, "minguante"},
		{30, 35, "crescente"},
	}

	for _, table := range tables {
		got := moonFase(table.day1, table.day2)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

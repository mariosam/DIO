/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestDistanciaEntreDoisPontos(t *testing.T) {
	tables := []struct {
		x1   float64
		x2   float64
		y1   float64
		y2   float64
		want string
	}{
		{1.0, 7.0, 5.0, 9.0, "4.4721"},
		{-2.5, 0.4, 12.1, 7.3, "16.1484"},
		{2.5, -0.4, -12.2, 7.0, "16.4575"},
	}

	for _, table := range tables {
		got := getDistance(table.x1, table.x2, table.y1, table.y2)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

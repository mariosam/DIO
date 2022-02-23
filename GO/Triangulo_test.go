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

func TestTriangulo(t *testing.T) {
	tables := []struct {
		a    float64
		b    float64
		c    float64
		want string
	}{
		{6.0, 4.0, 2.0, "Area = 10.0"},
		{6.0, 4.0, 2.1, "Perimetro = 12.1"},
	}

	for _, table := range tables {
		got := calcArea(table.a, table.b, table.c)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

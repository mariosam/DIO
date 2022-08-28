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

func TestDistancia(t *testing.T) {
	tables := []struct {
		km    int
		speed int
		want  int
	}{
		//Test 1
		{30, 2, 60},
		//Test 2
		{110, 2, 220},
	}

	for _, table := range tables {
		got := reportMinutes(table.km, table.speed)

		if got != table.want {
			t.Errorf("Waiting for this %d to %d but the return was this: %d", table.want, table.km, got)
		}
	}
}

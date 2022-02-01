/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestTomadas(t *testing.T) {
	tables := []struct {
		t1   int
		t2   int
		t3   int
		t4   int
		want int
	}{
		{2, 4, 3, 2, 8},
		{6, 6, 6, 6, 21},
		{2, 2, 2, 2, 5},
	}

	for _, table := range tables {
		got := maxDevices(table.t1, table.t2, table.t3, table.t4)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

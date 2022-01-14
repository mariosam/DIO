/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestTrigoNoTabuleiro(t *testing.T) {
	tables := []struct {
		X    int
		want int64
	}{
		{0, 0},
		{8, 0},
		{16, 5},
		{24, 1398},
		{32, 357913},
		{40, 91625968},
		{48, 23456248059},
		{56, 6004799503160},
		//{64, 1537228672809129},
	}

	for _, table := range tables {
		got := cornToReceive(table.X)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

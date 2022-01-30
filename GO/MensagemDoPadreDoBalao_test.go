/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestMensagemDoPadreDoBalao(t *testing.T) {
	tables := []struct {
		a    string
		nums []int
		want string
	}{
		{"ABCDEFGHIJKLMNOPQRSTUVWXYZ", []int{8, 5, 12, 16}, "HELP"},
		{"QWERTYUIOPASDFGHJKLZXCVBNM", []int{16, 3, 19, 19, 9, 2, 9, 4, 19, 13}, "HELLOWORLD"},
		{"ABCDEFGHIJKLMNOPQRSTUVWXYZ", []int{16, 18, 15, 7, 18, 1, 13, 13, 5, 18}, "PROGRAMMER"},
	}

	for _, table := range tables {
		got := decodeMsg(table.a, table.nums)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

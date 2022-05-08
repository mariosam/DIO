/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestOEscolhido(t *testing.T) {
	tables := []struct {
		inputs []string
		want   string
	}{
		{[]string{"1000 5", "1001 10", "1002 6"}, "1001"},
		{[]string{"900775 5.7", "201553 7.9", "5032 6.2", "2088 2.1"}, "Minimum note not reached"},
	}

	for _, table := range tables {
		got := checkingHighestNote(table.inputs)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

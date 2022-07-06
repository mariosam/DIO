/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestReveillonDeCopacabana(t *testing.T) {
	tables := []struct {
		N    int
		want int
	}{
		{13, 25},
		{37, 73},
		{49, 97},
		{11, 21},
		{9, 17},
		{5, 9},
		{17, 33},
	}

	for _, table := range tables {
		got := howManyOrdersPerPeople(table.N)

		if got != table.want {
			t.Errorf("Waiting for this %d but the return was this: %d", table.want, got)
		}
	}
}

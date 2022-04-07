/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import (
	"reflect"
	"testing"
)

func TestExibindoNumerosPares(t *testing.T) {
	tables := []struct {
		N    int
		want []int
	}{
		{6, []int{2, 4, 6}},
		{13, []int{2, 4, 6, 8, 10, 12}},
	}

	for _, table := range tables {
		got := countEve(table.N)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

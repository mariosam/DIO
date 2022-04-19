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

func TestIdadeEmDias(t *testing.T) {
	tables := []struct {
		days int
		want []int
	}{
		{400, []int{1, 1, 5}},
		{800, []int{2, 2, 10}},
		{30, []int{0, 1, 0}},
	}

	for _, table := range tables {
		got := splitAgeDays(table.days)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

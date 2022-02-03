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

func TestContagemDeCedulas(t *testing.T) {
	tables := []struct {
		valor int
		want  []int
	}{
		{576, []int{5, 1, 1, 0, 1, 0, 1}},
		{11257, []int{112, 1, 0, 0, 1, 1, 0}},
		{503, []int{5, 0, 0, 0, 0, 1, 1}},
	}

	for _, table := range tables {
		got := countNotes(table.valor)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

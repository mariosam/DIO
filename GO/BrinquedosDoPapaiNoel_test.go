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

func TestBrinquedosDoPapaiNoel(t *testing.T) {
	tables := []struct {
		inputs []string
		want   []int
	}{
		{[]string{"Milena F", "Joao M", "Rafaela F", "Renata F", "Felipe M"}, []int{2, 3}},
	}

	for _, table := range tables {
		got := howManyToys(table.inputs)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

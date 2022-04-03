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

func TestTeoremaDaDivisaoEuclidiana(t *testing.T) {
	tables := []struct {
		A    int
		B    int
		want []int
	}{
		{7, 3, []int{2, 1}},
		{7, -3, []int{-2, 1}},
		{-7, -3, []int{3, 2}},
	}

	for _, table := range tables {
		got := getQuoAndRest(table.A, table.B)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

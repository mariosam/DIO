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

func TestComprasNoSupermercado(t *testing.T) {
	tables := []struct {
		ops  []string
		want []string
	}{
		{[]string{"carne", "laranja", "suco", "picles", "laranja", "picles"}, []string{"carne", "laranja", "picles", "suco"}},
		{[]string{"laranja", "pera", "laranja", "pera", "pera"}, []string{"laranja", "pera"}},
	}

	for _, table := range tables {
		got := checkMyList(table.ops)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

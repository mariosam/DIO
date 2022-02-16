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

func TestAmudancaContinua(t *testing.T) {
	tables := []struct {
		cod  float64
		want []string
	}{
		{1.50, []string{"Bom Dia!!", "06", "06", "00"}},
		{95.5, []string{"Boa Tarde!!", "12", "22", "00"}},
		{187.5, []string{"Boa Noite!!", "18", "30", "00"}},
		{279.5, []string{"De Madrugada!!", "00", "38", "00"}},
	}

	for _, table := range tables {
		got := salutationTime(table.cod)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

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

func TestProgramaValidacaoDeNotas(t *testing.T) {
	tables := []struct {
		ops  []string
		want []string
	}{
		{[]string{"-3.5", "3.5", "11.0", "10.0", "4", "1", "8.0", "9.0", "2", "7.0"}, []string{"nota invalida", "nota invalida", "media = 6.75", "novo calculo (1-sim 2-nao)", "novo calculo (1-sim 2-nao)", "media = 8.50", "novo calculo (1-sim 2-nao)"}},
	}

	for _, table := range tables {
		got := startSystem(table.ops)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

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

func TestUniformesDeFinalDeAno(t *testing.T) {
	tables := []struct {
		inputs []string
		want   []string
	}{
		{[]string{"Maria Joao", "branco P", "Marcio Guess", "vermelho P", "Maria Jose", "branco P"}, []string{"branco P Maria Joao", "branco P Maria Jose", "vermelho P Marcio Guess"}},
		//Test 2
		{[]string{"Maria Jose", "branco P", "Mangojata Mancuda", "vermelho P", "Cezar Torres Mo", "branco P", "Baka Lhau", "vermelho P", "JuJu Mentina", "branco M", "Amaro Dinha", "vermelho P", "Adabi Finho", "branco G", "Severina Rigudinha", "branco G", "Carlos Chade Losna", "vermelho P"}, []string{"branco P Cezar Torres Mo", "branco P Maria Jose", "branco M JuJu Mentina", "branco G Adabi Finho", "branco G Severina Rigudinha", "vermelho P Amaro Dinha", "vermelho P Baka Lhau", "vermelho P Carlos Chade Losna", "vermelho P Mangojata Mancuda"}},
	}

	for _, table := range tables {
		got := uniformsInOrder(table.inputs)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

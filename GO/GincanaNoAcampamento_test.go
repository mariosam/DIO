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

func TestGincanaNoAcampamento(t *testing.T) {
	tables := []struct {
		inputs [][]string
		want   string
	}{
		{[][]string{{"Fernanda", "7"}, {"Fernando", "9"}, {"Gustavo", "11"}}, "Fernanda"},
		//Test 2
		{[][]string{{"Maria", "7"}, {"Pedro", "9"}, {"Joao_Vitor", "5"}, {"Isabel", "12"}, {"Laura", "8"}}, "Pedro"},
		//Test 3
		{[][]string{{"Maria", "4"}, {"Pedro", "3"}, {"Joao", "2"}}, "Pedro"},
	}

	for _, table := range tables {
		got := winnerOfScavengerGame(table.inputs)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %v but the return was this: %v", table.want, got)
		}
	}
}

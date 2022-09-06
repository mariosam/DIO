/**
 * @version GO 1.19
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import (
	"reflect"
	"testing"
)

func TestEntradaSaidaLendoPulandoNomes(t *testing.T) {
	tables := []struct {
		ops  []string
		want []string
	}{
		{[]string{"USP", "UFPE", "UFCG", "UFRN", "UFRJ", "IME", "ITA", "UNIOESTE", "URI", "UFG"}, []string{"UFCG", "ITA", "URI"}},
		{[]string{"UnB", "UFMG", "UNIFEI", "UECE", "UNICAMP", "INATEL", "UFRGS", "UNIFESO", "UFU", "PUC"}, []string{"UNIFEI", "UFRGS", "UFU"}},
	}

	for _, table := range tables {
		got := giveMe379(table.ops)

		if !reflect.DeepEqual(got, table.want) {
			t.Errorf("Waiting for this %s to %s but the return was this: %s", table.want, table.ops, got)
		}
	}
}

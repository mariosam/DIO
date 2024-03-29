/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestPreenchimentoDeVetor2(t *testing.T) {
	tables := []struct {
		X int
	}{
		{2},
		{20},
	}

	for _, table := range tables {
		printAllVector2(table.X)
	}
}

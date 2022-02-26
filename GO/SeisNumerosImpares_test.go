/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestSeisNumerosImpares(t *testing.T) {
	tables := []struct {
		X int
	}{
		{8},
		{7},
	}

	for _, table := range tables {
		printSixOdd(table.X)
	}
}

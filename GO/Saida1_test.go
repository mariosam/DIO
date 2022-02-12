/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import "testing"

func TestSaida1(t *testing.T) {
	tables := []struct {
		n1 string
		n2 string
	}{
		{"-", "-"},
		{"|", " "},
		{"-", "-"},
	}

	for _, table := range tables {
		printBox(table.n1, table.n2)
	}
}

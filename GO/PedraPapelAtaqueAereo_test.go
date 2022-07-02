/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ go test
 */
package GO

import (
	"testing"
)

func TestPedraPapelAtaqueAereo(t *testing.T) {
	tables := []struct {
		p1   string
		p2   string
		want string
	}{
		//Test 1
		{"pedra", "pedra", "Sem ganhador"},
		//Test 2
		{"ataque", "papel", "Jogador 1 venceu"},
		//Test 3
		{"Ataque", "Pedra", "Jogador 1 venceu"},
		//Test 4
		{"Pedra", "Ataque", "Jogador 2 venceu"},
		//Test 5
		{"Pedra", "Papel", "Jogador 1 venceu"},
		//Test 6
		{"Papel", "Pedra", "Jogador 2 venceu"},
		//Test 7
		{"Ataque", "Papel", "Jogador 1 venceu"},
		//Test 8
		{"Papel", "Ataque", "Jogador 2 venceu"},
		//Test 9
		{"Papel", "Papel", "Ambos venceram"},
		//Test 10
		{"Pedra", "Pedra", "Sem ganhador"},
		//Test 11
		{"Ataque", "Ataque", "Aniquilacao mutua"},
	}

	for _, table := range tables {
		got := jokenpoWinner(table.p1, table.p2)

		if got != table.want {
			t.Errorf("Waiting for this %s but the return was this: %s", table.want, got)
		}
	}
}

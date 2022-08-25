/**
 * @version GO 1.19
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

const EMPATES = "empate"
const MARCIA = "Marcia"
const FERNANDA = "Fernanda"

var dicionario = map[string][]string{
	"pedra":   {"tesoura", "lagarto"},
	"papel":   {"pedra", "spock"},
	"tesoura": {"papel", "lagarto"},
	"lagarto": {"spock", "papel"},
	"spock":   {"pedra", "tesoura"},
}

/**
 * Check who is the winner of the game Jokenpo Spock.
 */
func jokenpoSpock(p1 string, p2 string) string {
	result := EMPATES

	if p1 == dicionario[p2][0] || p1 == dicionario[p2][1] {
		result = MARCIA
	} else if p2 == dicionario[p1][0] || p2 == dicionario[p1][1] {
		result = FERNANDA
	}

	return result
}

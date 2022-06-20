/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "strconv"

/**
 * Identify whos won the game Even or Odd.
 */
func evenOrOdd(ops []string) string {
	//player 1 and player 2: valores somados
	n1, _ := strconv.Atoi(ops[4])
	n2, _ := strconv.Atoi(ops[5])
	sum := n1 + n2

	winner := ops[0]

	//se for PAR, verifica quem escolheu par
	if sum%2 == 0 {
		if ops[3] == "PAR" {
			winner = ops[2]
		}
	} else {
		//se for impar, verifica quem escolheu impar
		if ops[3] == "IMPAR" {
			winner = ops[2]
		}
	}

	return winner
}

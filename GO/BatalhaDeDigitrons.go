/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

const EMPATE = "Empate"
const GUARTE = "Guarte"
const BRUNO = "Bruno"

/**
 * Sum attacks defenses bonus and pick a winner.
 */
func winnerBattle(B int, P1 []int, P2 []int) string {
	result := EMPATE

	//dont need these vars, it is just to you read the logic easyst.
	Ai1 := P1[0]
	Ai2 := P2[0]
	Di1 := P1[1]
	Di2 := P2[1]
	Li1 := P1[2]
	Li2 := P2[2]

	bonus := 0
	if Li1%2 == 0 {
		bonus = B
	}
	Points1 := ((Ai1 + Di1) / 2) + bonus

	bonus = 0
	if Li2%2 == 0 {
		bonus = B
	}
	Points2 := ((Ai2 + Di2) / 2) + bonus

	if Points1 > Points2 {
		result = BRUNO
	} else if Points1 < Points2 {
		result = GUARTE
	}

	return result
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

/**
 * Based on the number of teams, returns the number of games.
 */
func numberOfGames(teams int) int {
	games := 0

	for teams > 1 {
		if teams%2 == 0 {
			teams = teams / 2
			games += teams
		} else {
			teams = (teams - 1) / 2
			games += teams
			teams++
		}
	}

	return games
}

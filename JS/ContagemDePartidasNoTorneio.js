/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let teams = parseInt( gets() );

console.log( numberOfGames( teams ) );

/**
 * Based on the number of teams, returns the number of games.
 */
function numberOfGames( teams = 0 ) {
    let games = 0;

    while ( teams > 1 ) {
        if ( teams%2 == 0 ) {
            teams = teams/2; 
            games += teams;
        } else {
            teams = (teams-1)/2;
            games += teams;
            teams++;
        }
    }

    return games;
}
module.exports = {numberOfGames}

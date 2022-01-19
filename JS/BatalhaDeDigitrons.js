/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+winnerBattle(5, {12, 23, 15}, {42, 12, 20}));

const EMPATE = "Empate";
const GUARTE = "Guarte";
const BRUNO  = "Bruno";

/**
 * Sum attacks defenses bonus and pick a winner.
 */
function winnerBattle(B, P1, P2) {
    let result = EMPATE;

    //dont need these vars, it is just to you read the logic easyst.
    let Ai1 = P1[0];
    let Ai2 = P2[0];
    let Di1 = P1[1];
    let Di2 = P2[1];
    let Li1 = P1[2];
    let Li2 = P2[2];

    let Points1 = ( (Ai1+Di1)/2 ) + (Li1 % 2 == 0 ? B : 0);
    let Points2 = ( (Ai2+Di2)/2 ) + (Li2 % 2 == 0 ? B : 0);

    if ( Points1 > Points2 ) result = BRUNO;
    else if ( Points1 < Points2 ) result = GUARTE;

    return result;
}
module.exports = {winnerBattle}

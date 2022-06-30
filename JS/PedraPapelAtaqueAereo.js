/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const ATAQUE = "ataque";
const PAPEL = "papel";
const PEDRA = "pedra";
const P1_WIN = "Jogador 1 venceu";
const P2_WIN = "Jogador 2 venceu";
const BOTH_WIN = "Ambos venceram";
const NO_WINNER = "Sem ganhador";
const ANIQUILATION = "Aniquilacao mutua";

let N = parseInt(gets());

for ( let i=0; i < N; i++ ) {
    let p1 = gets();
    let p2 = gets();

    console.log( jokenpoWinner(p1, p2) );
}

/**
 * Check who is the winner of the game Jokenpo.
 */
function jokenpoWinner(p1 = "", p2 = "") {
    let result = P2_WIN;
    p1 = p1.toLowerCase();
    p2 = p2.toLowerCase();
    
    if ( p1 === ATAQUE && p2 === ATAQUE ) {
        result = ANIQUILATION;
    } else if ( p1 === PEDRA && p2 === PEDRA ) {
        result = NO_WINNER;
    } else if ( p1 === PAPEL && p2 === PAPEL ) {
        result = BOTH_WIN;
    } else if ( p1 === ATAQUE && p2 === PEDRA || p2 === PAPEL ) {
        result = P1_WIN;
    } else if ( p1 === PEDRA && p2 === PAPEL ) {
        result = P1_WIN;
    }

    return result;
}
module.exports = {jokenpoWinner}

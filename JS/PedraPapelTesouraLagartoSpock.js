/**
 * @version JAVASCRIPT (ES6)
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const EMPATE = "empate";
const MARCIA = "Marcia";
const FERNANDA = "Fernanda";

let dicionario = {
    "pedra": ["tesoura", "lagarto"],
    "papel": ["pedra", "spock"],
    "tesoura": ["papel", "lagarto"],
    "lagarto": ["spock", "papel"],
    "spock": ["pedra", "tesoura"]
}

let N = parseInt(gets());

for ( let i=0; i < N; i++ ) {
    let line = gets().split(" ");

    console.log( jokenpoSpock(line[0], line[1]) );
}

/**
 * Check who is the winner of the game Jokenpo Spock.
 */
function jokenpoSpock(p1 = "", p2 = "") {
    let result = EMPATE;
    
    if (dicionario[p1].includes(p2)) {
        result = FERNANDA;
    } else if (dicionario[p2].includes(p1)) {
        result = MARCIA;
    }

    return result;
}
module.exports = {jokenpoSpock}

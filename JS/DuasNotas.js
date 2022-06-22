/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const POSSIVEL = "possible";
const IMPOSSIVEL = "impossible";
const NOTAS = [2, 5, 10, 20, 50, 100];

let N1 = parseInt(gets());
let N2 = parseInt(gets());

console.log( hasTwoNotesChange( N1, N2 ) );

/**
 * Check if is possible (or impossible) to give two notes change.
 */
function hasTwoNotesChange(x = 0, y = 0) {
    let result = IMPOSSIVEL;
    let change = y - x;

    for (let i = 0; i < NOTAS.length; i++) {
        for (let j = 0; j < NOTAS.length; j++) {
            if (NOTAS[i] + NOTAS[j] === change) {
                result = POSSIVEL;
                break;
            }
        }
    }

    return result;
}
module.exports = {hasTwoNotesChange}

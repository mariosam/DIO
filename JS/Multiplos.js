/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const SIM = "Sao Multiplos";
const NAO = "Nao sao Multiplos";

let lines = gets().split("\n");

let line = lines.shift().split(" ");
let A = parseInt(line[0]);
let B = parseInt(line[1]);

print( areTheyMulti(A, B) );

/**
 * Multiply two numbers.
 */
function areTheyMulti(x, y) {
    let result = NAO;

    if ( x%y == 0 || y%x == 0 ) result = SIM;

    return result;
}
module.exports = {areTheyMulti}

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const A  = "A";
const B  = "B";
const C  = "C";
const D  = "D";
const E  = "E";

let lines = gets().split('\n');
let nota = parseInt(lines.shift());

print( takeResult(nota) );

/**
 * Identify the final score points.
 */
function takeResult(pos) {
    let result = E;

    if ( pos > 85 ) {
        result = A;
    } else if ( pos > 60 ) {
        result = B;
    } else if ( pos > 35 ) {
        result = C;
    } else if ( pos > 0 ) {
        result = D;
    }

    return result;
}
module.exports = {takeResult}

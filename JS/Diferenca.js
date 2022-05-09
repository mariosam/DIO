/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let A = parseInt( gets() );
let B = parseInt( gets() );
let C = parseInt( gets() );
let D = parseInt( gets() );

console.log( `DIFERENCA = ${showDifference(A, B, C, D)}` );

/**
 * Do the Math to show the difference between the numbers.
 */
function showDifference(A, B, C, D) {
    return (A * B) - (C * D);
}
module.exports = {showDifference}

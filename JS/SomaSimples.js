/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let A = parseInt(gets());
let B = parseInt(gets());

console.log( "SOMA = "+simpleSum(A, B) );

/**
 * Do the math: SUM two values.
 */
function simpleSum(a = 0, b = 0) {
    return parseInt(a) + parseInt(b);
}
module.exports = {simpleSum}

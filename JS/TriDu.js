/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let line = gets().split(' ');
let A = parseInt(line[0]);
let B = parseInt(line[1]);

console.log( greatestCard(A, B) );

/**
 * Check what it is the greatest card.
 */
function greatestCard(A = 0, B = 0) {
    let result = A;

    if (B > A) {
        result = B;
    }

    return result;
}
module.exports = {greatestCard}

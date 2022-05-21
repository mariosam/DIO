/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let A = parseInt(gets());
let B = parseInt(gets());

console.log( sumAllNaturals(A, B) );

/**
 * Sum all natural numbers from A to B
 */
function sumAllNaturals(a = 0, b = 0) {
    return (b - a + 1) * (a + b)/2;
}
module.exports = {sumAllNaturals}

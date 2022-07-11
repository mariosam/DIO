/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let lines = gets().split(" ");
var a = parseInt(lines[0]);
var b = parseInt(lines[1]);

print( "X = " + totalPeppers(a, b) );

/**
 * Calculate the numbers of peppers.
 */
function totalPeppers(a, b) {
    return a + b;
}
module.exports = {totalPeppers}

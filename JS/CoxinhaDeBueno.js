/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let line = gets().split(" ");
 
console.log( calcCoxinha( parseInt(line[0]), parseInt(line[1]) ) );

/**
 * Do the math: DIV two values.
 */
function calcCoxinha(h = 0, p = 0) {
    return parseFloat(h / p).toFixed(2);
}
module.exports = {calcCoxinha}

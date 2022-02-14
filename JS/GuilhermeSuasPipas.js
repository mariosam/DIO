/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let lines = gets().split("\n");
let N = parseInt(lines.shift());

print( numberOfTwine(N) );

/**
 * Realize how much twine is necessary.
 */
 function numberOfTwine(n) {
    return ((n * n) - (3 * n)) /2;
}
module.exports = {numberOfTwine}

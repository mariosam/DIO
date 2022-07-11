/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

var a = parseInt(gets());
var b = parseInt(gets());

print( "PROD = " + getMulti(a, b) );

/**
 * Multiply two numbers.
 */
function getMulti(x, y) {
    return x * y;
}
module.exports = {getMulti}

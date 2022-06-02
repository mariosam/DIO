/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

var array = [ 2, 3, 5, 7, 11, 13, 18, 34 ];

array = returnOnlyEven( array );
array.forEach(function (num) {
    console.log( num );
});

/**
 * Return only even numbers from an array.
 */
function returnOnlyEven(inputs = []) {
    return inputs.filter(item => item % 2 === 0)
}
module.exports = {returnOnlyEven}

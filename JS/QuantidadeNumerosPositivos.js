/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+sumPositives([4, 4, 6, 2]));

/**
 * Count positives numbers.
 */
function sumPositives(ar) {
    let result = 0;

    ar.forEach(function (num, i, array) {
        if ( num > 0 ) result++;
    });

    return result;
}
module.exports = {sumPositives}

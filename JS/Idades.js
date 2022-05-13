/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+calcAverage([34, 56, 44, 23]));

/**
 * Calculate and return the average of ages.
 */
function calcAverage( ages = [] ) {
    let result = 0;

    for (let i = 0; i < ages.length; i++) {
        result += ages[i];
    }

    return result / ages.length;
}
module.exports = {calcAverage}

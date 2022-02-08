/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

/*
console.log( oddsBetween(x, y) );
*/

/**
 * How many odds do we have between two numbers.
 */
function oddsBetween(X, Y) {
    let result = 0;

    if ( X < Y ) {
        for (let i=X+1; i<Y; i++) {
            if (i % 2 != 0) {
                result += i;
            }
        }
    } else {
        for (let i=Y+1; i<X; i++) {
            if (i % 2 != 0) {
                result += i;
            }
        }
    }

    return result;
}
module.exports = {oddsBetween}

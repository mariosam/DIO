/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+minMoviments(4, 4, 6, 2));

/**
 * Inform the minimun of moviments required.
 */
function minMoviments(x1, y1, x2, y2) {
    let result = 2;

    if (x1 == x2 && y1 == y2) {
        result = 0;
    } else if (x1 == x2 || y1 == y2 || Math.abs(x1-x2) == Math.abs(y1-y2)) {
        result = 1;
    }

    return result;
}
module.exports = {minMoviments}

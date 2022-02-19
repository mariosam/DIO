/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+possibleTravel(3,4,5));

const N = "N";
const S = "S";

/**
 * Check if is possible to travel in time.
 */
function possibleTravel(a, b, c) {
    let result = N;

    if ( a == b || b == c || a == c || a+b==c || a+c==b || b+c ==a ) result = S;

    return result;
}
module.exports = {possibleTravel}

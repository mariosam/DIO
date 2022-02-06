/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+simpleFactorial(4));

/**
 * Return the factorial number.
 */
function simpleFactorial(N) {
    let result = 1;
    N++;

    while ( N > 1 ) {
        result = result * (N-1); 
        N--;
    } 

    return result;
}
module.exports = {simpleFactorial}

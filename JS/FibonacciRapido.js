/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+binetFormule(19));

/**
 * Fibonacci value using Binet formule.
 */
function binetFormule(N) {
    return +((Math.pow((1 + Math.sqrt(5)) / 2, N) - Math.pow((1 - Math.sqrt(5)) / 2, N)) / Math.sqrt(5)).toFixed(1);
}
module.exports = {binetFormule}

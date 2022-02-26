/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let lines = gets().split("\n");
let num = parseInt(lines.shift());

printSixOdd(num);

/**
 * Print the next six odd.
 */
function printSixOdd(x) {
    //if even transform in odd.
    x = x % 2 === 0 ? x : x-1;

    for ( let i=1; i < 12; i=i+2 ) {
        console.log( x+i );
    }
}
module.exports = {printSixOdd}

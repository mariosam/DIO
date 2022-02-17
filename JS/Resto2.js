/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+printAllRest2(4));

/**
 * Print all values where rest is equals 2.
 */
 function printAllRest2(x) {
    for ( i=1; i < 10000; i++ ) {
        if ( i % x == 2 ) console.log( i );
    }
}
module.exports = {printAllRest2}

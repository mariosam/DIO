/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+printAllVector2(4));

/**
 * Print all values of vector.
 */
function printAllVector2(x) {
    for ( let i=0, j=0; i < 1000; i++, j++ ) {
        console.log(`N[${i}] = ${j}`);
        
        if ( j == (x-1) ) j = -1;
    }
}
module.exports = {printAllVector2}

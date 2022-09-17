/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let num = parseInt( gets() );

console.log( reduceNumber( num ) );

/**
 * Get a number and reduce to zero.
 */
function reduceNumber( num = 0 ) {
    let times = 0;

    while ( num > 0 ) {
        times++;

        //se for par
        if ( num%2 == 0 ) {
            num = num / 2; 
        } else {
            num = num - 1;
        }
    }

    return times;
}
module.exports = {reduceNumber}

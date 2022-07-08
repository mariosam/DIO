/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let n = parseInt( gets() );

while ( n != -1 ) {
    console.log( returnedDucks( n ) );

    n = parseInt( gets() );
}

/**
 * Calculate how many ducks are returned.
 */
function returnedDucks( ducks = 0 ) {
    if ( ducks > 0 ) ducks--;

    return ducks;
}
module.exports = {returnedDucks}

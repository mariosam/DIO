/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let line = gets().split(" ");
let ar = getQuoAndRest( line[0], line[1] );

console.log( `${ar[0]} ${ar[1]}` );

/**
 * Get the quocient and rest of the division.
 */
function getQuoAndRest(a = 0, b = 0) {
    let q = parseInt( a / b );
    let r = a - (q * b);

    if ( r < 0 ) {
        r += Math.abs(b);

        q = (a-r) / b;
    }
    
    return [q, r];
}
module.exports = {getQuoAndRest}

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let N = parseInt( gets() );
let ar = countEve( N );

ar.forEach(function(eve) {
    console.log( eve );
});

/**
 * Show only the eve numbers.
 */
function countEve(n = 0) {
    let results = new Array();

    for ( let i=2; i <= n; i+=2 ) results.push( i );
    
    return results;
}
module.exports = {countEve}

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let N = parseInt( gets() );
let ar = loadSquareAndCumbe( N );

ar.forEach(function(ops) {
    console.log( `${ops[0]} ${ops[1]} ${ops[2]}` );
});

/**
 * Load all square and cumbe numbers.
 */
function loadSquareAndCumbe(n = 0) {
    let results = new Array();

    for ( let i=1; i <= n; i++ ) {
        results.push( [i, Math.pow(i, 2), Math.pow(i, 3)] );
    }

    return results;
}
module.exports = {loadSquareAndCumbe}

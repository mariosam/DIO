/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let input = gets().split(" ");
let ops = [input[0]];

for ( let i = 0; i < input[0]; i++ ) {
    ops[i] = parseInt( gets() )
}

console.log( numberOfGuests( input, ops ) );

/**
 * Put in the guesst list only people higher than MIN and lower than MAX size.
 */
function numberOfGuests( inp = [], ops = [] ) {
    let conta = 0;
    let n = inp[0];
    let min = inp[1];
    let max = inp[2];

    for ( let i=0; i < n; i++ ) {
        let altura = ops[i];

        if ( altura >= min && altura <= max ) conta++;
    }

    return conta;
}
module.exports = {numberOfGuests}

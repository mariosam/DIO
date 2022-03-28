/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let N = parseInt( gets() );
let inputs = [];
for (let i=0; i < N; i++) {
    inputs.push( gets() );
}

let ar = howManyToys( inputs );
console.log(`${ar[0]} carrinhos\n${ar[1]} bonecas`);

/**
 * Count how many boys and girls do we have to count each toys.
 */
function howManyToys(inputs = []) {
    let boys = 0;

    for ( let i=0; i < inputs.length; i++ ) {
        if ( inputs[i].substr(-1).toUpperCase() === 'M' ) boys++;
    }
    
    return [ boys, inputs.length-boys ];
}
module.exports = {howManyToys}

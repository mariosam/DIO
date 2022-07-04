/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let n = parseInt( gets() );

while ( n != 0 ) {
    for ( let i = 1; i <= n; i++ ) {
        let people = parseInt( gets() );

        print( howManyOrdersPerPeople( people ) );
    }
    n = parseInt( gets() );
}

/**
 * Cont how many orders will be delivered per people.
 */
function howManyOrdersPerPeople( people = 0 ) {
    let result = 0;

    if ( people % 2 !== 0 ) {
        result = (people * 2) - 1;
    } else {
        result = (people * 2) - 2;
    }

    return result;
}
module.exports = {howManyOrdersPerPeople}

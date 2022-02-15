/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

var n = parseInt( gets() );

for ( let i=0; i < n; i++ ) {
    let food = parseFloat( gets() );

    console.log( countDays( food ), "dias");
}

/**
 * How many days do we have available food.
 */
function countDays(food) {
    let result = 0;

    while ( food > 1.0 ) {
        result++;
        food = food/2;
    }

    return result;
}
module.exports = {countDays}

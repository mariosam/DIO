/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const IMPOSSIVEL = "divisao impossivel";

let N = parseInt(gets());
for ( let i=0; i < N; i++ ) {
    let line = gets().split(" ");

    console.log( divTwoValues( line[0], line[1] ) );
}

/**
 * Do the math: DIV two values.
 */
function divTwoValues(x = 0, y = 0) {
    let result = IMPOSSIVEL;

    if ( y != 0 ) result = parseFloat(x / y).toFixed(1);

    return result;
}
module.exports = {divTwoValues}

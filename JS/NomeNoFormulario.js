/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const YES = "YES";
const NO  = "NO";

let palavra = gets();

console.log( checkNameSize(palavra) );

/**
 * Check if the size of name is valid.
 */
function checkNameSize(name) {
    let result = NO;

    if ( name.trim().length < 81 ) result = YES;

    return result;
}
module.exports = {checkNameSize}

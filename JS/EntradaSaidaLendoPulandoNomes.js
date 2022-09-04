/**
 * @version JAVASCRIPT (ES6)
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let input = new Array(10);
for (let x=0; x < 10; x++) {
    input[x] = gets();
}

let ar = giveMe379( input );
for (let x=0; x < ar.length; x++) {
    console.log( ar[x] );
}

/**
 * Return the names of position 3, 7 and 9.
 */
function giveMe379(ar = []) {
    return [ar[2], ar[6], ar[8]];
}
module.exports = {giveMe379}

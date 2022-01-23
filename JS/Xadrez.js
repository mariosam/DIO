/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

/*
let lines = gets().split("\n");
var l = parseInt(lines[0]);
var c = parseInt(lines[1]);

print( tableColor(l,c) );
*/

/**
 * Do the math for identify if the square is white or black
 */
function tableColor(L, C) {
    let result = 0;

    if ( L % 2 == C % 2 ) {
        result = 1;
    } 
    return result;
}
module.exports = {tableColor}

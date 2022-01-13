/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+tableColor(8,8));

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

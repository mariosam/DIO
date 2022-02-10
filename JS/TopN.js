/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+topRange(23));

const TOP1   = "Top 1";
const TOP3   = "Top 3";
const TOP5   = "Top 5";
const TOP10  = "Top 10";
const TOP25  = "Top 25";
const TOP50  = "Top 50";
const TOP100 = "Top 100";

/**
 * Identify the range of position.
 */
function topRange(pos) {
    let result = TOP100;

    if ( pos < 2 ) {
        result = TOP1;
    } else if ( pos < 4 ) {
        result = TOP3;
    } else if ( pos < 6 ) {
        result = TOP5;
    } else if ( pos < 11 ) {
        result = TOP10;
    } else if ( pos < 26 ) {
        result = TOP25;
    } else if ( pos < 51 ) {
        result = TOP50;
    }

    return result;
}
module.exports = {topRange}

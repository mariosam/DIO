/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+moonFase(3,4));

const NOVA        = "nova";
const CRESCENTE   = "crescente";
const CHEIA       = "cheia";
const MINGUANTE   = "minguante";

/**
 * Check the fase of the Moon.
 */
function moonFase(day1, day2) {
    let result = CHEIA;

    if (day1 >= 0 && day2 <= 2) {
        result = NOVA;
    } else if (day2 > day1 && day2 <= 96) {
        result = CRESCENTE;
    } else if (day1 >= day2 && day2 <= 96) {
        result = MINGUANTE;
    } 

    return result;
}
module.exports = {moonFase}

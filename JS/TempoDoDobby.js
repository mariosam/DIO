/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+todayOrTomorrow(20, 15, 6));

const HOJE   = "Farei hoje!";
const AMANHA = "Deixa para amanha!";

/**
 * Dobby will do the work today or tomorrow.
 */
function todayOrTomorrow(n, a, b) {
    let result = HOJE;

    if ( n < (a+b) ) result = AMANHA;

    return result;
}
module.exports = {todayOrTomorrow}

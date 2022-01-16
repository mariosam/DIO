/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+localTime(10,7,3));

/**
 * Calculate time and timezone to inform the localtime/gap of travel.
 */
function localTime(S, T, F) {
    let adj = S + T + F;

    if (adj >= 24) { adj -= 24; } 
    else if (adj < 0) { adj += 24; }
    
    return adj;
}
module.exports = {localTime}

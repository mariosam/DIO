/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let days = parseInt( gets() );
let out = splitAgeDays( days );

console.log( `${out[0]} ano(s)\n${out[1]} mes(es)\n${out[2]} dia(s)` );

/**
 * Split age in days, month and year
 */
function splitAgeDays(days = 0) {
    let year = Math.floor(days / 365);
    let month = Math.floor((days % 365) / 30);
    let day = days % 365 % 30;

    return [year, month, day];
}
module.exports = {splitAgeDays}

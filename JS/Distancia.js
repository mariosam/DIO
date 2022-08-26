/**
 * @version JAVASCRIPT (ES6)
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let in = parseInt(gets());
console.log(`${reportMinutes( input )} minutos`);

/**
 * Calculate the minutes based on the distance and the speed.
 */
function reportMinutes(km = 0, speed = 2) {
    return Math.round(km * speed);
}
module.exports = {reportMinutes}

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let x = parseInt(gets());
let y = parseFloat(gets());

console.log( `${averageConsumption(x, y).toFixed(3)} km/l` );

/**
 * Return the average consumption of the car.
 */
function averageConsumption(x = 0, y = 0) {
    let res = parseFloat( x ) / parseFloat( y );

    return +res.toFixed(3);
}
module.exports = {averageConsumption}

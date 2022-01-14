/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+cornToReceive(7));

/**
 * Calculate the amount of corn to delivery.
 */
function cornToReceive(x) {
    let amount = Math.pow(2, x);

    return Math.trunc(amount / 12000);
}
module.exports = {cornToReceive}

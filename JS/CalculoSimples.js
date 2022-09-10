/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+calcTotalToPay({1001, 1005, 1003}, {42, 12, 20}));

/**
 * Multiply product value by quantity and return the total.
 */
function calcTotalToPay(pecas1, pecas2) {
    let res = parseFloat(parseFloat(pecas1[1]) * parseFloat(pecas1[2])) + parseFloat(parseFloat(pecas2[1]) * parseFloat(pecas2[2]));

    return +res.toFixed(2);
}
module.exports = {calcTotalToPay}

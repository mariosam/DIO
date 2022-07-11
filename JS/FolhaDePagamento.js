/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let colab = parseInt(gets());
let time  = parseFloat(gets());
let value = parseFloat(gets());

console.log("NUMBER = " + colab);
console.log("SALARY = U$ " + calcSalary(time, value).toFixed(2) );

/**
 * Calculate worktime by timevalue.
 */
function calcSalary(t, v) {
    return t * v;
}
//module.exports = {calcSalary}

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let n = parseInt(gets());
let array = [];

for (let i = 0; i < n; i++) {
    array.push(parseInt(gets()));
}

array = orderOddsEvenNumbers(array);
array.forEach(function (num) { console.log( num ); });

/**
 * Return numbers even asc and odd desc.
 */
function orderOddsEvenNumbers(inputs = []) {
    let odd = [];
    let even = [];

    //separate odd and even numbers
    inputs.forEach(function (num) {
        if (num % 2 === 0) {
            even.push(num);
        } else {
            odd.push(num);
        }
    });

    //put even numbers in ascending order
    even.sort((a, b) => a - b);

    //put odd numbers in descending order
    odd.sort((a, b) => b - a);

    return even.concat(odd);
}
module.exports = {orderOddsEvenNumbers}

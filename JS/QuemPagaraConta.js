/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let n = parseInt(gets());
let array = [];
array[0] = n;

for (let i = 1; i <= n; i++) {
    array[i] = parseInt(gets());
}

array = resultOfSum( array );
array.forEach(function (num) {
    console.log( num );
});

/**
 * Return the result of sum of all numbers in the array
 */
function resultOfSum(inputs = []) {
    let result = [];

    for (let i = 0; i < inputs.length; i++) {
        result.push( inputs[i]%2);
    }

    return result;
}
module.exports = {resultOfSum}

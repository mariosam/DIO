/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let arr = [];
for (let i = 0; i < 6; i++) {
    arr.push( gets() );
}
print( sumPositives( arr ) + " valores positivos" );

/**
 * Count positives numbers.
 */
function sumPositives(ar) {
    let result = 0;

    ar.forEach(function (num, i, array) {
        if ( num > 0 ) result++;
    });

    return result;
}
module.exports = {sumPositives}

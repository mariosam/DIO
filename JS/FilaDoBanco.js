/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const n = parseInt(gets());
for (let i = 0; i < n; i++) {
   let numbers = parseInt(gets());
   let senhas = gets().split(" ");

   print( changingPlaces( senhas ) );
}

/**
 * Count how many changes need to right the queue.
 */
function changingPlaces(ar) {
    let result = 0;
    let pwdOrder = Array.from(ar).sort((a, b) => b - a);

    ar.forEach(function (num, i, array) {
        if (num === pwdOrder[i]) result++;
    });

    return result;
}
module.exports = {changingPlaces}

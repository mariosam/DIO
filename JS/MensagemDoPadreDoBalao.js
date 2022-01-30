/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+decodeMsg("ABCDEFGHIJKLMNOPQRSTUVWXYZ", [8, 5, 12, 16]));

/**
 * Decode the message.
 */
function decodeMsg(a, nums) {
    let result = "";

    nums.forEach(function (n, i, array) {
        result += a.charAt( n-1 );
    });

    return result;
}
module.exports = {decodeMsg}

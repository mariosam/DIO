/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let lines = gets().split("\n");
let line = lines.shift().split(' ');

let T1 = parseInt(line[0]);
let T2 = parseInt(line[1]);
let T3 = parseInt(line[2]);
let T4 = parseInt(line[3]);

console.log( maxDevices(T1, T2, T3, T4) );

/**
 * Calculate the number max of devices can be pluged.
 */
function maxDevices(t1, t2, t3, t4) {
    return (t1 + t2 + t3 + t4) - 3;
}
module.exports = {maxDevices}

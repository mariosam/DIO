/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let n = parseInt(gets());
let ar = [];

for (let i = 0; i < n; i++) {
    let tempo = parseFloat(gets());
    
    ar.push( tempo );
}

console.log( theFaster( ar ) );

/**
 * Get values and return the minor value, the faster one.
 */
function theFaster(arr) {
    let faster = 999;

    arr.forEach(function (value) {
        if (value < faster) faster = value;
    });

    return faster;
}
module.exports = {theFaster}

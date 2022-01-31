/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+getHigh(3, 2));

const PI = 3.14;

/**
 * Calculate and return the high of object.
 */
function getHigh(v, d) {
    let f = v / (PI * ((d / 2) * (d / 2)));

    return Math.round(f*100) / 100;
}

/**
 * Calculate and return the area of object.
 */
function getArea(d) {
    let f = PI * ((d / 2) * (d / 2));

    return Math.floor(f*100) / 100;
}

module.exports = {getHigh, getArea}

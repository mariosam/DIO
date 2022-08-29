/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let lineX = gets().split(" ");
let lineY = gets().split(" ");
 
console.log( getDistance( parseFloat(lineX[0]), parseFloat(lineX[1]), parseFloat(lineY[0]), parseFloat(lineY[1]) ) );

/**
 * Do the math: Calculate the distance between two points.
 */
function getDistance(x1 = 0, y1 = 0, x2 = 0, y2 = 0) {
    return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)).toFixed(4);
}
module.exports = {getDistance}

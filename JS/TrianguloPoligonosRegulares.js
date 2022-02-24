/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let lines = gets().split('\n');

print( minTriangules( lines ) );

/**
 * Return the number of necessary triangules to compose a poligono.
 */
function minTriangules(x) {
    return x - 2;
}
module.exports = {minTriangules}

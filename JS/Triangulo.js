/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let lines = gets().split('\n')
let line = lines.shift().split(" ");

let A = parseFloat(line[0]);
let B = parseFloat(line[1]);
let C = parseFloat(line[2]);

console.log( calcArea(A, B, C) );

/**
 * Calculate area or perimeter.
 */
function calcArea(a, b, c) {
    let result = "";
    let maior = c;
    let soma = b + a;

    if ( a > b && a > c ) maior = a;
    else if ( b > c ) maior = b;

    if ( maior == a ) soma = b + c;
    else if ( maior == b ) soma = a + c;

    if ( soma > maior ) {
        result = "Perimetro = " + (a + b + c).toFixed(1);
    } else {
        result = "Area = " + (((a + b) * c)/2).toFixed(1);
    }

    return result;
}
module.exports = {calcArea}

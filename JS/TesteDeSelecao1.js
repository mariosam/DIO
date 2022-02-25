/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const SIM = "Valores aceitos";
const NAO = "Valores nao aceitos";

x = gets().split(" ");

a = parseInt(x[0]);
b = parseInt(x[1]);
c = parseInt(x[2]);
d = parseInt(x[3]);

print( checkSequence(a, b, c, d) );

/**
 * Check if order of numbers are valid.
 */
function checkSequence(a, b, c, d) {
    let result = NAO;

    if (b > c && d > a && c > 0 && d > 0 && (c + d) > (a + b) && a % 2 == 0) result = SIM;

    return result;
}
module.exports = {checkSequence}

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let lines = gets().split('\n');

const [precoAlcool, precoGasolina, rendimentoAlcool, rendimentoGasolina] = lines[0].split(' ').map(x => parseFloat(x));

print( moreEconomic(precoAlcool, precoGasolina, rendimentoAlcool, rendimentoGasolina) );

/**
 * Return the more economic combustivel.
 */
function moreEconomic(a, g, ra, rg) {
    let result = "A";
    let precoPorKmAlcool = a / ra;
    let precoPorKmGasolina = g / rg;

    if ( precoPorKmGasolina <= precoPorKmAlcool ) result = "G";

    return result;
}
module.exports = {moreEconomic}

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const MAISDE8000 = "Mais de 8000!";
const INSETO = "Inseto!";
 
let input = parseInt(gets());
for ( let i = 0; i < input; i++ ) {
    let nivelEnergia = parseInt(gets());

    print( checkEnergyLevel( nivelEnergia ) );    
}

/**
 * Return the drogon message about the energy level identified.
 */
function checkEnergyLevel( energy = 0 ) {
    let result = INSETO;

    if ( energy > 8000 ) result = MAISDE8000;

    return result;
}
module.exports = {checkEnergyLevel}

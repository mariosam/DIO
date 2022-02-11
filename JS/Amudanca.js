/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const DIA   = "Bom Dia!!";
const TARDE = "Boa Tarde!!";
const NOITE = "Boa Noite!!";
const MADRU = "De Madrugada!!";

//console.log("Result is "+salutation(180));

/**
 * Return the best salutation based on sun time.
 */
function salutation(graus) {
    let result = MADRU;

    if ( graus == 360 || graus >= 0 && graus < 90 ) result = DIA;
    else if ( graus >= 90 && graus < 180 ) result = TARDE;
    else if ( graus >= 180 && graus < 270 ) result = NOITE;

    return result;
}
module.exports = {salutation}

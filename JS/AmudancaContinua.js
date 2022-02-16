/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const DIA   = "Bom Dia!!";
const TARDE = "Boa Tarde!!";
const NOITE = "Boa Noite!!";
const MADRU = "De Madrugada!!";

//console.log("Result is "+salutationTime(195.5));

/**
 * Return the best salutation and timezone based on sun time.
 */
function salutationTime(graus) {
    let salut = MADRU;
    let hour = 0.0, min = 0.0, sec = 0.0;

    if ( graus == 360 || graus >= 0 && graus < 90 ) salut = DIA;
    else if ( graus >= 90 && graus < 180 ) salut = TARDE;
    else if ( graus >= 180 && graus < 270 ) salut = NOITE;

    hour = ((graus * 4.0) / 60.0) + 6.0;
    if ( graus >= 270 ) hour = ((graus - 270.0) * 4.0) / 60.0;

    min = (hour * 60.0) % 60.0;
    sec = (min * 60.0) % 60.0;

    if ( sec > 59 ) {
        sec = 0.0;
        min += 1.0;
    }
    
    return [ salut, hour, min, sec ];
}
module.exports = {salutationTime}

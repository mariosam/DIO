/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let num = parseInt( gets() );

console.log( countEven( num ) );

/**
 * Get a number and sum all even digits. 
 */
function countEven( num = 0 ) {
    let count = 0;

    for ( let i=1; i <= num; i++ ) {
        //controle para 1 digito
        if ( i.toString().length === 1 ) {
            //se for par
            if (i%2 === 0) count++;
            continue;
        }
        
        //controle para multiplos digitos
        let multi = [...i.toString()];
        let sum = 0;
        for ( let x=0; x < multi.length; x++ ) {
            sum += parseInt(multi[x]);
        }

        //se for par
        if (sum%2 === 0) count++;
    }

    return count;
}
module.exports = {countEven}

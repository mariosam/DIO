/**
 * @version JAVASCRIPT (ES6)
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let n = parseInt(gets());
let line = gets().split(" ");
let ar = getMultiples( line );

for (let x=0; x < ar.length; x++) {
    console.log( `${ar[x]} Multiplo(s) de ${x+2}` );
}

/**
 * Get the multiples of array numbers.
 */
 function getMultiples(ar = []) {
    let result = [0, 0, 0, 0];

    for (let i=0; i < ar.length; i++) {
        if ( ar[i] % 2 == 0 ) result[0]++;
        if ( ar[i] % 3 == 0 ) result[1]++;
        if ( ar[i] % 4 == 0 ) result[2]++;
        if ( ar[i] % 5 == 0 ) result[3]++;
    }
    
    return result;
}
module.exports = {getMultiples}

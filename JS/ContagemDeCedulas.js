/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const NOTAS = [100, 50, 20, 10, 5, 2, 1];

let valor = parseInt( gets() );
console.log( valor );

let ar = countNotes( valor );
ar.forEach(function(v, i) {
    console.log( v+" nota(s) de R$ "+NOTAS[i]+",00");
});

/**
 * Count the number of cedules to each note.
 */
function countNotes(total) {
    let arResult = new Array();

    NOTAS.forEach(function (nota, indice, array) {
        if ( total >= nota ) {
            let temp = total / nota;
            arResult[ indice ] = Math.floor( temp );
            total = total % nota;
        } else {
            arResult[ indice ] = 0;
        }
    });
    
    return arResult;
}
module.exports = {countNotes}

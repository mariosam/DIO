/**
 * @version JAVASCRIPT ECMAScript 6
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let inp = gets();
console.log( originPosition(inp) );

/**
 * Compare two commands and return the original position of robot.
 */
function originPosition(inp = "") {    
    //separa os 2 comandos
    let start = inp.charAt(0);
    let end = inp.charAt(1);

    //se os comandos forem iguais
    if ( start == end ) return false;

    //se for subir e descer
    if ( (start == 'W' && end == 'S') || (start == 'S' && end == 'W') ) return true;

    //se for esquerda e direita
    if ( (start == 'A' && end != 'W' && end != 'S') || (end == 'A' && end != 'W' && end != 'S') ) return true;

    //outras combinacoes sao invaldias
    return false;
}
module.exports = {originPosition}

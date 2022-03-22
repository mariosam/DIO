/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

printBox("-", "-");
printBox("|", " ");
printBox("|", " ");
printBox("|", " ");
printBox("|", " ");
printBox("|", " ");
printBox("-", "-");

/**
 * Print the sysmbols.
 */
function printBox(n1, n2) {
    let result = "\n"+n1;
    for ( i=0; i < 37; i++ ) result += n2 ;
    result += n1+"\n";
    
    console.log( result );
}
module.exports = {printBox}

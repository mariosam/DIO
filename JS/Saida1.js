/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//printBox("|", " ");

/**
 * Print the sysmbols.
 */
function printBox(n1, n2) {
    print( "\n"+n1 );
    for ( i=0; i < 37; i++ ) print( n2 );
    print( n1+"\n") ;
}
module.exports = {printBox}

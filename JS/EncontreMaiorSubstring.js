/**
 * @version JAVASCRIPT ECMAScript 6
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

while ( (in1 = gets()) != '' ) console.log( findTheBiggestSubstring( in1, gets() ) ); 

/**
 * Compare two strings and return the biggest substring that is common to both words.
 */
function findTheBiggestSubstring(w1 = "", w2 = "") {    
    for (let size = w1.length; size >= 0; size--) {
        for (let i = 0; i + size <= w1.length; i++) {
            let sub = w1.substring(i, i + size);

            if (w2.indexOf(sub, 0) >= 0) return size;
        }
    }

    return 0;
}
module.exports = {findTheBiggestSubstring}

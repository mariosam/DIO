/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const WORD = "LIFE IS NOT A PROBLEM TO BE SOLVED";

let lines = gets().split("\n");
let N = parseInt(lines.shift());

print( cutWord( N ) );

/**
 * Return only part of the word.
 */
function cutWord(pos) {
    return WORD.slice(0, pos);
}
module.exports = {cutWord}

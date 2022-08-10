/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let n = parseInt(gets());

for (let i = 0; i < n; i++) {
    let words = gets();
    
    console.log(orderWordsBySize(words));
}

/**
 * Return the words ordered by size (desc).
 */
function orderWordsBySize(words = "") {
    let wordsArray = words.split(" ");
    
    let orderedWords = wordsArray.sort( (a, b) => {
        return b.length - a.length;
    });

    return orderedWords.join(" ");
}
module.exports = {orderWordsBySize}

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let ops = [parseInt(gets()), parseInt(gets()), parseInt(gets()), parseInt(gets()), parseInt(gets())];
let ret = numberAnalysis( ops );

console.log(`${ret[0]} par(es)`);
console.log(`${ret[1]} impar(es)`);
console.log(`${ret[2]} positivo(s)`);
console.log(`${ret[3]} negativo(s)`);

/**
 * Count number of positives negatives odd and even.
 */
function numberAnalysis(nums) {
    let pos = 0, neg = 0, odd = 0, eve = 0;

    for ( i=0; i < nums.length; i++ ) {
        let n = nums[i];

        //check if odd or even
        if ( n % 2 == 0 ) {
            eve++;
        } else {
            odd++;
        }
        
        //check if positive or negative
        if ( n != 0 ) {
            if ( n > 0 ) {
                pos++;
            } else {
                neg++;
            }
        }
    }

    return [ eve, odd, pos, neg ];
}
module.exports = {numberAnalysis}

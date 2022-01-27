/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("The result is "+numberAnalysis([-5, 0, -3, -4, 12]));

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

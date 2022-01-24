/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+mathResult("S", {-19,0,-7,13,-4,46,...}));

const MEDIA = "M";

/**
 * Get only numbers above the line and check if is sum or average.
 */
function mathResult(ope, nums) {
    let result = 0;
    let i = 0;

    for ( let x = 0; x < 12; ++x ) {
        for ( let y = 0; y < 12; ++y ) {
            let num = nums[i]; i++;

            if ( y > x ) result += num;
        }
    }

    return +(ope === MEDIA ? result/=66.0 : result).toFixed(1);
}
module.exports = {mathResult}

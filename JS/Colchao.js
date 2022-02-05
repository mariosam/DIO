/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const SIM = "S";
const NAO = "N";

/**
 * Check if mattress pass through the door.
 */
function checkSize(A, B, C, H, L) {
    let result = NAO;

    if  ((A <= H && B <= L) || (A <= H && C <= L) || (B <= H && A <= L) || (B <= H && C <= L) || (C <= H && A <= L) || (C <= H && B <= L)) 
        result = SIM;
        
    return result;
}
module.exports = {checkSize}

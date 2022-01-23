/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+shopValue({1001, 1005, 1003}, {42, 12, 20}));

/**
 * Multiply product value by quantity and return the total.
 */
function shopValue(prods, qtds) {
    let result = 0;

    for ( i=0; i < prods.length; i++ ) {
        switch ( prods[i] ) {
            case 1001:
                result += 1.50 * qtds[i];
                break;
            case 1002:
                result += 2.50 * qtds[i];
                break;
            case 1003:
                result += 3.50 * qtds[i];
                break;
            case 1004:
                result += 4.50 * qtds[i];
                break;
            case 1005:
                result += 5.50 * qtds[i];
                break;
        }
    }

    return result;
}
module.exports = {shopValue}

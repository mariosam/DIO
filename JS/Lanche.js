/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+totalToPay(3, 2));

/**
 * Sum total to pay.
 */
function totalToPay(cod, qtd) {
    let result = 0;

    switch (cod) {
        case 1:
            result = qtd * parseFloat(4.00);
            break;
        case 2:
            result = qtd * parseFloat(4.50);
            break;
        case 3:
            result = qtd * parseFloat(5.00);
            break;
        case 4:
            result = qtd * parseFloat(2.00);
            break;
        case 5:
            result = qtd * parseFloat(1.50);
            break;
    }

    return result;
}
module.exports = {totalToPay}

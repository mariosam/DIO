/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//console.log("Result is "+checkPass(2022));

const BLOCKED = "Senha Invalida";
const GRANTED = "Acesso Permitido";
const SWORDFISH = 2002;

/**
 * Check if the password is valid.
 */
function checkPass(pass) {
    let result = BLOCKED;

    if ( pass == SWORDFISH ) result = GRANTED;

    return result;
}
module.exports = {checkPass}

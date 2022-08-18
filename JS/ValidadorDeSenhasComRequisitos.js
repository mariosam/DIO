/**
 * @version JAVASCRIPT ECMAScript 6
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const VALIDO = "Senha valida.";
const INVALIDO = "Senha invalida.";

while ( (pass = gets()) != '' ) console.log( passwordValidator( pass ) ); 

/**
 * Check if password is valid.
 */
function passwordValidator(pwd = "") {
    let result = VALIDO;

    //valida o tamanho
    if (pwd.length < 6 || pwd.length > 32) {
        result = INVALIDO;
    //valida se possui espacos ou caracteres nao alphanumericos
    } else if (/\s/g.test(pwd) || /\W|_/.test(pwd)) {
        result = INVALIDO;
    //valida se possui elementos obrigatorios (maiusculas, minusculas, e numeros)
    } else if (!/[A-Z]/.test(pwd) || !/[a-z]/.test(pwd) || !/[0-9]/.test(pwd)) {
        result = INVALIDO;
    }

    return result;
}
module.exports = {passwordValidator}

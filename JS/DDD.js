/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const NONE = "DDD nao cadastrado";
const BRASILIA = "Brasilia";
const SALVADOR = "Salvador";
const SAOPAULO = "Sao Paulo";
const RIODEJANEIRO = "Rio de Janeiro";
const JUIZDEFORA = "Juiz de Fora";
const CAMPINAS = "Campinas";
const VITORIA = "Vitoria";
const BELOHORIZONTE = "Belo Horizonte";

//console.log("Result is "+dddCity(3, 2));

/**
 * Return the name of the city using DDD reference.
 */
function dddCity(cod) {
    let result = NONE;

    switch (cod) {
        case 61:
            result = BRASILIA;
            break;
        case 71:
            result = SALVADOR;
            break;
        case 11:
            result = SAOPAULO;
            break;
        case 21:
            result = RIODEJANEIRO;
            break;
        case 32:
            result = JUIZDEFORA;
            break;
        case 19:
            result = CAMPINAS;
            break;
        case 27:
            result = VITORIA;
            break;
        case 31:
            result = BELOHORIZONTE;
            break;
    }

    return result;
}
module.exports = {dddCity}

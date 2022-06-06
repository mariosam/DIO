/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//obtem tamanho do array
let N = gets();
let ages = gets().split(" ");

//imprime resultados
let ar = forbidenUnder18( ages );
console.log( "Nao poderao entrar as idades: " );
ar.forEach(function(result){
    console.log( result );
});

/**
 * Forbiden to enter less than 18 years old.
 */
function forbidenUnder18(ages = []) {
    let forbiden = [];

    ages.forEach(age => {
        if (age < 18) forbiden.push(age);
    });

    return forbiden;
}
module.exports = {forbidenUnder18}

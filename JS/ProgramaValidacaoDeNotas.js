/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

const NOTAINVALIDA = "nota invalida";
const MEDIA = "media = ";
const NOVOCALCULO = "novo calculo (1-sim 2-nao)";

//armazena todas as entradas
var lines = [];
let v=0;
while ( Number(v) != 2 ) {
    v = gets();
    lines.push( v );
}
 
//chama funcao para obter resultados
var res = calculateGrade( lines );
//imprime resultados
res.forEach(function(s){
    console.log( s );
});

function calculateGrade(nums) {
    let result = [];
    let n1 = 99, n2 = 99;
    let ncalc = true;

    sys: for ( let i=0; i < nums.length; i++ ) {
        let num = nums[i];

        //ignora entradas em branco
        if ( num == "" || num == undefined ) continue sys;

        //se foi sinalizado novo calculo
        if ( ncalc ) {
            //verifica se eh uma nota valida
            if ( Number(num) >= 0 && Number(num) <= 10 ) {
                //armazena as notas
                n1 == 99 ? n1 = num : n2 = num;

                //se ja houver valores para o calculo
                if ( n2 != 99 ) {
                    let average = ((parseFloat(n1)+parseFloat(n2)) / 2).toFixed(2);

                    n1 = 99; n2 = 99;
                    ncalc = false;

                    result.push( MEDIA+String(average) );
                }
            } else {
                result.push( NOTAINVALIDA );
            }
        } else {
            result.push( NOVOCALCULO );

            switch (String(num)) {
                case "1":
                    ncalc = true;
                    continue sys;
                case "2":
                    break sys;
            }
        }
    }

    return result;
}
module.exports = {calculateGrade}

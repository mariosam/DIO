/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

//prepara array de dados
let n = parseInt(gets());
let ops = [n][6];

//armazena dados de entrada em array
let x = 0;
while (x < n) {
    //a entrada vem bugada com linha em branco entre os dados!!!
    let in = gets();
    if ( in.trim() !== "" ) {
        let linha1 = in.split(" ");
        let linha2 = gets().split(" ");

        ops[x][0] = linha1[0];
        ops[x][1] = linha1[1];
        ops[x][2] = linha1[2];
        ops[x][3] = linha1[3];
        ops[x][4] = linha2[0];
        ops[x][5] = linha2[1];

        x++;
    }
}

//imprime resultado
for (let i = 0; i < n; i++) {
    console.log(evenOrOdd(ops[i]));
}

/**
 * Identify whos won the game Even or Odd.
 */
function evenOrOdd(ops = []) {
    //player 1 and player 2: valores somados
    let sum = parseInt(ops[4]) + parseInt(ops[5]);
    let winner = ops[0];

    //se for PAR, verifica quem escolheu par
    if (sum % 2 === 0) {
        if (ops[3] === "PAR") {
            winner = ops[2];
        }
    } else {
    //se for impar, verifica quem escolheu impar
        if (ops[3] === "IMPAR") {
            winner = ops[2];
        }
    }

    return winner;
}
module.exports = {evenOrOdd}

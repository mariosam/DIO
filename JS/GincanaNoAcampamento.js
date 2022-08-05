/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let n = parseInt(gets());
let ops = [][2];

while ( n > 0 ) {
    for ( let i = 0; i < n; i++ ) {
        let temp = gets().split(' ');
        ops[i][0] = temp[0];
        ops[i][1] = temp[1];
    }
    print( winnerOfScavengerGame(ops) );
    n = parseInt(gets());
}

/**
 * Identify the winner of the scavenger game.
 */
function winnerOfScavengerGame(ops = [][2]) {
    let lista = [];

    //passa o array de dados para a lista de estudantes
    for (let i = 0; i < ops.length; i++) {
        lista[i] = new Student( ops[i][0], parseInt(ops[i][1]) );
    }

    let position = 0;
    let card = lista[0].card;

    while (lista.length > 1) {
        if (card % 2 != 0) {
            position = (position + card) % lista.length;
        } else {
            position = (position - (card % lista.length)) % lista.length;

            // if the position becomes negative, we must make it positive. So, we subtract from the list size.
            if (position < 0) position = lista.length + position;
        }

        card = lista[position].card;
        lista.splice(position, 1);

        // if odd, move back one position to ensure that in the next iteration the correct position is pointed out.
        if (card % 2 != 0) position--;
    }

    return lista[0].name;
}

/**
 * Objeto do tipo estudante
 */
function Student(name = "", card = 0) {
    this.name = name;
    this.card = card;
}
module.exports = {winnerOfScavengerGame}

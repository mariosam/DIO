/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let n = parseInt(gets());
let array = [];

//le todas as entradas e guarda em um array
while (n > 0) {
    let input = gets();

    if ( input !== "0" ) {
        array.push(input);
    } else {
        n = parseInt(input);
    }
}

//chama funcao e exibe resultados
array = uniformsInOrder( array );
for (item of array) {
    console.log(item.color, item.size, item.names);
}

/**
 * Return the result of sum of all numbers in the array
 */
function uniformsInOrder(inputs = []) {
    let result = [];

    //guarda os valores em um objeto
    for (let i = 0; i < inputs.length; i++) {
        var list = new ListUniform();
        list.names = inputs[i];
        i++; //proximo item do array
        let temp = inputs[i].split(" "); //separa os itens do array
        list.color = temp[0];
        list.size = temp[1];
        
        result.push(list);
    }

    //criar uma ordem no objeto
    result.sort(function (a, b) {
        if (a.color === b.color) {
            if (a.size === b.size) {
                return a.names.localeCompare(b.names);
            }
            return a.size - b.size;
        }
        return a.color.localeCompare(b.color);
    });

    return result;
}

//objeto que representa um pedido de uniforme
function ListUniform(color = "", size = "", names = "") {
    this.color = color;
    this.size = size;
    this.names = names;
}
module.exports = {uniformsInOrder}

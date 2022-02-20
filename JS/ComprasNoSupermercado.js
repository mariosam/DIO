/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */

let nCasos = parseInt(gets());

for (let i=0; i < nCasos; i++) {
    console.log( checkMyList( gets().split(" ") ).join(" ") );
}

/**
 * Remove duplicates and organize my list.
 */
function checkMyList(items) {
    let result = items.filter((elem, index, self) => {
        return index === self.indexOf(elem);
    });

    return result.sort();
}
module.exports = {checkMyList}

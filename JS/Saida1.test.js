/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Saida1.js')

TEST('Starting Saida1 test...', (t) => {
    //Test 1
    OBJ.printBox("-", "-");
    OBJ.printBox("|", " ");
    OBJ.printBox("-", "-");

    t.end()
})

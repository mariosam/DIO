/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./PreenchimentoDeVetor2.js')

TEST('Starting PreenchimentoDeVetor2 test...', (t) => {
    //Test 1
    OBJ.printAllVector2(3)

    t.end()
})

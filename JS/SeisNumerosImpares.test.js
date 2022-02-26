/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./SeisNumerosImpares.js')

TEST('Starting SeisNumerosImpares test...', (t) => {
    //Test 1
    OBJ.printSixOdd(8)
    //Test 2
    OBJ.printSixOdd(7)

    t.end()
})

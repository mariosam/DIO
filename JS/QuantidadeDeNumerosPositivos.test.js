/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./QuantidadeNumerosPositivos.js')

TEST('Starting QuantidadeNumerosPositivos test...', (t) => {
    //Test 1
    t.assert(OBJ.sumPositives([7, -5, 6, -3.4, 4.6, 12]) === 4, "Expect: {7, -5, 6, -3.4, 4.6, 12} = 4")
    //Test 2
    t.assert(OBJ.sumPositives([70, 67, 77, 99, 23, 1]) === 6, "Expect: {70, 67, 77, 99, 23, 1} = 6")

    t.end()
})

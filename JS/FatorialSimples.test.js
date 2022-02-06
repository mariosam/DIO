/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./FatorialSimples.js')

TEST('Starting FatorialSimples test...', (t) => {
    //Test 1
    t.assert(OBJ.simpleFactorial(4) === 24, "Expect: 4 = 24")
    //Test 2
    t.assert(OBJ.simpleFactorial(6) === 720, "Expect: 6 = 720")
    //Test 3
    t.assert(OBJ.simpleFactorial(1) === 1, "Expect: 1 = 1")

    t.end()
})

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./SomaSimples.js')

TEST('Starting SomaSimples test...', (t) => {
    //Test 1
    t.assert(OBJ.simpleSum(30, 10) === 40, "Expect: 30 10 = 40")
    //Test 2
    t.assert(OBJ.simpleSum(-30, 10) === -20, "Expect: -30 10 = -20")
    //Test 3
    t.assert(OBJ.simpleSum(0, 0) === 0, "Expect: 0 0 = 0")

    t.end()
})

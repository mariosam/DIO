/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Diferenca.js')

TEST('Starting Diferenca test...', (t) => {
    //Test 1
    t.assert(OBJ.showDifference(5, 6, 7, 8) === -26, "Expect: -26")
    //Test 2
    t.assert(OBJ.showDifference(0, 0, 7, 8) === -56, "Expect: -56")
    //Test 3
    t.assert(OBJ.showDifference(5, 6, -7, 8) === 86, "Expect: 86")

    t.end()
})

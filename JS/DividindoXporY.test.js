/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./DividindoXporY.js')

TEST('Starting DividindoXporY test...', (t) => {
    //Test 1
    t.assert(OBJ.divTwoValues(3, -2) === "-1.5", "Expect: 3 -2 = -1.5")
    //Test 2
    t.assert(OBJ.divTwoValues(-8, 0) === "divisao impossivel", "Expect: -8 0 = divisao impossivel")
    //Test 3
    t.assert(OBJ.divTwoValues(0, 8) === "0.0", "Expect: 0 8 = 0.0")

    t.end()
})

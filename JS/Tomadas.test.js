/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Tomadas.js')

TEST('Starting Tomadas test...', (t) => {
    //Test 1
    t.assert(OBJ.maxDevices(2, 4, 3, 2) === 8, "Expect: 2, 4, 3, 2 = 8")
    //Test 2
    t.assert(OBJ.maxDevices(6, 6, 6, 6) === 21, "Expect: 6, 6, 6, 6 = 21")
    //Test 3
    t.assert(OBJ.maxDevices(2, 2, 2, 2) === 5, "Expect: 2, 2, 2, 2 = 5")

    t.end()
})

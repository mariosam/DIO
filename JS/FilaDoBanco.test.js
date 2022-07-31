/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./FilaDoBanco.js')

TEST('Starting FilaDoBanco test...', (t) => {
    //Test 1
    t.assert(OBJ.changingPlaces([100, 80, 90]) === 1, "Expect: 1")
    //Test 2
    t.assert(OBJ.changingPlaces([100, 120, 30, 50]) === 0, "Expect: 0")
    //Test 3
    t.assert(OBJ.changingPlaces([100, 90, 30, 25]) === 4, "Expect: 4")

    t.end()
})

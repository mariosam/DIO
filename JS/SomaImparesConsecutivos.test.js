/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./SomaImparesConsecutivos.js')

TEST('Starting SomaImparesConsecutivos test...', (t) => {
    //Test 1
    t.assert(OBJ.oddsBetween(6, -5) === 5, "Expect: 6 -5 = 5")
    //Test 2
    t.assert(OBJ.oddsBetween(15, 12) === 13, "Expect: 15 12 = 13")
    //Test 3
    t.assert(OBJ.oddsBetween(12, 12) === 0, "Expect: 12 12 = 0")
    //Test 4
    t.assert(OBJ.oddsBetween(1, 5) === 3, "Expect: 1 5 = 1")

    t.end()
})

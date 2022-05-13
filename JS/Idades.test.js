/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Idades.js')

TEST('Starting Idades test...', (t) => {
    //Test 1
    t.assert(OBJ.calcAverage([34, 56, 44, 23]) === 39.25, "Expect: 39.25")
    //Test 2
    t.assert(OBJ.calcAverage([28, 17, 41, 23, 34]) === 28.60, "Expect: 28.60")
    //Test 3
    t.assert(OBJ.calcAverage([24, 29, 48, 52]) === 38.25, "Expect: 38.25")
    //Test 4
    t.assert(OBJ.calcAverage([10, 2, 6, 54, 22, 89, 16, 25]) === 28.00, "Expect: 28.00")

    t.end()
})

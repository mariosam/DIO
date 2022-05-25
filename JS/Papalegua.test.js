/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Papalegua.js')

TEST('Starting Papalegua test...', (t) => {
    //Test 1
    t.assert(OBJ.theFaster([9.81, 9.71]) === 9.71, "Expect: 9.71")
    //Test 2
    t.assert(OBJ.theFaster([9.82, 9.72, 9.92]) === 9.72, "Expect: 9.72")
    //Test 3
    t.assert(OBJ.theFaster([9.75, 9.55, 9.23]) === 9.23, "Expect: 9.23")
    //Test 4
    t.assert(OBJ.theFaster([9.82, 9.92, 9.1]) === 9.10, "Expect: 9.10")

    t.end()
})

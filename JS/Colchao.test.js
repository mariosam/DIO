/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Colchao.js')

TEST('Starting Colchao test...', (t) => {
    //Test 1
    t.assert(OBJ.checkSize(25, 120, 220, 200, 100) === "S", "Expect: 25, 120, 220, 200, 100 = S")
    //Test 2
    t.assert(OBJ.checkSize(25, 205, 220, 200, 100) === "N", "Expect: 25, 205, 220, 200, 100 = N")
    //Test 3
    t.assert(OBJ.checkSize(25, 200, 220, 200, 100) === "S", "Expect: 25, 200, 220, 200, 100 = S")

    t.end()
})

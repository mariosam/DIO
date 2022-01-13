/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Xadrez.js')

TEST('Starting xadrez test...', (t) => {
    //Test 1
    t.assert(OBJ.tableColor(8, 8) === 1, "Expect: 8 8 = 1")
    //Test 2
    t.assert(OBJ.tableColor(5, 91) === 1, "Expect: 5 91 = 1")
    //Test 3
    t.assert(OBJ.tableColor(6, 9) === 0, "Expect: 6 9 = 0")

    t.end()
})

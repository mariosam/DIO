/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./TriDu.js')

TEST('Starting TriDu test...', (t) => {
    //Test 1
    t.assert(OBJ.greatestCard(10, 7) === 10, "Expect: 10")
    //Test 2
    t.assert(OBJ.greatestCard(2, 2) === 2, "Expect: 2")

    t.end()
})

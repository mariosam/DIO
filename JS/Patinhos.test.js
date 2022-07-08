/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Patinhos.js')

TEST('Starting Patinhos test...', (t) => {
    //Test 1
    let op = 0
    let want = 0
    t.assert(OBJ.returnedDucks( op ) === want, "Expect: 0")
    //Test 2
    op = 1
    want = 0
    t.assert(OBJ.returnedDucks( op ) === want, "Expect: 0")
    //Test 3
    op = 10
    want = 9
    t.assert(OBJ.returnedDucks( op ) === want, "Expect: 9")

    t.end()
})

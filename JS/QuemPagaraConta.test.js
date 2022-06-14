/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./QuemPagaraConta.js')

TEST('Starting QuemPagaraConta test...', (t) => {
    //Test 1
    let want = [1, 1, 1, 0]
    let got = OBJ.resultOfSum( [3, 11, 7, 18] )
    t.assert(want.toString === got.toString, "Expect: 1, 1, 1, 0")
    //Test 2
    want = [1, 1, 1, 1, 1, 1, 1, 1]
    got = OBJ.resultOfSum( [7, 1, 1, 3, 3, 1, 7, 99] )
    t.assert(want.toString === got.toString, "Expect: 1, 1, 1, 1, 1, 1, 1, 1")
    //Test 3
    want = [0, 0, 0, 0, 0, 0, 0]
    got = OBJ.resultOfSum( [6, 2, 2, 4, 8, 10, 128] )
    t.assert(want.toString === got.toString, "Expect: 0, 0, 0, 0, 0, 0, 0")

    t.end()
})

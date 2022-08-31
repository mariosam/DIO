/**
 * @version JAVASCRIPT (ES6)
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./PinkCerebro.js')

TEST('Starting PinkCerebro test...', (t) => {
    //Test 1
    let want = [4, 0, 2, 3]
    let got = OBJ.getMultiples( [2, 5, 4, 20, 10] )
    t.assert(want.toString === got.toString, "Expect: 4, 0, 2, 3")
    //Test 2
    want = [1, 0, 1, 1]
    got = OBJ.getMultiples( [100] )
    t.assert(want.toString === got.toString, "Expect: 1, 0, 1, 1")
    //Test 3
    want = [1, 1, 1, 1]
    got = OBJ.getMultiples( [3, 4, 5] )
    t.assert(want.toString === got.toString, "Expect: 1, 1, 1, 1")

    t.end()
})

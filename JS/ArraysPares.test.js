/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./ArraysPares.js')

TEST('Starting ArraysPares test...', (t) => {
    //Test 1
    let want = [2, 18, 34]
    let got = OBJ.returnOnlyEven( [2, 3, 5, 7, 11, 13, 18, 34] )
    t.assert(want.toString === got.toString, "Expect: 2, 18, 34")

    t.end()
})

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./TeoremaDaDivisaoEuclidiana.js')

TEST('Starting TeoremaDaDivisaoEuclidiana test...', (t) => {
    //Test 1
    let want = [2, 1]
    let got = OBJ.getQuoAndRest( 7, 3 )
    t.assert(want.toString === got.toString, "Expect: 2 1")
    //Test 2
    want = [-2, 1]
    got = OBJ.getQuoAndRest( 7, -3 )
    t.assert(want.toString === got.toString, "Expect: -2 1")
    //Test 3
    want = [3, 2]
    got = OBJ.getQuoAndRest( -7, -3 )
    t.assert(want.toString === got.toString, "Expect: 3 2")

    t.end()
})

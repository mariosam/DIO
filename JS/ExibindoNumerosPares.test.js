/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./ExibindoNumerosPares.js')

TEST('Starting ExibindoNumerosPares test...', (t) => {
    //Test 1
    let want = [2, 4, 6]
    let got = OBJ.countEve( 6 )
    t.assert(want.toString === got.toString, "Expect: 6 = 2, 4, 6")
    //Test 2
    want = [2, 4, 6, 8, 10, 12]
    got = OBJ.countEve( 13 )
    t.assert(want.toString === got.toString, "Expect: 13 = 2, 4, 6, 8, 10, 12")

    t.end()
})

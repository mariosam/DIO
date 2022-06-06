/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./ProibidoEntradaDeMenores.js')

TEST('Starting ProibidoEntradaDeMenores test...', (t) => {
    //Test 1
    let want = [4, 15]
    let got = OBJ.forbidenUnder18( [4, 18, 22, 15, 50] )
    t.assert(want.toString === got.toString, "Expect: 4, 15")
    //Test 2
    want = [6, 12, 17, 8]
    got = OBJ.forbidenUnder18( [6, 54, 12, 30, 17, 8, 24] )
    t.assert(want.toString === got.toString, "Expect: 6, 12, 17, 8")
    //Test 3
    want = [15]
    got = OBJ.forbidenUnder18( [18, 22, 15, 99] )
    t.assert(want.toString === got.toString, "Expect: 15")

    t.end()
})

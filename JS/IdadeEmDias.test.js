/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./IdadeEmDias.js')

TEST('Starting IdadeEmDias test...', (t) => {
    //Test 1
    let want = [1, 1, 5]
    let got = OBJ.splitAgeDays( 400 )
    t.assert(want.toString === got.toString, "Expect: 1 ano(s) 1 mes(es) 5 dia(s)")
    //Test 2
    want = [2, 2, 10]
    got = OBJ.splitAgeDays( 800 )
    t.assert(want.toString === got.toString, "Expect: 2 ano(s) 2 mes(es) 10 dia(s)")
    //Test 3
    want = [0, 1, 0]
    got = OBJ.splitAgeDays( 30 )
    t.assert(want.toString === got.toString, "Expect: 0 ano(s) 1 mes(es) 0 dia(s)")

    t.end()
})

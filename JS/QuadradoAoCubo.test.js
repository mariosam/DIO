/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./QuadradoAoCubo.js')

TEST('Starting QuadradoAoCubo test...', (t) => {
    //Test 1
    let want = [[1,1,1], [2,4,8], [3,9,27], [4,16,64], [5,25,125]]
    let got = OBJ.loadSquareAndCumbe( 5 )
    t.assert(want.toString === got.toString, "Expect: 5 = [1,1,1]...[5,25,125]")

    t.end()
})

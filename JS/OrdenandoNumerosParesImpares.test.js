/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./OrdenandoNumerosParesImpares.js')

TEST('Starting OrdenandoNumerosParesImpares test...', (t) => {
    //Test 1
    let want = [4, 32, 34, 98, 654, 3456, 6789, 567, 543, 87]
    let got = OBJ.orderOddsEvenNumbers( [4, 32, 34, 543, 3456, 654, 567, 87, 6789, 98] )
    t.assert(want.toString === got.toString, "Expect: 4, 32, 34, 98, 654, 3456, 6789, 567, 543, 87")
    //Test 2
    want = [6, 10, 7, 5]
    got = OBJ.orderOddsEvenNumbers( [10, 5, 6, 7] )
    t.assert(want.toString === got.toString, "Expect: 6, 10, 7, 5")

    t.end()
})

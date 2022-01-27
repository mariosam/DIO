/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./AnaliseDeNumeros.js')

TEST('Starting AnaliseDeNumeros test...', (t) => {
    //Test 1
    let want = [3, 2, 1, 3]
    let ops = [-5, 0, -3, -4, 12]
    let got = OBJ.numberAnalysis( ops )
    t.assert(want.toString === got.toString, "Expect: [-5, 0, -3, -4, 12] = [3, 2, 1, 3]")

    t.end()
})

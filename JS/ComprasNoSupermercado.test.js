/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./ComprasNoSupermercado.js')

TEST('Starting ComprasNoSupermercado test...', (t) => {
    //Test 1
    let want = ["carne", "laranja", "picles", "suco"]
    let ops = ["carne", "laranja", "suco", "picles", "laranja", "picles"]
    let got = OBJ.checkMyList( ops )
    t.assert(want.toString === got.toString, "Expect: [carne laranja suco picles laranja picles] = carne laranja picles suco")
    //Test 2
    want = ["laranja", "pera"]
    ops = ["laranja", "pera", "laranja", "pera", "pera"]
    got = OBJ.checkMyList( ops )
    t.assert(want.toString === got.toString, "Expect: [laranja pera laranja pera pera] = laranja pera")

    t.end()
})

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./BrinquedosDoPapaiNoel.js')

TEST('Starting BrinquedosDoPapaiNoel test...', (t) => {
    //Test 1
    let want = [2, 3]
    let got = OBJ.howManyToys( ["Milena F", "Joao M", "Rafaela F", "Renata F", "Felipe M"] )
    t.assert(want.toString === got.toString, "Expect: 2, 3 = Milena F, Joao M...")

    t.end()
})

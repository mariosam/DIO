/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./NotasDaProva.js')

TEST('Starting NotasDaProva test...', (t) => {
    //Test 1
    t.assert(OBJ.takeResult(12) === "D", "Expect: 12 = D")
    //Test 2
    t.assert(OBJ.takeResult(87) === "A", "Expect: 87 = A")
    //Test 3
    t.assert(OBJ.takeResult(0) === "E", "Expect: 0 = E")

    t.end()
})

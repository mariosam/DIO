/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./FrotaDeTaxi.js')

TEST('Starting FrotaDeTaxi test...', (t) => {
    //Test 1
    t.assert(OBJ.moreEconomic(1.20, 2.30, 10.00, 15.00) === "A", "Expect: 1.20, 2.30, 10.00, 15.00 = A")
    //Test 2
    t.assert(OBJ.moreEconomic(1.00, 1.00, 9.00, 9.01) === "G", "Expect: 1.00, 1.00, 9.00, 9.01 = G")
    //Test 3
    t.assert(OBJ.moreEconomic(1.00, 1.00, 11.00, 11.00) === "G", "Expect: 1.00, 1.00, 11.00, 11.00 = G")

    t.end()
})

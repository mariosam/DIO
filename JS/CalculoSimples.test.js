/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./CalculoSimples.js')

TEST('Starting CalculoSimples test...', (t) => {
    //Test 1
    t.assert(OBJ.calcTotalToPay([12, 1, 5.30], [16, 2, 5.10]) === 15.50, "Expect: 15.50")
    //Test 2
    t.assert(OBJ.calcTotalToPay([13, 2, 15.30], [161, 4, 5.20]) === 51.40, "Expect: 51.40")
    //Test 3
    t.assert(OBJ.calcTotalToPay([1, 1, 15.10], [2, 1, 15.10]) === 30.20, "Expect: 30.20")

    t.end()
})

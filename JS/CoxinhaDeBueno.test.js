/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./CoxinhaDeBueno.js')

TEST('Starting CoxinhaDeBueno test...', (t) => {
    //Test 1
    t.assert(OBJ.calcCoxinha(10, 90) === "0.11", "Expect: 10 90 = 0.11")
    //Test 2
    t.assert(OBJ.calcCoxinha(840, 11) === "76.36", "Expect: 840 11 = 76.36")
    //Test 3
    t.assert(OBJ.calcCoxinha(1, 50) === "0.02", "Expect: 1 50 = 0.02")
    //Test 4
    t.assert(OBJ.calcCoxinha(9, 90) === "0.10", "Expect: 9 90 = 0.10")

    t.end()
})
 

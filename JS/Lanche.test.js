/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Lanche.js')

TEST('Starting Lanche test...', (t) => {
    //Test 1
    t.assert(OBJ.totalToPay(3, 2) === 10.00, "Expect: 3, 2 = 10.00")
    //Test 2
    t.assert(OBJ.totalToPay(4, 3) === 6.00, "Expect: 4, 3 = 6.00")
    //Test 3
    t.assert(OBJ.totalToPay(2, 3) === 13.50, "Expect: 2, 3 = 13.50")

    t.end()
})
 

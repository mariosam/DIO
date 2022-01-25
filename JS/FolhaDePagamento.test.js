/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./FolhaDePagamento.js')

TEST('Starting FolhaDePagamento test...', (t) => {
    //Test 1
    t.assert(OBJ.calcSalary(100, 5.50) === 550.00, "Expect: 100, 5.50 = 550.00")
    //Test 2
    t.assert(OBJ.calcSalary(200, 20.50) === 4100.00, "Expect: 200, 20.50 = 4100.00")
    //Test 3
    t.assert(OBJ.calcSalary(145, 15.55) === 2254.75, "Expect: 145, 15.55 = 2254.75")

    t.end()
})

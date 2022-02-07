/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Pneu.js')

TEST('Starting Pneu test...', (t) => {
    //Test 1
    t.assert(OBJ.difPression(30, 18) === 12, "Expect: 30, 18 = 12")
    //Test 2
    t.assert(OBJ.difPression(27, 27) === 0, "Expect: 27, 27 = 0")
    //Test 3
    t.assert(OBJ.difPression(27, 30) === -3, "Expect: 27, 30 = -3")

    t.end()
})

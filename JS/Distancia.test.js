/**
 * @version JAVASCRIPT (ES6)
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Distancia.js')

TEST('Starting Distancia test...', (t) => {
    //Test 1
    t.assert(OBJ.reportMinutes(30) === 60, "Expect: 60 minutes")
    //Test 2
    t.assert(OBJ.reportMinutes(110) === 220, "Expect: 220 minutes")

    t.end()
})

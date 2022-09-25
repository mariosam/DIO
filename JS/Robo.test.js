/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Robo.js')

TEST('Starting Robo test...', (t) => {
    //Test 1
    t.assert(OBJ.originPosition("WS") === true, "Expect: true")
    //Test 2
    t.assert(OBJ.originPosition("AA") === false, "Expect: false")

    t.end()
})

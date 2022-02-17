/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Resto2.js')

TEST('Starting Resto2 test...', (t) => {
    //Test 1
    OBJ.printAllRest2(20)

    t.end()
})
 

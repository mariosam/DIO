/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./OEscolhido.js')

TEST('Starting OEscolhido test...', (t) => {
    //Test 1
    t.assert(OBJ.checkingHighestNote(["1000 5", "1001 10", "1002 6"]) === "1001", "Expect: 1001")
    //Test 2
    t.assert(OBJ.checkingHighestNote(["900775 5.7", "201553 7.9", "5032 6.2", "2088 2.1"]) === "Minimum note not reached", "Expect: Minimum note not reached")

    t.end()
})

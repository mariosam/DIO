/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./DuasNotas.js')

TEST('Starting DuasNotas test...', (t) => {
    //Test 1
    t.assert(OBJ.hasTwoNotesChange(11, 23) === "possible", "Expect: possible")
    //Test 2
    t.assert(OBJ.hasTwoNotesChange(500, 650) === "possible", "Expect: possible")
    //Test 3
    t.assert(OBJ.hasTwoNotesChange(100, 600) === "impossible", "Expect: impossible")
    //Test 4
    t.assert(OBJ.hasTwoNotesChange(9948, 9963) === "possible", "Expect: possible")
    //Test 5
    t.assert(OBJ.hasTwoNotesChange(1, 2) === "impossible", "Expect: impossible")
    //Test 6
    t.assert(OBJ.hasTwoNotesChange(2, 4) === "impossible", "Expect: impossible")

    t.end()
})

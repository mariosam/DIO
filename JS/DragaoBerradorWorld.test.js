/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./DragaoBerradorWorld.js')

TEST('Starting DragaoBerradorWorld test...', (t) => {
    //Test 1
    want = 5
    inp = [8, 160, 182]
    ops = [160, 182, 183, 159, 250, 170, 172, 173]
    t.assert(OBJ.numberOfGuests( inp, ops ) === want, "Expect: 5")
    //Test 2
    want = 2
    inp = [5, 155, 176]
    ops = [149, 154, 172, 182, 167]
    t.assert(OBJ.numberOfGuests( inp, ops ) === want, "Expect: 2")

    t.end()
})
 

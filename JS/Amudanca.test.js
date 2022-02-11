/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Amudanca.js')

TEST('Starting Amudanca test...', (t) => {
    //Test 1
    t.assert(OBJ.salutation(0) === "Bom Dia!!", "Expect: 0 = Bom Dia!!")
    //Test 2
    t.assert(OBJ.salutation(45) === "Bom Dia!!", "Expect: 45 = Bom Dia!!")
    //Test 3
    t.assert(OBJ.salutation(360) === "Bom Dia!!", "Expect: 360 = Bom Dia!!")
    //Test 4
    t.assert(OBJ.salutation(90) === "Boa Tarde!!", "Expect: 90 = Bom Tarde!!")
    //Test 5
    t.assert(OBJ.salutation(180) === "Boa Noite!!", "Expect: 180 = Bom Noite!!")

    t.end()
})

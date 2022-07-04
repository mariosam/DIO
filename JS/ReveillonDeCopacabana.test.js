/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./ReveillonDeCopacabana.js')

TEST('Starting ReveillonDeCopacabana test...', (t) => {
    //Test 1
    t.assert(OBJ.howManyOrdersPerPeople(13) === 25, "Expect: 25")
    //Test 2
    t.assert(OBJ.howManyOrdersPerPeople(37) === 73, "Expect: 37")
    //Test 3
    t.assert(OBJ.howManyOrdersPerPeople(49) === 97, "Expect: 97")
    //Test 4
    t.assert(OBJ.howManyOrdersPerPeople(11) === 21, "Expect: 21")
    //Test 5
    t.assert(OBJ.howManyOrdersPerPeople(9) === 17, "Expect: 17")
    //Test 6
    t.assert(OBJ.howManyOrdersPerPeople(5) === 9, "Expect: 9")
    //Test 7
    t.assert(OBJ.howManyOrdersPerPeople(17) === 33, "Expect: 33")

    t.end()
})

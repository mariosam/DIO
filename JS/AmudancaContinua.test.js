/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./AmudancaContinua.js')

TEST('Starting AmudancaContinua test...', (t) => {
    //Test 1
    let want = ["Bom Dia!!","06","06","00"]
    let got = OBJ.salutationTime( 1.50 )
    t.assert(want.toString === got.toString, "Expect: 1.50 = Bom Dia!! 06:06:00")
    //Test 2
    want = ["Boa Tarde!!","12","22","00"]
    got = OBJ.salutationTime( 95.5 )
    t.assert(want.toString === got.toString, "Expect: 95.5 = Boa Tarde!! 12:22:00")
    //Test 3
    want = ["Boa Noite!!","18","30","00"]
    got = OBJ.salutationTime( 187.5 )
    t.assert(want.toString === got.toString, "Expect: 187.5 = Boa Noite!! 18:30:00")
    //Test 4
    want = ["De Madrugada!!","00","38","00"]
    got = OBJ.salutationTime( 279.5 )
    t.assert(want.toString === got.toString, "Expect: 279.5 = De Madrugada!! 00:38:00")

    t.end()
})

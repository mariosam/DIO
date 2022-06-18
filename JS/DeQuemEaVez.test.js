/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./DeQuemEaVez.js')

TEST('Starting DeQuemEaVez test...', (t) => {
    //Test 1
    t.assert(OBJ.evenOrOdd(["Quico", "PAR", "Chiquinha", "IMPAR", "9", "7"]) === "Quico", "Expect: Quico")
    //Test 2
    t.assert(OBJ.evenOrOdd(["Dami", "PAR", "Marcus", "IMPAR", "12", "3"]) === "Marcus", "Expect: Marcus")
    //Test 3
    t.assert(OBJ.evenOrOdd(["Dayran", "PAR", "Conrado", "IMPAR", "3", "1000000000"]) === "Conrado", "Expect: Conrado")
    //Test 4
    t.assert(OBJ.evenOrOdd(["Popis", "PAR", "Chaves", "IMPAR", "2", "7"]) === "Chaves", "Expect: Chaves")

    t.end()
})

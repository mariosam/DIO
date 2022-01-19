/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./BatalhaDeDigitrons.js')

TEST('Starting BatalhaDeDigitrons test...', (t) => {
    //Test 1
    t.assert(OBJ.winnerBattle(5, [12, 23, 15], [42, 12, 20]) === "Guarte", "Expect: 5, {12, 23, 15}, {42, 12, 20} = Guarte")
    //Test 2
    t.assert(OBJ.winnerBattle(2, [52, 1, 11], [1, 52, 1]) === "Empate", "Expect: 2, {52, 1, 11}, {1, 52, 1} = Empate")
    //Test 3
    t.assert(OBJ.winnerBattle(3, [95, 12, 22], [5, 51, 21]) === "Bruno", "Expect: 3, {95, 12, 22}, {5, 51, 21} = Bruno")

    t.end()
})

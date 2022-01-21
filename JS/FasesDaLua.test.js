/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./FasesDaLua.js')

TEST('Starting FasesDaLua test...', (t) => {
    //Test 1
    t.assert(OBJ.moonFase(0, 2) === "nova", "Expect: 0, 2 = nova")
    //Test 2
    t.assert(OBJ.moonFase(2, 3) === "crescente", "Expect: 2, 3 = crescente")
    //Test 3
    t.assert(OBJ.moonFase(99, 97) === "cheia", "Expect: 99, 97 = cheia")
    //Test 4
    t.assert(OBJ.moonFase(97, 94) === "minguante", "Expect: 97, 94 = minguante")
    //Test 5
    t.assert(OBJ.moonFase(30, 35) === "crescente", "Expect: 30, 35 = crescente")

    t.end()
})

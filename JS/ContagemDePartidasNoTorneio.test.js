/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./ContagemDePartidasNoTorneio.js')

TEST('Starting ContagemDePartidasNoTorneio test...', (t) => {
    //Test 1
    let want = 6
    let ops = 7
    t.assert(OBJ.numberOfGames( ops ) === want, "Expect: 6")
    //Test 2
    want = 13
    ops = 14
    t.assert(OBJ.numberOfGames( ops ) === want, "Expect: 13")

    t.end()
})

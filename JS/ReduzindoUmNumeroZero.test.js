/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./ReduzindoUmNumeroZero.js')

TEST('Starting ReduzindoUmNumeroZero test...', (t) => {
    //Test 1
    let want = 6
    let ops = 14
    t.assert(OBJ.reduceNumber( ops ) === want, "Expect: 6")
    //Test 2
    want = 4
    ops = 8
    t.assert(OBJ.reduceNumber( ops ) === want, "Expect: 4")

    t.end()
})

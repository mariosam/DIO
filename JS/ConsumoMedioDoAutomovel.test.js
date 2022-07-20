/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./ConsumoMedioDoAutomovel.js')

TEST('Starting ConsumoMedioDoAutomovel test...', (t) => {
    //Test 1
    let want = 14.286
    t.assert(OBJ.averageConsumption( 500, 35.0 ) === want, "Expect: 14.286")
    //Test 2
    want = 18.119
    t.assert(OBJ.averageConsumption( 2254, 124.4 ) === want, "Expect: 18.119")
    //Test 3
    want = 9.802
    t.assert(OBJ.averageConsumption( 4554, 464.6 ) === want, "Expect: 9.802")

    t.end()
})

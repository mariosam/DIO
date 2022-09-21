/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./ContandoNumerosPares.js')

TEST('Starting ContandoNumerosPares test...', (t) => {
    //Test 1
    let want = 2
    let got = OBJ.countEven( 4 ) 
    t.assert( got === want, "Expect: "+want+" - the return was: "+got)
    //Test 2
    want = 14
    got = OBJ.countEven( 30 )
    t.assert( got === want, "Expect: "+want+" - the return was: "+got)

    t.end()
})

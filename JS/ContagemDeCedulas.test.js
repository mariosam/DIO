/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./ContagemDeCedulas.js')
 
 TEST('Starting ContagemDeCedulas test...', (t) => {
     //Test 1
     let want = [5, 1, 1, 0, 1, 0, 1]
     let got = OBJ.countNotes( 576 )
     t.assert(want.toString === got.toString, "Expect: 576 = 5, 1, 1, 0, 1, 0, 1")
     //Test 2
     want = [112, 1, 0, 0, 1, 1, 0]
     got = OBJ.countNotes( 11257 )
     t.assert(want.toString === got.toString, "Expect: 11257 = 112, 1, 0, 0, 1, 1, 0")
     //Test 3
     want = [5, 0, 0, 0, 0, 1, 1]
     got = OBJ.countNotes( 503 )
     t.assert(want.toString === got.toString, "Expect: 503 = 5, 0, 0, 0, 0, 1, 1")
 
     t.end()
 })
 

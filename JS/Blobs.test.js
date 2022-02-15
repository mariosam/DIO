/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./Blobs.js')
 
 TEST('Starting Blobs test...', (t) => {
     //Test 1
     t.assert(OBJ.countDays(40.0) === 6, "Expect: 40.0 = 6")
     //Test 2
     t.assert(OBJ.countDays(200.0) === 8, "Expect: 200.0 = 8")
     //Test 3
     t.assert(OBJ.countDays(300.0) === 9, "Expect: 300.0 = 9")
 
     t.end()
 })
 

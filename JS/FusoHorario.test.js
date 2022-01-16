/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./FusoHorario.js')
 
 TEST('Starting FusoHorario test...', (t) => {
     //Test 1
     t.assert(OBJ.localTime(10, 7, 3) === 20, "Expect: 10,7,3 = 20")
     //Test 2
     t.assert(OBJ.localTime(22, 6, -2) === 2, "Expect: 22,6,-2 = 2")
     //Test 3
     t.assert(OBJ.localTime(0, 3, -4) === 23, "Expect: 0,3,-4 = 23")
 
     t.end()
 })
 

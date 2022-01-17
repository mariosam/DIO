/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./Dama.js')
 
 TEST('Starting Dama test...', (t) => {
     //Test 1
     t.assert(OBJ.minMoviments(4, 4, 6, 2) === 1, "Expect: 4, 4, 6, 2 = 1")
     //Test 2
     t.assert(OBJ.minMoviments(3, 5, 3, 5) === 0, "Expect: 3, 5, 3, 5 = 0")
     //Test 3
     t.assert(OBJ.minMoviments(5, 5, 4, 3) === 2, "Expect: 5, 5, 4, 3 = 2")
 
     t.end()
 })
 

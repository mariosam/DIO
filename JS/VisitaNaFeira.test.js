/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./VisitaNaFeira.js')
 
 TEST('Starting VisitaNaFeira test...', (t) => {
     //Test 1
     t.assert(OBJ.totalPeppers(11, 7) === 18, "Expect: 11, 7 = 18")
     //Test 2
     t.assert(OBJ.totalPeppers(-11, 6) === -5, "Expect: -11, 6 = -5")
     //Test 3
     t.assert(OBJ.totalPeppers(11, -2) === 9, "Expect: 11, -2 = 9")
 
     t.end()
 })
 

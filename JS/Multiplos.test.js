/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./Multiplos.js')
 
 TEST('Starting Multiplos test...', (t) => {
     //Test 1
     t.assert(OBJ.areTheyMulti(6, 24) === "Sao Multiplos", "Expect: 6, 24 = Sao Multiplos")
     //Test 2
     t.assert(OBJ.areTheyMulti(6, 25) === "Nao sao Multiplos", "Expect: 6, 25 = Nao sao Multiplos")
 
     t.end()
 })
 

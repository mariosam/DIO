/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./SomaDeNumerosNaturais.js')
 
 TEST('Starting SomaDeNumerosNaturais test...', (t) => {
     //Test 1
     t.assert(OBJ.sumAllNaturals(1, 5) === 15, "Expect: 15")
     //Test 2
     t.assert(OBJ.sumAllNaturals(1, 1000) === 500500, "Expect: 500500")
 
     t.end()
 })
 

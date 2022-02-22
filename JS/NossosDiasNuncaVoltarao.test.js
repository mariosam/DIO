/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./NossosDiasNuncaVoltarao.js')
 
 TEST('Starting NossosDiasNuncaVoltarao test...', (t) => {
     //Test 1
     t.assert(OBJ.cutWord(1) === "L", "Expect: 1 = L")
     //Test 2
     t.assert(OBJ.cutWord(3) === "LIF", "Expect: 3 = LIF")
     //Test 3
     t.assert(OBJ.cutWord(7) === "LIFE IS", "Expect: 7 = LIFE IS")
 
     t.end()
 })
 

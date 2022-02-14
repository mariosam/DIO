/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./GuilhermeSuasPipas.js')
 
 TEST('Starting GuilhermeSuasPipas test...', (t) => {
     //Test 1
     t.assert(OBJ.numberOfTwine(4) === 2, "Expect: 4 = 2")
     //Test 2
     t.assert(OBJ.numberOfTwine(10) === 35, "Expect: 10 = 35")
     //Test 3
     t.assert(OBJ.numberOfTwine(11) === 44, "Expect: 11 = 44")
 
     t.end()
 })
 

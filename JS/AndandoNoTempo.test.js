/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./AndandoNoTempo.js')
 
 TEST('Starting AndandoNoTempo test...', (t) => {
     //Test 1
     t.assert(OBJ.possibleTravel(22, 5, 22) === "S", "Expect: 22, 5, 22 = S")
     //Test 2
     t.assert(OBJ.possibleTravel(31, 110, 79) === "S", "Expect: 31, 110, 79 = S")
     //Test 3
     t.assert(OBJ.possibleTravel(45, 8, 7) === "N", "Expect: 45, 8, 7 = N")
 
     t.end()
 })
 

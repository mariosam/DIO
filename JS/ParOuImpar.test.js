/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./ParOuImpar.js')
 
 TEST('Starting ParOuImpar test...', (t) => {
     //Test 1
     t.assert(OBJ.typeNumberMsg(-5) === "ODD NEGATIVE", "Expect: -5 = ODD NEGATIVE")
     //Test 2
     t.assert(OBJ.typeNumberMsg(0) === "NULL", "Expect: 0 = NULL")
     //Test 3
     t.assert(OBJ.typeNumberMsg(3) === "ODD POSITIVE", "Expect: 3 = ODD POSITIVE")
     //Test 4
     t.assert(OBJ.typeNumberMsg(-4) === "EVEN NEGATIVE", "Expect: -4 = EVEN NEGATIVE")
 
     t.end()
 })
 

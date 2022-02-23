/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./Triangulo.js')
 
 TEST('Starting Triangulo test...', (t) => {
     //Test 1
     t.assert(OBJ.calcArea(6.0, 4.0, 2.0) === "Area = 10.0", "Expect: 6.0, 4.0, 2.0 = 10.00")
     //Test 2
     t.assert(OBJ.calcArea(6.0, 4.0, 2.1) === "Perimetro = 12.1", "Expect: 6.0, 4.0, 2.1 = 12.1")
 
     t.end()
 })
  

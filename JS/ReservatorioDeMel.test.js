/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./ReservatorioDeMel.js')
 
 TEST('Starting ReservatorioDeMel test...', (t) => {
     //Test 1
     t.assert(OBJ.getHigh(1450.00, 25.00) === 2.96, "Expect: 1450.00, 25.00 = 2.96")
     //Test 2
     t.assert(OBJ.getHigh(760.00, 40.00) === 0.61, "Expect: 760.00, 40.00 = 0.61")
     //Test 3
     t.assert(OBJ.getHigh(7500.00, 15.00) === 42.46, "Expect: 7500.00, 15.00 = 42.46")

     //Test 1
     t.assert(OBJ.getArea(25.00) === 490.62, "Expect: 25.00 = 490.62")
     //Test 2
     t.assert(OBJ.getArea(40.00) === 1256.00, "Expect: 40.00 = 1256.00")
     //Test 3
     t.assert(OBJ.getArea(15.00) === 176.62, "Expect: 15.00 = 176.62")
 
     t.end()
 })
  

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./MacPronalts.js')
 
 TEST('Starting MacPronalts test...', (t) => {
     //Test 1
     t.assert(OBJ.shopValue([1001, 1005], [2, 3]) === 19.50, "Expect: {1001, 1005}, {2, 3} = 19.50")
     //Test 2
     t.assert(OBJ.shopValue([1003], [500]) === 1750.00, "Expect: {1003}, {500} = 1750.00")
     //Test 3
     t.assert(OBJ.shopValue([1001, 1005, 1003, 1002, 1004], [500, 300, 23, 52, 44]) === 2808.50, "Expect: {1001, 1005, 1003, 1002, 1004}, {500, 300, 23, 52, 44} = 2808.50")
 
     t.end()
 })
 

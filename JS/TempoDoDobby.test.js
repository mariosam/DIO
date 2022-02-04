/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./TempoDoDobby.js')
 
 TEST('Starting TempoDoDobby test...', (t) => {
     //Test 1
     t.assert(OBJ.todayOrTomorrow(20, 15, 6) === "Deixa para amanha!", "Expect: 20, 15, 6 = Deixa para amanha!")
     //Test 2
     t.assert(OBJ.todayOrTomorrow(20, 10, 10) === "Farei hoje!", "Expect: 20, 10, 10 = Farei hoje!")
 
     t.end()
 })
 

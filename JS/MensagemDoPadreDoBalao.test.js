/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./MensagemDoPadreDoBalao.js')
 
 TEST('Starting MensagemDoPadreDoBalao test...', (t) => {
     //Test 1
     t.assert(OBJ.decodeMsg("ABCDEFGHIJKLMNOPQRSTUVWXYZ", [8, 5, 12, 16]) === "HELP", "Expect: 5, {8, 5, 12, 16} = HELP")
     //Test 2
     t.assert(OBJ.decodeMsg("QWERTYUIOPASDFGHJKLZXCVBNM", [16, 3, 19, 19, 9, 2, 9, 4, 19, 13]) === "HELLOWORLD", "Expect: 2, {16, 3, 19, 19, 9, 2, 9, 4, 19, 13} = HELLOWORLD")
     //Test 3
     t.assert(OBJ.decodeMsg("ABCDEFGHIJKLMNOPQRSTUVWXYZ", [16, 18, 15, 7, 18, 1, 13, 13, 5, 18]) === "PROGRAMMER", "Expect: 3, {16, 18, 15, 7, 18, 1, 13, 13, 5, 18} = PROGRAMMER")
 
     t.end()
 })
 

/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./TesteDeSelecao1.js')
 
 TEST('Starting TesteDeSelecao1 test...', (t) => {
     //Test 1
     t.assert(OBJ.checkSequence(5, 6, 7, 8) === "Valores nao aceitos", "Expect: 5, 6, 7, 8 = Valores nao aceitos")
     //Test 2
     t.assert(OBJ.checkSequence(2, 3, 2, 6) === "Valores aceitos", "Expect: 2, 3, 2, 6 = Valores aceitos")
 
     t.end()
 })
 

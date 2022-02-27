/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
 const TEST = require('tape')
 const OBJ = require('./ProgramaValidacaoDeNotas.js')
 
 TEST('Starting ProgramaValidacaoDeNotas test...', (t) => {
     //Test 1
     let want = ["nota invalida","nota invalida","media = 6.75","novo calculo (1-sim 2-nao)","novo calculo (1-sim 2-nao)","media = 8.50","novo calculo (1-sim 2-nao)"]
     let ops = [-3.5, 3.5, 11.0, 10.0, 4, 1, 8.0, 9.0, 2, 7.0]
     let got = OBJ.calculateGrade( ops )
     t.assert(want.toString === got.toString, "Expect: [-3.5, 3.5, 11.0, 10.0, 4, 1, 8.0, 9.0, 2] = ...novo calculo (1-sim 2-nao)")
 
     t.end()
 })
 

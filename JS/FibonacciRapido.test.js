/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./FibonacciRapido.js')

TEST('Starting FibonacciRapido test...', (t) => {
    //Test 1
    t.assert(OBJ.binetFormule(1) === 1.0, "Expect: 1 = 1.0")
    //Test 2
    t.assert(OBJ.binetFormule(2) === 1.0, "Expect: 2 = 1.0")
    //Test 3
    t.assert(OBJ.binetFormule(3) === 2.0, "Expect: 3 = 2.0")
    //Test 4
    t.assert(OBJ.binetFormule(19) === 4181.0, "Expect: 19 = 4181.0")

    t.end()
})

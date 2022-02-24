/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./TriangulosPoligonosRegulares.js')

TEST('Starting TriangulosPoligonosRegulares test...', (t) => {
    //Test 1
    t.assert(OBJ.minTriangules(3) === 1, "Expect: 3 = 1")
    //Test 2
    t.assert(OBJ.minTriangules(4) === 2, "Expect: 4 = 2")
    //Test 3
    t.assert(OBJ.minTriangules(5) === 3, "Expect: 5 = 3")

    t.end()
})

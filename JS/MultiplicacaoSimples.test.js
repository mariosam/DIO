/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./MultiplicacaoSimples.js')

TEST('Starting MultiplicacaoSimples test...', (t) => {
    //Test 1
    t.assert(OBJ.getMulti(3, 9) === 27, "Expect: 3, 9 = 27")
    //Test 2
    t.assert(OBJ.getMulti(-30, 10) === -300, "Expect: -30, 10 = -300")
    //Test 3
    t.assert(OBJ.getMulti(0, 9) === 0, "Expect: 0, 9 = 0")

    t.end()
})

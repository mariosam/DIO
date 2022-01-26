/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./DDD.js')

TEST('Starting DDD test...', (t) => {
    //Test 1
    t.assert(OBJ.dddCity(11) === "Sao Paulo", "Expect: 11 = Sao Paulo")
    //Test 2
    t.assert(OBJ.dddCity(13) === "DDD nao cadastrado", "Expect: 13 = DDD nao cadastrado")

    t.end()
})

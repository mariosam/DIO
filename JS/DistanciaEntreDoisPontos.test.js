/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./DistanciaEntreDoisPontos.js')

TEST('Starting DistanciaEntreDoisPontos test...', (t) => {
    //Test 1
    t.assert(OBJ.getDistance(1.0, 7.0, 5.0, 9.0) === "4.4721", "Expect: 4.4721")
    //Test 2
    t.assert(OBJ.getDistance(-2.5, 0.4, 12.1, 7.3) === "16.1484", "Expect: 16.1484")
    //Test 3
    t.assert(OBJ.getDistance(2.5, -0.4, -12.2, 7.0) === "16.4575", "Expect: 16.4575")

    t.end()
})

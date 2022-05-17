/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./Dragao.js')

TEST('Starting Dragao test...', (t) => {
    //Test 1
    t.assert(OBJ.checkEnergyLevel(8001) === "Mais de 8000!", "Expect: 8001 = Mais de 8000!")
    //Test 2
    t.assert(OBJ.checkEnergyLevel(100) === "Inseto!", "Expect: 100 = Inseto!")
    //Test 3
    t.assert(OBJ.checkEnergyLevel(200) === "Inseto!", "Expect: 200 = Inseto!")

    t.end()
})

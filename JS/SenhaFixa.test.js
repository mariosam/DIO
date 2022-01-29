/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./SenhaFixa.js')

TEST('Starting SenhaFixa test...', (t) => {
    //Test 1
    t.assert(OBJ.checkPass(2200) === "Senha Invalida", "Expect: 2200 = Senha Invalida")
    //Test 2
    t.assert(OBJ.checkPass(1020) === "Senha Invalida", "Expect: 1020 = Senha Invalida")
    //Test 3
    t.assert(OBJ.checkPass(2022) === "Senha Invalida", "Expect: 2022 = Senha Invalida")
    //Test 4
    t.assert(OBJ.checkPass(2002) === "Acesso Permitido", "Expect: 2002 = Acesso Permitido")

    t.end()
})

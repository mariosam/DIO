/**
 * @version JAVASCRIPT ECMAScript 6
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./ValidadorDeSenhasComRequisitos.js')

TEST('Starting ValidadorDeSenhasComRequisitos test...', (t) => {
    //Test 1
    t.assert(OBJ.passwordValidator("Digital Innovation One") === "Senha invalida.", "Expect: Senha invalida.")
    //Test 2
    t.assert(OBJ.passwordValidator("AbcdEfgh99") === "Senha valida.", "Expect: Senha valida.")
    //Test 3
    t.assert(OBJ.passwordValidator("DigitalInnovationOne123") === "Senha valida.", "Expect: Senha valida.")
    //Test 4
    t.assert(OBJ.passwordValidator("Digital Innovation One 123") === "Senha invalida.", "Expect: Senha invalida.")
    //Test 5
    t.assert(OBJ.passwordValidator("Aass9") === "Senha invalida.", "Expect: Senha invalida.")
    //Test 6
    t.assert(OBJ.passwordValidator("Aassd9") === "Senha valida.", "Expect: Senha valida.")
    //Test 7
    t.assert(OBJ.passwordValidator("Aa@ssd9!") === "Senha invalida.", "Expect: Senha invalida.")
    //Test 8
    t.assert(OBJ.passwordValidator("DIO123456") === "Senha invalida.", "Expect: Senha invalida.")
    //Test 9
    t.assert(OBJ.passwordValidator("Ano2020") === "Senha valida.", "Expect: Senha valida.")
    //Test 10
    t.assert(OBJ.passwordValidator("Digita!123") === "Senha invalida.", "Expect: Senha invalida.")

    t.end()
})

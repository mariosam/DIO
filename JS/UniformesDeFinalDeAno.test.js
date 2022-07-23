/**
 * @version JAVASCRIPT
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./UniformesDeFinalDeAno.js')

TEST('Starting UniformesDeFinalDeAno test...', (t) => {
    //Test 1
    let want = ["branco P Maria Joao","branco P Maria Jose","vermelho P Marcio Guess"]
    let ops = ["Maria Joao","branco P","Marcio Guess","vermelho P","Maria Jose","branco P"]
    let got = OBJ.uniformsInOrder( ops )
    t.assert(want.toString === got.toString, "Expect: 3 lines")
    //Test 2
    want = ["branco P Cezar Torres Mo","branco P Maria Jose","branco M JuJu Mentina","branco G Adabi Finho","branco G Severina Rigudinha","vermelho P Amaro Dinha","vermelho P Baka Lhau","vermelho P Carlos Chade Losna","vermelho P Mangojata Mancuda"]
    ops = ["Maria Jose","branco P","Mangojata Mancuda","vermelho P","Cezar Torres Mo","branco P","Baka Lhau","vermelho P","JuJu Mentina","branco M","Amaro Dinha","vermelho P","Adabi Finho","branco G","Severina Rigudinha","branco G","Carlos Chade Losna","vermelho P"]
    got = OBJ.uniformsInOrder( ops )
    t.assert(want.toString === got.toString, "Expect: 9 lines")

    t.end()
})

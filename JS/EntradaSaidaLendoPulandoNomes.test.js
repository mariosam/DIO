/**
 * @version JAVASCRIPT (ES6)
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 * $ node NomeDaClasse.test
 */
const TEST = require('tape')
const OBJ = require('./EntradaSaidaLendoPulandoNomes.js')

TEST('Starting EntradaSaidaLendoPulandoNomes test...', (t) => {
    //Test 1
    let want = ["UFCG", "ITA", "URI"]
    let got = OBJ.giveMe379( ["USP","UFPE","UFCG","UFRN","UFRJ","IME","ITA","UNIOESTE","URI","UFG"] )
    t.assert(want.toString === got.toString, "Expect: UFCG ITA URI")
    //Test 2
    want = ["UNIFEI","UFRGS","UFU"]
    got = OBJ.giveMe379( ["UnB","UFMG","UNIFEI","UECE","UNICAMP","INATEL","UFRGS","UNIFESO","UFU","PUC"] )
    t.assert(want.toString === got.toString, "Expect: UNIFEI UFRGS UFU")

    t.end()
})

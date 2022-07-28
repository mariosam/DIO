/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import (
	"encoding/json"
	"sort"
	"strings"
)

/**
 * Return the order of uniforms in the array
 */
func uniformsInOrder(inputs []string) []string {
	var result []ListUniform

	//guarda os valores em um objeto
	//var obj = make(map[string]int)
	for i := 0; i < len(inputs); i++ {
		nome := inputs[i]
		i++
		temp := strings.Split(inputs[i], " ")
		cor := temp[0]
		tamanho := temp[1]

		var list = new(ListUniform)
		list.Color = cor
		list.Size = tamanho
		list.Names = nome

		//list := &ListUniform{cor, tamanho, nome}
		result = append(result, *list)
	}

	//criar uma ordem no objeto
	sort.Slice(result[:], func(i, j int) bool {
		return result[i].Color < result[j].Color
	})

	out, _ := json.Marshal(result)
	return strings.Split(string(out), ",")
	//return result
}

type ListUniform struct {
	Color string
	Size  string
	Names string
}

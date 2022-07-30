/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import (
	"sort"
	"strings"
)

/**
 * Return the order of uniforms in the array
 */
func uniformsInOrder(inputs []string) []string {
	var result []ListUniform

	//guarda os valores em um objeto
	for i := 0; i < len(inputs); i++ {
		nome := inputs[i]
		i++
		temp := strings.Split(inputs[i], " ")
		cor := temp[0]
		tamanho := temp[1]

		list := &ListUniform{cor, tamanho, nome}
		result = append(result, *list)
	}

	//criar uma ordem no objeto
	sort.Slice(result[:], func(i, j int) bool {
		if result[i].Color == result[j].Color {
			if result[i].Size == result[j].Size {
				return result[i].Names < result[j].Names
			}
			return result[i].Size > result[j].Size
		}
		return result[i].Color < result[j].Color
	})

	//formata o retorno dos dados (de object to array)
	var out []string
	for _, v := range result {
		out = append(out, v.Color+" "+v.Size+" "+v.Names)
	}

	return out
}

type ListUniform struct {
	Color string
	Size  string
	Names string
}

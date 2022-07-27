/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "strings"

/**
 * Return the order of uniforms in the array
 */
func uniformsInOrder(inputs []string) []string {
	var result []string

	//guarda os valores em um objeto
	var obj = make(map[string]int)
	for i :=0; i < len(inputs); i++ {
		nome := inputs[i]
		i++
		temp := strings.Split(inputs[i], " ")
		cor := temp[0]
		tamanho := temp[1]

		list := new ListUniform(nome, cor, tamanho)
		result = append(result, list)
	}

	//criar uma ordem no objeto

	return result
}

type ListUniform struct {
	color string
	size  string
	names string
}

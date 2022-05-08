/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import (
	"strconv"
	"strings"
)

/**
 * Check note of students to intercamb.
 */
func checkingHighestNote(students []string) string {
	var result string = "Minimum note not reached"

	//remove as matriculas e mantem apenas as notas
	var arrNotes []string
	for _, student := range students {
		arrNotes = append(arrNotes, student[strings.Index(student, " ")+1:])
	}

	//recupera a maior nota do array acima
	_, note := findMinAndMax(arrNotes)

	//se houver alguem aprovado
	if note >= 8 {
		//recupera a matricula do aluno com a maior nota
		for _, student := range students {
			var value, _ = strconv.ParseFloat(student[strings.Index(student, " ")+1:], 64)

			if value == note {
				result = student[:strings.Index(student, " ")]
				break
			}
		}
	}

	return result
}

func findMinAndMax(a []string) (min float64, max float64) {
	min, _ = strconv.ParseFloat(a[0], 64)
	max, _ = strconv.ParseFloat(a[0], 64)

	for _, ops := range a {
		value, _ := strconv.ParseFloat(ops, 64)

		if value < min {
			min = value
		}
		if value > max {
			max = value
		}
	}

	return min, max
}

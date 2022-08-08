/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import "strconv"

/**
 * Identify the winner of the scavenger game.
 */
func winnerOfScavengerGame(ops [][]string) string {
	var lista = []*Student{}

	//passa o array de dados para a lista de estudantes
	for i := 0; i < len(ops); i++ {
		std := new(Student)
		std.Name = ops[i][0]
		std.Card, _ = strconv.ParseInt(ops[i][1], 10, 64)

		lista = append(lista, std)
	}

	position := 0
	card := lista[position].Card

	for len(lista) > 1 {
		if card%2 != 0 {
			position = (position + int(card)) % len(lista)
		} else {
			position = (position - (int(card) % len(lista))) % len(lista)

			// if the position becomes negative, we must make it positive. So, we subtract from the list size.
			if position < 0 {
				position = len(lista) + position
			}
		}

		card = lista[position].Card
		lista = remove(lista, position)

		// if odd, move back one position to ensure that in the next iteration the correct position is pointed out.
		if card%2 != 0 {
			position--
		}
	}

	return lista[0].Name
}

func remove(slice []*Student, s int) []*Student {
	return append(slice[:s], slice[s+1:]...)
}

type Student struct {
	Name string
	Card int64
}

/**
 * @version GO
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
package GO

import (
	"fmt"
	"math"
)

const DIA = "Bom Dia!!"
const TARDE = "Boa Tarde!!"
const NOITE = "Boa Noite!!"
const MADRU = "De Madrugada!!"

/**
 * Return the best salutation and timezone based on sun time.
 */
func salutationTime(graus float64) []string {
	var salut string = MADRU
	var hour, min, sec float64

	if graus == 360 || graus >= 0 && graus < 90 {
		salut = DIA
	} else if graus >= 90 && graus < 180 {
		salut = TARDE
	} else if graus >= 180 && graus < 270 {
		salut = NOITE
	}

	hour = ((graus * 4.0) / 60.0) + 6.0
	if graus >= 270 {
		hour = ((graus - 270.0) * 4.0) / 60.0
	}

	min = math.Mod(hour*60.0, 60.0)
	sec = math.Mod(min*60.0, 60.0)

	if sec > 59 {
		sec = 0.0
		min += 1.0
	}

	return []string{salut, fmt.Sprintf("%02.0f", math.Floor(hour)), fmt.Sprintf("%02.0f", min), fmt.Sprintf("%02.0f", sec)}
}

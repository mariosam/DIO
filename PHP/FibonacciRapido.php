<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

//echo "The result is "+binetFormule(19);

class FibonacciRapido {

    /**
     * Fibonacci value using Binet formule.
     */
    public function binetFormule($N) {
        return (pow((1 + sqrt(5)) / 2, $N) - pow((1 - sqrt(5)) / 2, $N)) / sqrt(5);
    }

}

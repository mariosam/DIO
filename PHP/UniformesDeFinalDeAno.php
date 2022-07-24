<?php
/**
 * @version PHP
 * @author MARIO SAM <eu@mariosam.com.br>
 * @see I would love to work with you instead solving web code tests: hire me!
 */
namespace PHP;

class UniformesDeFinalDeAno {

    /**
     * Return the result of sum of all numbers in the array
     */
    public function uniformsInOrder($inputs = array()) {
        $output = array();

        //guarda os valores em um objeto
        for ($i = 0; $i < count($inputs); $i++) {
            $list = new ListUniform();
            $list->names = $inputs[$i];
            $i++;
            $temp = explode(" ", $inputs[$i]);
            $list->color = $temp[0];
            $list->size = $temp[1];

            $output[] = $list;
        }

        //criar uma ordem no objeto
        usort($output, function($a, $b) {
            if ($a->color == $b->color) {
                if ($a->size == $b->size) {
                    return $a->names < $b->names ? -1 : 1;
                }
                return $a->size < $b->size;
            }
            return $a->color > $b->color;
        });

        //converte de objeto para array
        $result = array();
        foreach ($output as $value) {
            $result[] = $value->color . " " . $value->size . " " . $value->names;
        }
        return $result;
    }


}

//objeto que representa um pedido de uniforme
class ListUniform {
 
    public $color;
    public $size;
    public $names;

    public function __construct($color = "", $size = "", $names = "") {
        $this->color = $color;
        $this->size = $size;
        $this->names = $names;
    }
}

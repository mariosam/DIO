Desafio

Encontre a maior substring comum entre as duas strings informadas. A substring pode ser qualquer parte da string, inclusive ela toda. Se não houver subseqüência comum, a saída deve ser “0”. A comparação é case sensitive ('x' != 'X').

Entrada

A entrada contém vários casos de teste. Cada caso de teste é composto por duas linhas, cada uma contendo uma string. Ambas strings de entrada contém entre 1 e 50 caracteres ('A'-'Z','a'-'z' ou espaço ' '), inclusive, ou no mínimo uma letra ('A'-'Z','a'-'z').

Saída

O tamanho da maior subsequência comum entre as duas Strings.
 
Exemplo de Entrada 	    Exemplo de Saída

abcdef                  
cdofhij                 2               [cd]
TWO                     
FOUR                    1               [O]
abracadabra
open                    0               []
Hey This java is hot
Java is a new paradigm  7               [ava is ]

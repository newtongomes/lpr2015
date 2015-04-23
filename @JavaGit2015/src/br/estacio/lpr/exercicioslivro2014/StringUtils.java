package br.estacio.lpr.exercicioslivro2014;

/*
Exercício 12.8: ??
Crie, na classe StringUtils (figura 12.8), um método estático desacentua que recebe como argumento uma string e
que substitua todos os caracteres acentuados desta string por caracteres não-acentuados correspondentes. Por exemplo,
se a string “Nação” for passada como argumento, esse método deverá retornar “Nacao”. O método deve considerar
maiúsculas e minúsculas como sendo diferentes. Dica: Várias chamadas ao método replace, em cascata, poderão
resolver o problema.
Exercício 12.9: ??
Crie, na classe StringUtils, o método alinhaÀDireita, que recebe como argumentos uma string e um valor numé-rico, e completa a string com espaços à esquerda até que o comprimento da string fique igual ao valor numérico passado,
retornando a string modificada. Escreva também o método alinhaÀEsquerda, que faz o mesmo mas adicionando es-paços à direita. Se o comprimento da string passada já for maior que o valor passado como argumento, o método deve
retornar a string inalterada.
Exercício 12.10: ??
Crie, na classe StringUtils, o método replica, que recebe como argumentos uma string e um valor inteiro, e retorna
uma string composta de várias repetições da string passada como argumento, onde o número de repetições deve ser o
número passado como argumento. Por exemplo, se os argumentos para esse método forem a string “Ha!” e o valor 3, o
método deverá retornar “Ha!Ha!Ha!”.
Exercício 12.11: ??
Escreva na classe StringUtils (figura 12.8) um método estático conta que receba como argumentos uma string e um
caracter, e retorne um inteiro correspondente ao número de ocorrências do caracter na string passados como argumentos.
Exercício 12.13: ??
Escreva uma classe em Java que represente o nome completo de uma pessoa, composto de três strings (nome próprio,
nome do meio e nome da família). Escreva nessa classe o método rubrica que retorna somente as iniciais do nome
completo em caracteres minúsculos, e o método assinatura que retorna as iniciais dos nomes próprio e do meio (com
pontos) e o nome de família completo. Por exemplo, se o nome da pessoa representado por essa classe for “Richard
Langton Gregory”, o método rubrica deve retornar ”rlg” e o método assinatura deve retornar ”R.L.Gregory”.
Para facilitar, considere armazenar os três nomes em strings separadas.
Exercício 12.14: ??
Escreva na classe StringUtils vários métodos sobrecarregados (veja seção 4.3) para comparação entre strings, base-ados nos métodos equals e equalsIgnoreCase, que recebam duas ou mais strings e retornem true se todas forem
iguais e false se qualquer uma for diferente das outras. Dica: Estes métodos podem ser chamados em cascata, de
forma que o método que compara três strings pode chamar o método que compara duas, e assim em diante.
Exercício 12.15: ??
Escreva na classe StringUtils (veja exercício 12.8) um método reverte que reverta a ordem dos caracteres de uma
string passada como argumento e retorne a string revertida. Um exemplo: se a string ”Java” for passada para esse
método, ele deve retornar a string ”avaJ”. Dica: Use um laço for ou while e o método charAt, e crie uma nova string
que receberá os caracteres na ordem invertida. Não use mecanismos da classe StringBuffer.
Exercício 12.20: ??
Escreva um método retiraVogais na classe StringUtils que receba uma string como argumento e remova todas as
vogais (maiúsculas e minúsculas) dessa string, retornando a string modificada como resultado.
Exercício 12.21: ??
Os métodos startsWith e endsWith da classe String consideram caracteres maiúsculos e minúsculos como sendo
diferentes: se a string cidade valer “Rio de Janeiro” o resultado de cidade.startsWith(“rio”) será false. Es-creva dois métodos estáticos (startsWithIgnoreCase e endsWithIgnoreCase) na classe StringUtils que recebam
duas strings como argumentos e que retornem true se a primeira string respectivamente começar ou terminar com a
segunda, independentemente de estarem em maiúsculas ou minúsculas.
Exercício 12.35: ???
Escreva, para a classe StringUtils (figura 12.8) o método éSubSeqüênciaDe que recebe duas strings como argumen-tos e retorna true se a primeira string for subseqüência da segunda, e false se não for. Uma string é considerada
uma subseqüência de outra se todos os caracteres da primeira string aparecerem em ordem na segunda. Por exemplo,
considerando a string palavra valendo “consciensiosamente”, a string “ciente” seria subseqüência de palavra
enquando “cimento” não seria. Podemos também definir que uma string a é uma subseqüência de outra string b se
pudermos formar a retirando caracteres de b mas mantendo a ordem.
Exercício 12.42: ???
Escreva, para a classe StringUtils (figura 12.8), o método alfabetoCompleto que recebe uma string como argu-mento e retorna outra string contendo o alfabeto completo da string passada como argumento. O alfabeto completo
de uma string é o grupo de caracteres que aparece na string, sem repetições (podendo ser mostrado ordenado ou não).
Por exemplo, o alfabeto completo de “desencontradamente” poderia ser “desncotram”, e o alfabeto completo de
“colina” poderia ser a própria string “colina”.
Exercício 12.44: ????
Escreva, para a classe StringUtils (figura 12.8), um método quasePalíndroma, que retorne true se uma string
passada para ele for quase-palíndroma, isto é, tiver somente um par de caracteres que descaracterize a string como
palíndroma. Por exemplo, “acamada” e “mamaram” são quase-palíndromas. Veja também o exercício 12.23
Exercício 12.67: ???
Escreva o método reverte da classe StringUtils (pedido no exercício 12.15) de forma recursiva. Um método recur-sivo que reverta uma string pode ser escrito com os seguintes passos:
• Se a string a ser revertida for vazia, retorne uma string vazia;
• Senão, retorne o último caracter da string concatenado com o resultado da chamada do método, passando como
argumento a string sem o último caracter.
Existe uma maneira simples de otimizar esse algoritmo, tente achá-la.
Exercício 12.68: ???
Escreva uma versão recursiva do método quantasVezes (exercício 12.19).
Exercício 12.69: ???
Escreva uma versão recursiva do método estrito (que considera espaços) que verifica se uma string é palíndroma (exer-cício 12.23). Esse método pode ter os seguintes passos:
• Se a string a ser revertida for vazia ou tiver somente um único caracter, retorna true.
• Senão, verifica o primeiro e último caracteres da string. Se forem iguais, retorna o valor do método, passando
como argumento para este a string sem o primeiro e últimos caracteres. Se o primeiro e último caracteres forem
diferentes, retorna false.
*/
public class StringUtils 
{

}

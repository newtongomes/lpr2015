package br.estacio.lpr.exercicioslivro2014;

/*
Exercício 12.33: ???
O algoritmo de César de criptografia de strings é uma versão melhorada do algoritmo rot13 (veja exercício 12.32): o seu
funcionamento é o mesmo, só que, em vez de substituir cada caracter por um caracter treze posições depois, o algoritmo
de César recebe um valor chamado chave, e usa esse valor como o número de posições que devem ser puladas para
a criptografia. Por exemplo, se a chave for 1, o algoritmo pulará uma posição ao codificar as letras, então se a string
passada for “Java�?, o resultado será “Kbwb�?. O algoritmo de decodificação deve receber a mesma chave, só que deve
substituir os caracteres da string por valores em posições anteriores.
Escreva um método estático codificaCésar na classe Criptografia que implemente o algoritmo de César, recebendo
como argumentos uma string e uma chave (valor numérico) e retornando a string criptografada. Esse método deve
considerar que somente as letras não-acentuadas devem ser criptografadas, as letras acentuadas, números, espaços e
outros símbolos devem continuar como estão. Escreva também o método decodificaCésar.
Dica: Para simplificar o algoritmo, considere que o valor da chave só pode estar entre 1 e 25. Existem ao menos duas
maneiras de implementar esse algoritmo.
Exercício 12.34: ???
O mecanismo de casamento de padrões mostrado na classe CasamentoDePadroes (figura 12.10) considera caracteres
maiúsculos e minúsculos como sendo diferentes. Modifique a classe CasamentoDePadroes de forma que esta encapsule
também um valor booleano ignoreCase, que deve ser inicializado pelo construtor, usando um argumento. Se esse valor
booleano for igual a true, o método casa deverá considerar caracteres maiúsculos iguais a minúsculos. Dica: A
resposta do exercício 12.21 poderá ser de ajuda.
Exercício 12.36: ???
Escreva uma classe CodigoMorse com métodos estáticos que convertam strings de caracteres para strings em código
morse e vice-versa. No código morse, caracteres são representados por pontos (correspondentes a um impulso elétrico
curto) e traços (correspondentes a um impulso elétrico longo). Os caracteres básicos e seus correspondentes em código
morse são mostrados abaixo:
a .− b −... c −.−. d −.. e . f ..−.
g −−. h .... i .. j .−−− k −.− l .−..
m −− n −. o −−− p .−−. q −−.− r .−.
s ... t − u ..− v ...− w .−− x −..−
y −.−− z −−.. ponto
.−.−.−
vírgula
−−..−−
A cada caracter que for codificado, um espaço deve ser adicionado à string de saída. O método para codificação deve
considerar caracteres maiúsculos e minúsculos como sendo equivalentes, e ignorar outros símbolos. Exemplo: se a
string �?Farfalhar�? for passada para o método de codificação, este deve retornar “..−. .− .−. ..−. .− .−..
.... .− .−.�?.
Dica: Para a decodificação de código morse para caracteres, use os espaços que devem existir na string codificada como
delimitadores dos caracteres do código morse. Se algum código morse não tiver caracter correspondente (por exemplo,
“−−−−−�?), use o caracter ? para saída.
Exercício 12.41: ???
O algoritmo das fatias de criptografia usa como entrada uma string e um valor numérico, sendo que esse valor numérico
(o número de fatias) deve ser bem menor que o tamanho da string. O algoritmo de codificação fatia a string de entrada,
tomando caracteres de N em N posições, onde N é o número de fatias, formando N novas strings cada uma com o
comprimento M onde M é o comprimento da string original dividido por N. As strings criadas assim são concatenadas,
sendo o resultado da codificação da string original. Para decodificar uma string criptografada com esse algoritmo, é
necessário ter o valor numérico.
Por exemplo, para criptografar a string “Programação em Java�? (19 caracteres) usando 4 como número de fatias, o
primeiro passo seria completar a string de forma que tenha um número de caracteres múltiplo de 4, para “Programação
em Java �? (20 caracteres), para simplificar o algoritmo. Fatiando essa string, pegando de quatro em quatro caracteres,
obtemos quatro novas strings:
‘‘Prçea’’
‘‘raãmv’’
‘‘omo a’’
‘‘ga J ’’
A string criptografada seria o resultado da concatenação dessas strings ou “Prçearaãmvomo aga J �?. Para decodificar
essa string, basta repetir o processo de codificação mas usando M como o númeo de fatias, obtendo as strings
‘‘Prog’’
‘‘rama’’
‘‘ção ’’
‘‘em J’’
‘‘ava ’’
cuja concatenação resulta em “Programação em Java �?.
Escreva, na classe Criptografia, o método codificaFatias que recebe uma string e um valor numérico, codificando
a string usando o valor e retornando a string criptografada. Escreva também o método decodificaFatias que deve
fazer o processo reverso. Dica: O método decodificaFatias pode ser uma chamada para o método codificaFatias
com o valor numérico adequado.
Exercício 12.43: ???
O algoritmo das pontas de criptografia recebe uma string como argumento e produz uma outra string como resultado,
e pode ser descrito da seguinte forma: enquanto a string de entrada contiver caracteres, remova o primeiro e o último
caracteres da string de entrada e os coloque na string de saída. Dessa forma, se a string “Programação em Java�? for
entrada no algoritmo, este mostrará como saída a string “ParvoagJr ammea çoã�?. A decodificação de uma string pode
ser feita da seguinte forma: crie duas strings temporárias, e para cada par de caracteres extraídos da string codificada de
entrada adicione o primeiro no fim da primeira string e o segundo no início da segunda string. A concatenação das duas
strings é o resultado da decodificação.
Escreva, na classe Criptografia, os métodos estáticos codificaPontas e decodificaPontas para codificar e deco-dificar uma string usando esse algoritmo.
Exercício 12.45: ????
Escreva a classe CasamentoDePadroesComCoringa que execute o algoritmo de casamento de padrões mostrado na
seção 12.4 mas considerando que o caracter ’?’ também possa ser usado, e que o algoritmo de casamento considere
que esse caracter é igual a qualquer outro caracter que apareça na string sendo analisada. Dessa forma, se o padrão
encapsulado for “{re,di}??de�? as strings “reside�?, “divide�? e “revide�? casarão com o padrão, enquanto as strings
“rebelde�? e “relate�? não casarão. Dicas: Considere as diferenças do algoritmo no tratamento de caracteres ’?’ como
sendo um singleton e como sendo parte da lista de alternativas. Vale a pena escrever essa classe como sendo herdeira da
classe CasamentoDePadroes? Quais as vantagens e dificuldades esperadas
Exercício 12.50: ????
O algoritmo de César (veja o exercício 12.33) pode ser implementado de maneira mais complexa (e difícil de ser que-brada) se, em vez de uma única chave, várias forem usadas. O primeiro caracter da string será codificado com a primeira
chave, o segundo caracter com a segunda chave etc. Quando as chaves acabarem, a primeira será reutilizada, até o final
da string a ser codificada. A chave pode ser especificada por outra string, onde cada caracter tem um valor numérico
correspondente, de forma que a string �?AEIY�? corresponde a quatro chaves (1, 5, 9, 25). Dessa forma, se a string
�?Programa�? fosse codificada com a chave �?aeb�? (correspondente aos valores 1, 5 e 2) o resultado seria �?Qwqhwcnf�?
(’P’ foi adicionada a 1 e o resultado é ’Q’, ’r’ foi adicionada a 5 e o resultado é ’w’, ’o’ foi adicionada a 2 e o
resultado é ’q’, ’g’ foi adicionada a 1 e o resultado é ’h’, ’r’ foi adicionada a 5 e o resultado é ’w’ etc.) – note o uso
cíclico dos valores da chave.
Escreva um método estático codificaCésar na classe Criptografia (veja exercício 12.32) que implemente o algo-ritmo de César modificado, recebendo duas strings como argumento: a primeira será a string a ser criptografada e a
segunda será a chave. Esse método deverá retornar outra instância da classe String correspondendo ao primeiro ar-gumento, criptografado. Esse método deve considerar que somente as letras não-acentuadas devem ser criptografadas;
as letras acentuadas, números, espaços e outros símbolos devem continuar como estão. Escreva também o método
decodificaCésar, que também recebe duas strings como argumentos e retorna a string decodificada.
Dica: Para simplificar o algoritmo, considere que o valor da chave só pode estar entre 1 e 26, ou seja, as letras ’A’ a
’Z’. O algoritmo de codificação deve verificar se a string passada como chave é válida, ou seja, se ela contém somente
caracteres maiúsculos na faixa prevista.
Exercício 12.55: ????
Uma palavra ou frase é dita anagrama de outra se ela pode ser formada com os caracteres de outra, sem repetições,
modificando as posições e inserindo espaços e pontuação à vontade, valendo também transformar maiúsculas em mi-núsculas e vice-versa. Dessa forma, “manda jogar em vapor�? é anagrama de “programando em java�?. Anagramas
são curiosidades lingüísticas, geralmente feitos para satirizar nomes de pessoas ou locais. Para que um anagrama seja
considerado interessante, as palavras formadas devem ter algum significado. Escreva, para a classe StringUtils (fi-gura 12.8), um método éAnagrama que receba duas strings como argumentos e retorne true se uma é anagrama de
outra
*/
public class Criptografia 
{

}

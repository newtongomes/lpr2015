package br.estacio.lpr.exercicioslivro2014;

/*
Exerc�cio 12.8: ??
Crie, na classe StringUtils (figura 12.8), um m�todo est�tico desacentua que recebe como argumento uma string e
que substitua todos os caracteres acentuados desta string por caracteres n�o-acentuados correspondentes. Por exemplo,
se a string �Na��o� for passada como argumento, esse m�todo dever� retornar �Nacao�. O m�todo deve considerar
mai�sculas e min�sculas como sendo diferentes. Dica: V�rias chamadas ao m�todo replace, em cascata, poder�o
resolver o problema.
Exerc�cio 12.9: ??
Crie, na classe StringUtils, o m�todo alinha�Direita, que recebe como argumentos uma string e um valor num�-rico, e completa a string com espa�os � esquerda at� que o comprimento da string fique igual ao valor num�rico passado,
retornando a string modificada. Escreva tamb�m o m�todo alinha�Esquerda, que faz o mesmo mas adicionando es-pa�os � direita. Se o comprimento da string passada j� for maior que o valor passado como argumento, o m�todo deve
retornar a string inalterada.
Exerc�cio 12.10: ??
Crie, na classe StringUtils, o m�todo replica, que recebe como argumentos uma string e um valor inteiro, e retorna
uma string composta de v�rias repeti��es da string passada como argumento, onde o n�mero de repeti��es deve ser o
n�mero passado como argumento. Por exemplo, se os argumentos para esse m�todo forem a string �Ha!� e o valor 3, o
m�todo dever� retornar �Ha!Ha!Ha!�.
Exerc�cio 12.11: ??
Escreva na classe StringUtils (figura 12.8) um m�todo est�tico conta que receba como argumentos uma string e um
caracter, e retorne um inteiro correspondente ao n�mero de ocorr�ncias do caracter na string passados como argumentos.
Exerc�cio 12.13: ??
Escreva uma classe em Java que represente o nome completo de uma pessoa, composto de tr�s strings (nome pr�prio,
nome do meio e nome da fam�lia). Escreva nessa classe o m�todo rubrica que retorna somente as iniciais do nome
completo em caracteres min�sculos, e o m�todo assinatura que retorna as iniciais dos nomes pr�prio e do meio (com
pontos) e o nome de fam�lia completo. Por exemplo, se o nome da pessoa representado por essa classe for �Richard
Langton Gregory�, o m�todo rubrica deve retornar �rlg� e o m�todo assinatura deve retornar �R.L.Gregory�.
Para facilitar, considere armazenar os tr�s nomes em strings separadas.
Exerc�cio 12.14: ??
Escreva na classe StringUtils v�rios m�todos sobrecarregados (veja se��o 4.3) para compara��o entre strings, base-ados nos m�todos equals e equalsIgnoreCase, que recebam duas ou mais strings e retornem true se todas forem
iguais e false se qualquer uma for diferente das outras. Dica: Estes m�todos podem ser chamados em cascata, de
forma que o m�todo que compara tr�s strings pode chamar o m�todo que compara duas, e assim em diante.
Exerc�cio 12.15: ??
Escreva na classe StringUtils (veja exerc�cio 12.8) um m�todo reverte que reverta a ordem dos caracteres de uma
string passada como argumento e retorne a string revertida. Um exemplo: se a string �Java� for passada para esse
m�todo, ele deve retornar a string �avaJ�. Dica: Use um la�o for ou while e o m�todo charAt, e crie uma nova string
que receber� os caracteres na ordem invertida. N�o use mecanismos da classe StringBuffer.
Exerc�cio 12.20: ??
Escreva um m�todo retiraVogais na classe StringUtils que receba uma string como argumento e remova todas as
vogais (mai�sculas e min�sculas) dessa string, retornando a string modificada como resultado.
Exerc�cio 12.21: ??
Os m�todos startsWith e endsWith da classe String consideram caracteres mai�sculos e min�sculos como sendo
diferentes: se a string cidade valer �Rio de Janeiro� o resultado de cidade.startsWith(�rio�) ser� false. Es-creva dois m�todos est�ticos (startsWithIgnoreCase e endsWithIgnoreCase) na classe StringUtils que recebam
duas strings como argumentos e que retornem true se a primeira string respectivamente come�ar ou terminar com a
segunda, independentemente de estarem em mai�sculas ou min�sculas.
Exerc�cio 12.35: ???
Escreva, para a classe StringUtils (figura 12.8) o m�todo �SubSeq��nciaDe que recebe duas strings como argumen-tos e retorna true se a primeira string for subseq��ncia da segunda, e false se n�o for. Uma string � considerada
uma subseq��ncia de outra se todos os caracteres da primeira string aparecerem em ordem na segunda. Por exemplo,
considerando a string palavra valendo �consciensiosamente�, a string �ciente� seria subseq��ncia de palavra
enquando �cimento� n�o seria. Podemos tamb�m definir que uma string a � uma subseq��ncia de outra string b se
pudermos formar a retirando caracteres de b mas mantendo a ordem.
Exerc�cio 12.42: ???
Escreva, para a classe StringUtils (figura 12.8), o m�todo alfabetoCompleto que recebe uma string como argu-mento e retorna outra string contendo o alfabeto completo da string passada como argumento. O alfabeto completo
de uma string � o grupo de caracteres que aparece na string, sem repeti��es (podendo ser mostrado ordenado ou n�o).
Por exemplo, o alfabeto completo de �desencontradamente� poderia ser �desncotram�, e o alfabeto completo de
�colina� poderia ser a pr�pria string �colina�.
Exerc�cio 12.44: ????
Escreva, para a classe StringUtils (figura 12.8), um m�todo quasePal�ndroma, que retorne true se uma string
passada para ele for quase-pal�ndroma, isto �, tiver somente um par de caracteres que descaracterize a string como
pal�ndroma. Por exemplo, �acamada� e �mamaram� s�o quase-pal�ndromas. Veja tamb�m o exerc�cio 12.23
Exerc�cio 12.67: ???
Escreva o m�todo reverte da classe StringUtils (pedido no exerc�cio 12.15) de forma recursiva. Um m�todo recur-sivo que reverta uma string pode ser escrito com os seguintes passos:
� Se a string a ser revertida for vazia, retorne uma string vazia;
� Sen�o, retorne o �ltimo caracter da string concatenado com o resultado da chamada do m�todo, passando como
argumento a string sem o �ltimo caracter.
Existe uma maneira simples de otimizar esse algoritmo, tente ach�-la.
Exerc�cio 12.68: ???
Escreva uma vers�o recursiva do m�todo quantasVezes (exerc�cio 12.19).
Exerc�cio 12.69: ???
Escreva uma vers�o recursiva do m�todo estrito (que considera espa�os) que verifica se uma string � pal�ndroma (exer-c�cio 12.23). Esse m�todo pode ter os seguintes passos:
� Se a string a ser revertida for vazia ou tiver somente um �nico caracter, retorna true.
� Sen�o, verifica o primeiro e �ltimo caracteres da string. Se forem iguais, retorna o valor do m�todo, passando
como argumento para este a string sem o primeiro e �ltimos caracteres. Se o primeiro e �ltimo caracteres forem
diferentes, retorna false.
*/
public class StringUtils 
{

}

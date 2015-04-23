package br.estacio.lpr.exercicioslivro2014;

/*
Exerc�cio 1.42: ????
A opera��o inicializaData do modelo Data (figura 1.7) tem uma abordagem simplista demais para verificar se o dia
sendo usado � v�lido ou n�o: nessa opera��o ainda seria poss�vel passar a data 31/02/2000 e a opera��o iria considerar
os valores passados como sendo v�lidos. Modifique a opera��o data�V�lida para que esta considere o valor m�ximo
que pode ser aceito como v�lido, dependendo do m�s, de forma que, para meses com 30 dias, o valor 31 para o dia seja
considerado incorreto, e que para fevereiro o valor m�ximo seja calculado em fun��o de o ano ser bissexto ou n�o. Dica:
Anos bissextos (tendo 29 dias em fevereiro) s�o divis�veis por quatro, a n�o ser que sejam divis�veis por 100. Anos que
podem ser divididos por 400 tamb�m s�o bissextos. Dessa forma, 1964 e 2000 s�o bissextos, mas 1900 n�o � bissexto.
A opera��o de divisibilidade pode ser implementada pela fun��o m�dulo, representada pelo sinal %, e comparada com
zero: a express�o (1966 % 4) == 0 � verdadeira, enquanto a express�o (1967 % 4) == 0 � falsa.
Exerc�cio 2.13: ?
Modifique o m�todo mostraData da classe Data (figura 2.7) para que o m�s seja mostrado por extenso em vez de
numeral (isto �, quando o m�s for 3, que o m�todo imprima mar�o, etc.)
Exerc�cio 1.10: ?
Baseado no modelo Data (figura 1.7) crie o modelo HoraAproximada, que represente uma hora qualquer (usando
valores para representar horas e minutos). Que dados e opera��es este modelo deve ter?
Exerc�cio 1.28: ??
Modifique a opera��o mostraData no modelo Data (figura 1.7) para que o m�s seja mostrado por extenso. Dica: Veja
o exerc�cio 1.13.
Exerc�cio 2.17: ?
A classe Data (figura 2.7) pode representar datas n�o-v�lidas, com os valores de dia, m�s e ano iguais a zero. Modifique
o m�todo mostraData para que, se a data encapsulada n�o for v�lida, uma mensagem �Data Inv�lida� seja impressa,
em vez dos valores de dia, m�s e ano (veja o exerc�cio 1.13).
Exerc�cio 2.25: ?
Modifique o m�todo �Igual da classe Data (figura 2.7) para que uma data inv�lida seja considerada sempre diferente
de qualquer outra
Exerc�cio 2.38: ??
Escreva, na classe Data, um m�todo duplicaData que receba como argumento uma outra inst�ncia da classe Data, e
duplique os valores dos campos da inst�ncia passada como argumento para os campos encapsulados
Exerc�cio 2.42: ???
Implemente a l�gica correta de c�lculo de anos bissextos e dias nos meses mostrada no exerc�cio 1.42 na classe Data.
Exerc�cio 2.48: ???
Uma das opera��es que podemos efetuar com datas � a compara��o para ver se uma data ocorre antes de outra. O
algoritmo para compara��o � muito simples, e seus passos est�o abaixo. Nesse algoritmo, consideramos que dia1, m�s1
e ano1 s�o os dados da primeira data, e que dia2, m�s2 e ano2 s�o os dados da segunda data.
1. Se ano1 < ano2 a primeira data vem antes da segunda.
2. Se ano1 > ano2 a primeira data vem depois da segunda.
3. Se ano1 == ano2 e m�s1 < m�s2 a primeira data vem antes da segunda.
4. Se ano1 == ano2 e m�s1 > m�s2 a primeira data vem depois da segunda.
5. Se ano1 == ano2 e m�s1 == m�s2 e dia1 < dia2 a primeira data vem antes da segunda.
6. Se ano1 == ano2 e m�s1 == m�s2 e dia1 > dia2 a primeira data vem depois da segunda.
7. Se nenhum desses casos ocorrer, as datas s�o exatamente iguais.
Escreva um m�todo vemAntes na classe Data (figura 2.7) que receba como argumento outra inst�ncia da classe Data e
implemente o algoritmo acima, retornando true se a data encapsulada vier antes da passada como argumento e false
caso contr�rio. Se as datas forem exatamente iguais, o m�todo deve retornar true.
Exerc�cio 4.24: ?
Se a classe Data tivesse um m�todo toString (pedido no exerc�cio 3.20), o m�todo toString da classe
EventoAcademico (figura 4.3) poderia ser escrito de maneira muito mais simples. Reescreva o m�todo toString
da classe EventoAcademico usando uma chamada ao m�todo toString da classe Data.
Exerc�cio 4.25: ?
Quando chamamos o m�todo inicializaData para inicializar campos de uma inst�ncia da classe Data, somos obri-gados a fazer o cast para que os argumentos para o m�todo sejam reconhecidos como sendo dos tipos apropriados (ver
linhas 35 e 42 da figura 3.1). Usando sobrecarga, seria poss�vel escrever um outro m�todo inicializaData que recebe
tr�s argumentos do tipo int, que ser�o convertidos dentro do corpo do m�todo, fazendo com que o programador usu�rio
da classe n�o precise se preocupar com o cast em seus programas. Embora a solu��o possa ser compilada e executada,
existe um pequeno problema de design ou de organiza��o de classes com essa solu��o. Qual �?
*/
public class Data 
{

}

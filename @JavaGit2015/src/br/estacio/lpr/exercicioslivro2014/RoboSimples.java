package br.estacio.lpr.exercicioslivro2014;

/*
Exerc�cio 4.9: ?
Liste as assinaturas dos construtores e m�todos na classe RoboSimples (figura 4.7).
Exerc�cio 4.11: ?
Considerando a classe RoboSimples (figura 4.7), quais das chamadas ao m�todo move abaixo podem ser usadas? Ex-plique.
� move();
� move(1);
� move(�A�);
� move("A");
� move(1/3);
� move(2,3,5);
� move(9,false);
� move("17");
� move((long)3);
� move((char)65);
Exerc�cio 4.13: ??
O que aconteceria com a inst�ncia clonado da classe RoboSimples (declarada na linha 29 da figura 4.8) se a declara��o
fosse RoboSimples clonado = new RoboSimples(��+n�mero5);?
Exerc�cio 4.17: ??
Suponha que os rob�s modelados pela classe RoboSimples possam se movimentar para a frente e para tr�s. Escreva na
classe dois m�todos moveParaTr�s, um que mova os rob�s uma unidade e outro que aceite um valor como argumento
(n�mero de unidades a mover). Dica: Mover um rob� n unidades para tr�s � a mesma coisa que mov�-lo n unidades
para a frente, ent�o podemos chamar o m�todo move de dentro do m�todo moveParaTr�s, trocando o sinal do valor do
movimento.
Exerc�cio 6.4: ?
O m�todo mudaDire��o da classe RoboSimples (figura 4.7) n�o verifica se a dire��o passada como argumento � uma
das dire��es v�lidas (�N�, �S�, �E� ou �O�). Modifique o m�todo de forma que, se um caracter diferente dos aceitos
como dire��es v�lidas for passado, o m�todo considere a dire��o como sendo �N�.
Exerc�cio 9.11: ??
A classe RoboSimples (figura 9.2) representa um rob� que pode se movimentar apenas nas quatro dire��es cardeais,
mas n�o imp�e restri��es no valor do �ngulo que pode ser passado para o m�todo mudaDire��o (herdado da classe
RoboAbstrato). Escreva, para a classe RoboSimples, o m�todo mudaDire��o, sobreponto o m�todo herdado, de
forma que a dire��o atual seja calculada como:
� Se valores abaixo de 45 graus ou acima de 315 graus forem passados como argumento para o m�todo, a dire��o
do rob� ser� 0 (zero) grau;
� Se valores entre 45 e 135 graus forem passados como argumento para o m�todo, a dire��o do rob� ser� 90 graus;
� Se valores entre 135 e 225 graus forem passados como argumento para o m�todo, a dire��o do rob� ser� 180
graus;
� Se valores entre 225 e 315 graus forem passados como argumento para o m�todo, a dire��o do rob� ser� 270
graus.
Exerc�cio 9.12: ??
Modifique o m�todo move da classe RoboABateria (figura 9.3) para que a energia gasta para movimentos na diagonal
(45, 135, 225 e 315 graus) seja igual a 14 vezes o n�mero de passos, sendo que para os movimentos na horizontal ou
vertical deve continuar igual a 10 vezes o n�mero de passos.
Exerc�cio 9.21: ???
Escreva uma classe RoboComMemoria que herde da classe RoboAbstrato e que seja capaz de armazenar o n�mero de
passos dados em cada dire��o cardeal. Escreva, para esse rob�, um m�todo retorna�Origem que, usando os passos
dados em cada dire��o e a posi��o atual, calcule a sua origem. Dica: Se o rob� somente se move nas dire��es carde-ais, n�o � necess�rio armazenar quatro valores para a mem�ria do movimento, pois cada passo dado em uma dire��o
corresponde ao valor negativo desses passos dados na dire��o oposta.
Exerc�cio 9.22: ???
Escreva uma classe RoboPesadoABateria que herde da classe RoboABateria e que represente tamb�m o peso do rob�
em quilos. Esse peso determinar� a constante a ser usada para o gasto de energia com o movimento do rob�: para que o
rob� se movimente na dire��o horizontal ou vertical, o gasto de energia ser� o peso do rob� vezes o n�mero de passos a
ser percorrido, e para que o rob� se movimente na diagonal, o gasto de energia ser� 1.4 multiplicado pelo peso do rob�
multiplicado pelo n�mero de passos a ser percorrido. Veja tamb�m o exerc�cio 9.12.
Exerc�cio 9.32: ?
Escreva um m�todo quantaEnergia para a classe RoboABateria (figura 9.3) que retorne a quantidade de energia
restante para o rob�.
Exerc�cio 9.37: ??
Escreva um m�todo podeSeMover para a classe RoboABateria (figura 9.3) que retorne true caso o rob� possa se mover
na dist�ncia passada como argumento para o m�todo, e false caso contr�rio. Escreva outro m�todo sobrecarregado que
n�o receba argumentos e considere que a dist�ncia a ser percorrida � um
Exerc�cio 9.39: ???
Modifique a classe abstrata RoboAbstrato (figura 9.1) de forma que em vez de usar dois valores separados para a posi-��o do rob�, a classe use uma inst�ncia da classe Ponto2D. Que modifica��es dever�o ser feitas nas classes herdeiras
Exerc�cio 13.45: ??
Os m�todos da classe RoboComMemoria (figura 13.6) n�o consideram a primeira posi��o do rob� � podemos ver isso no
resultado da execu��o da classe DemoRoboComMemoria (figura 13.7). Modifique os m�todos necess�rios para que, ao
executar o m�todo retorna�Base, o rob� esteja na posi��o original e na dire��o original.
*/
public class RoboSimples 
{

}

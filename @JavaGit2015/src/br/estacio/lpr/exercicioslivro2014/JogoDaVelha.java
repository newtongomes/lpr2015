package br.estacio.lpr.exercicioslivro2014;

/*
Exerc�cio 11.67: ????
Crie uma classe que represente um jogo da velha, usando uma matriz de duas dimens�es para representar as posi��es
do jogo. A matriz deve ser alocada no construtor da classe, ter o tamanho 3 � 3 e ser de um tipo que suporte tr�s
estados poss�veis: vazio, preenchido com �O� e preenchido com �X�. A classe deve poder ser usada para jogos com dois
jogadores.
Dica: A classe deve ter os seguintes m�todos:
� jogaO, que aceita dois valores que s�o as coordenadas onde um �O� ser� jogado, e marca na matriz a posi��o
somente se esta estiver livre.
� jogaX, que aceita dois valores que s�o as coordenadas onde um �X� ser� jogado, e marca na matriz a posi��o
somente se esta estiver livre.
� verifica, que verifica a matriz para ver se existe algum ganhador (esse m�todo deve verificar se existem tr�s
marcas iguais que n�o sejam vazias em uma horizontal, vertical ou diagonal da matriz).
� toString, que retornar� uma string com a representa��o gr�fica do jogo com as posi��es atuais.
Escreva tamb�m um programa que use a classe. Este programa deve executar um la�o no qual fica perguntando as
posi��es para os jogadores alternadamente, enquanto n�o houver vit�ria, desist�ncia ou acabarem as posi��es vazias da
matriz.
Exerc�cio 11.78: ?????
� poss�vel embutir um pouco de Intelig�ncia Artificial no jogo-da-velha do exerc�cio 11.67, fazendo com que um jogador
jogue contra o computador. Quando for a vez do computador jogar, as coordenadas onde este colocar� sua pe�a n�o
ser�o entradas via teclado: a pr�pria classe pode escolher a melhor posi��o vazia para jogar sua pe�a com base na
seguinte heur�stica (s�rie de passos que podem levar � solu��o de um problema): para cada posi��o desocupada no
tabuleiro, some:
� Mais dois pontos se a posi��o for a central,
� Mais um ponto se a posi��o for nos quatro cantos da matriz,
� Menos dois pontos se j� houver uma ou mais pe�as do advers�rio na linha, coluna ou diagonal onde a posi��o se
encontra,
� Mais quatro pontos se a posi��o impedir a vit�ria do advers�rio,
� Mais quatro pontos se a posi��o levar a uma vit�ria,
� Ao final do c�lculo, escolher a posi��o que teve maior n�mero de pontos.
Para exemplificar, considere a figura 11.2, que representa um jogo em andamento, onde o computador joga com as
pe�as �O�. No exemplo mostrado, a melhor posi��o para o computador jogar seria aquela cujo valor � +2. As posi��es
marcadas com n�o j� estariam ocupadas.
Usando o exerc�cio 11.67 como base, escreva um m�todo jogaComputador que calcule a melhor posi��o para jogo e
efetue a jogada. Outras partes da classe dever�o ser reescritas, por exemplo, para permitir que o usu�rio decida se vai
jogar com os �X� ou �O� e quem ser� o primeiro a jogar.
Dica: A classe pode conter outra matriz de valores inteiros, do mesmo tamanho do tabuleiro do jogo-da-velha, que ser�
reinicializada e calculada com o algoritmo acima a cada jogada do computador.
*/
public class JogoDaVelha 
{

}

package br.estacio.lpr.exercicioslivro2014;

/*
Exerc�cio 11.69: ????
O jogo japon�s Go � jogado por duas pessoas em um tabuleiro quadrado de tamanho 19 � 19. Cada pessoa recebe
um conjunto de pe�as pretas e brancas que devem ser colocadas alternadamente no tabuleiro, na posi��o que o jogador
desejar. Ganha o jogo o primeiro jogador que conseguir colocar cinco de suas pe�as em uma linha reta horizontal,
vertical ou diagonal.
Crie uma classe em Java que represente um jogo de Go, usando uma matriz de duas dimens�es para representar as
posi��es do jogo. A matriz deve ser alocada no construtor da classe, ter o tamanho 19 � 19 e ser de um tipo que suporte
tr�s estados poss�veis: vazio, preenchido com pe�a preta e preenchido com pe�a branca. A classe deve poder ser usada
para jogos com dois jogadores.
A classe deve ter os seguintes m�todos:
� jogaPreta, que aceita dois valores que s�o as coordenadas onde uma pe�a preta ser� jogada, e marca na matriz a
posi��o somente se esta estiver livre.
� jogaBranca, que aceita dois valores que s�o as coordenadas onde uma pe�a branca ser� jogada, e marca na matriz
a posi��o somente se esta estiver livre.
� verifica, que verifica a matriz para ver se existe algum ganhador (este m�todo deve verificar se existem cinco
pe�as iguais que n�o sejam vazias em uma horizontal, vertical ou diagonal da matriz, depois de cada jogada feita).
� toString, que retornar� uma string com a representa��o gr�fica do jogo com as posi��es atuais.
Escreva tamb�m um programa que use a classe. Esse programa deve executar um la�o no qual fica perguntando as
posi��es para os jogadores alternadamente, enquanto n�o houver vit�ria, desist�ncia ou acabarem as posi��es vazias da
matriz.
Dica: O algoritmo do jogo n�o � t�o diferente do jogo da velha (exerc�cio 11.67), exceto pelo m�todo verifica. Esse
m�todo pode, para cada posi��o do array bidimensional, ver se existem linhas de cinco pe�as iguais contadas a partir da
posi��o sendo procurada. O �nico cuidado adicional � garantir que o algoritmo n�o procurar� pe�as fora do tabuleiro.
Exerc�cio 11.79: ?????
Tamb�m � poss�vel adaptar o jogo de go (exerc�cio 11.69) para que o computador possa jogar com o usu�rio, usando
alguma intelig�ncia para decidir onde posicionar suas pe�as. A heur�stica para que o computador decida qual posi��o �
melhor para jogar uma pe�a pode ser:
� Menos dois pontos para cada pe�a do advers�rio que estiver na vizinhan�a direta 7 � 7 e mais dois pontos para
cada pe�a do computador que estiver nesta vizinhan�a,
� Menos quatro pontos para cada pe�a do advers�rio que estiver na vizinhan�a direta 5 � 5 e mais quatro pontos
para cada pe�a do computador que estiver nesta vizinhan�a,
� Menos oito pontos para cada pe�a do advers�rio que estiver na vizinhan�a direta 3 � 3 e mais oito pontos para
cada pe�a do computador que estiver nesta vizinhan�a,
� Menos um ponto para cada pe�a do advers�rio que estiver na vizinhan�a indireta 7 � 7 e mais um ponto para cada
pe�a do computador que estiver nesta vizinhan�a.
A figura 11.3 mostra, para uma determinada posi��o, quais s�o as posi��es que correspondem �s vizinhan�as.
Usando o exerc�cio 11.69 como base, escreva um m�todo jogaComputador que calcule a melhor posi��o para jogo e
efetue a jogada. Outras partes da classe dever�o ser reescritas, por exemplo, para permitir que o usu�rio decida se vai
jogar com as pe�as pretas ou brancas e quem ser� o primeiro a jogar.
Dica: Veja tamb�m o enunciado do exerc�cio 11.78.
*/
public class JogoGo 
{

}

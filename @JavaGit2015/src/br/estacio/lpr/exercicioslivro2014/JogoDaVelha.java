package br.estacio.lpr.exercicioslivro2014;

/*
Exercício 11.67: ????
Crie uma classe que represente um jogo da velha, usando uma matriz de duas dimensões para representar as posições
do jogo. A matriz deve ser alocada no construtor da classe, ter o tamanho 3 × 3 e ser de um tipo que suporte três
estados possíveis: vazio, preenchido com ’O’ e preenchido com ’X’. A classe deve poder ser usada para jogos com dois
jogadores.
Dica: A classe deve ter os seguintes métodos:
• jogaO, que aceita dois valores que são as coordenadas onde um ’O’ será jogado, e marca na matriz a posição
somente se esta estiver livre.
• jogaX, que aceita dois valores que são as coordenadas onde um ’X’ será jogado, e marca na matriz a posição
somente se esta estiver livre.
• verifica, que verifica a matriz para ver se existe algum ganhador (esse método deve verificar se existem três
marcas iguais que não sejam vazias em uma horizontal, vertical ou diagonal da matriz).
• toString, que retornará uma string com a representação gráfica do jogo com as posições atuais.
Escreva também um programa que use a classe. Este programa deve executar um laço no qual fica perguntando as
posições para os jogadores alternadamente, enquanto não houver vitória, desistência ou acabarem as posições vazias da
matriz.
Exercício 11.78: ?????
É possível embutir um pouco de Inteligência Artificial no jogo-da-velha do exercício 11.67, fazendo com que um jogador
jogue contra o computador. Quando for a vez do computador jogar, as coordenadas onde este colocará sua peça não
serão entradas via teclado: a própria classe pode escolher a melhor posição vazia para jogar sua peça com base na
seguinte heurística (série de passos que podem levar à solução de um problema): para cada posição desocupada no
tabuleiro, some:
• Mais dois pontos se a posição for a central,
• Mais um ponto se a posição for nos quatro cantos da matriz,
• Menos dois pontos se já houver uma ou mais peças do adversário na linha, coluna ou diagonal onde a posição se
encontra,
• Mais quatro pontos se a posição impedir a vitória do adversário,
• Mais quatro pontos se a posição levar a uma vitória,
• Ao final do cálculo, escolher a posição que teve maior número de pontos.
Para exemplificar, considere a figura 11.2, que representa um jogo em andamento, onde o computador joga com as
peças ’O’. No exemplo mostrado, a melhor posição para o computador jogar seria aquela cujo valor é +2. As posições
marcadas com não já estariam ocupadas.
Usando o exercício 11.67 como base, escreva um método jogaComputador que calcule a melhor posição para jogo e
efetue a jogada. Outras partes da classe deverão ser reescritas, por exemplo, para permitir que o usuário decida se vai
jogar com os ’X’ ou ’O’ e quem será o primeiro a jogar.
Dica: A classe pode conter outra matriz de valores inteiros, do mesmo tamanho do tabuleiro do jogo-da-velha, que será
reinicializada e calculada com o algoritmo acima a cada jogada do computador.
*/
public class JogoDaVelha 
{

}

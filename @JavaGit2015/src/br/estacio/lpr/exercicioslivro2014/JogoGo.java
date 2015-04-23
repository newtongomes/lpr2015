package br.estacio.lpr.exercicioslivro2014;

/*
Exercício 11.69: ????
O jogo japonês Go é jogado por duas pessoas em um tabuleiro quadrado de tamanho 19 × 19. Cada pessoa recebe
um conjunto de peças pretas e brancas que devem ser colocadas alternadamente no tabuleiro, na posição que o jogador
desejar. Ganha o jogo o primeiro jogador que conseguir colocar cinco de suas peças em uma linha reta horizontal,
vertical ou diagonal.
Crie uma classe em Java que represente um jogo de Go, usando uma matriz de duas dimensões para representar as
posições do jogo. A matriz deve ser alocada no construtor da classe, ter o tamanho 19 × 19 e ser de um tipo que suporte
três estados possíveis: vazio, preenchido com peça preta e preenchido com peça branca. A classe deve poder ser usada
para jogos com dois jogadores.
A classe deve ter os seguintes métodos:
• jogaPreta, que aceita dois valores que são as coordenadas onde uma peça preta será jogada, e marca na matriz a
posição somente se esta estiver livre.
• jogaBranca, que aceita dois valores que são as coordenadas onde uma peça branca será jogada, e marca na matriz
a posição somente se esta estiver livre.
• verifica, que verifica a matriz para ver se existe algum ganhador (este método deve verificar se existem cinco
peças iguais que não sejam vazias em uma horizontal, vertical ou diagonal da matriz, depois de cada jogada feita).
• toString, que retornará uma string com a representação gráfica do jogo com as posições atuais.
Escreva também um programa que use a classe. Esse programa deve executar um laço no qual fica perguntando as
posições para os jogadores alternadamente, enquanto não houver vitória, desistência ou acabarem as posições vazias da
matriz.
Dica: O algoritmo do jogo não é tão diferente do jogo da velha (exercício 11.67), exceto pelo método verifica. Esse
método pode, para cada posição do array bidimensional, ver se existem linhas de cinco peças iguais contadas a partir da
posição sendo procurada. O único cuidado adicional é garantir que o algoritmo não procurará peças fora do tabuleiro.
Exercício 11.79: ?????
Também é possível adaptar o jogo de go (exercício 11.69) para que o computador possa jogar com o usuário, usando
alguma inteligência para decidir onde posicionar suas peças. A heurística para que o computador decida qual posição é
melhor para jogar uma peça pode ser:
• Menos dois pontos para cada peça do adversário que estiver na vizinhança direta 7 × 7 e mais dois pontos para
cada peça do computador que estiver nesta vizinhança,
• Menos quatro pontos para cada peça do adversário que estiver na vizinhança direta 5 × 5 e mais quatro pontos
para cada peça do computador que estiver nesta vizinhança,
• Menos oito pontos para cada peça do adversário que estiver na vizinhança direta 3 × 3 e mais oito pontos para
cada peça do computador que estiver nesta vizinhança,
• Menos um ponto para cada peça do adversário que estiver na vizinhança indireta 7 × 7 e mais um ponto para cada
peça do computador que estiver nesta vizinhança.
A figura 11.3 mostra, para uma determinada posição, quais são as posições que correspondem às vizinhanças.
Usando o exercício 11.69 como base, escreva um método jogaComputador que calcule a melhor posição para jogo e
efetue a jogada. Outras partes da classe deverão ser reescritas, por exemplo, para permitir que o usuário decida se vai
jogar com as peças pretas ou brancas e quem será o primeiro a jogar.
Dica: Veja também o enunciado do exercício 11.78.
*/
public class JogoGo 
{

}

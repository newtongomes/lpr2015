package br.estacio.lpr.exercicioslivro2014;

/*
Exercício 4.9: ?
Liste as assinaturas dos construtores e métodos na classe RoboSimples (figura 4.7).
Exercício 4.11: ?
Considerando a classe RoboSimples (figura 4.7), quais das chamadas ao método move abaixo podem ser usadas? Ex-plique.
• move();
• move(1);
• move(’A’);
• move("A");
• move(1/3);
• move(2,3,5);
• move(9,false);
• move("17");
• move((long)3);
• move((char)65);
Exercício 4.13: ??
O que aconteceria com a instância clonado da classe RoboSimples (declarada na linha 29 da figura 4.8) se a declaração
fosse RoboSimples clonado = new RoboSimples(””+número5);?
Exercício 4.17: ??
Suponha que os robôs modelados pela classe RoboSimples possam se movimentar para a frente e para trás. Escreva na
classe dois métodos moveParaTrás, um que mova os robôs uma unidade e outro que aceite um valor como argumento
(número de unidades a mover). Dica: Mover um robô n unidades para trás é a mesma coisa que movê-lo n unidades
para a frente, então podemos chamar o método move de dentro do método moveParaTrás, trocando o sinal do valor do
movimento.
Exercício 6.4: ?
O método mudaDireção da classe RoboSimples (figura 4.7) não verifica se a direção passada como argumento é uma
das direções válidas (’N’, ’S’, ’E’ ou ’O’). Modifique o método de forma que, se um caracter diferente dos aceitos
como direções válidas for passado, o método considere a direção como sendo ’N’.
Exercício 9.11: ??
A classe RoboSimples (figura 9.2) representa um robô que pode se movimentar apenas nas quatro direções cardeais,
mas não impõe restrições no valor do ângulo que pode ser passado para o método mudaDireção (herdado da classe
RoboAbstrato). Escreva, para a classe RoboSimples, o método mudaDireção, sobreponto o método herdado, de
forma que a direção atual seja calculada como:
• Se valores abaixo de 45 graus ou acima de 315 graus forem passados como argumento para o método, a direção
do robô será 0 (zero) grau;
• Se valores entre 45 e 135 graus forem passados como argumento para o método, a direção do robô será 90 graus;
• Se valores entre 135 e 225 graus forem passados como argumento para o método, a direção do robô será 180
graus;
• Se valores entre 225 e 315 graus forem passados como argumento para o método, a direção do robô será 270
graus.
Exercício 9.12: ??
Modifique o método move da classe RoboABateria (figura 9.3) para que a energia gasta para movimentos na diagonal
(45, 135, 225 e 315 graus) seja igual a 14 vezes o número de passos, sendo que para os movimentos na horizontal ou
vertical deve continuar igual a 10 vezes o número de passos.
Exercício 9.21: ???
Escreva uma classe RoboComMemoria que herde da classe RoboAbstrato e que seja capaz de armazenar o número de
passos dados em cada direção cardeal. Escreva, para esse robô, um método retornaÀOrigem que, usando os passos
dados em cada direção e a posição atual, calcule a sua origem. Dica: Se o robô somente se move nas direções carde-ais, não é necessário armazenar quatro valores para a memória do movimento, pois cada passo dado em uma direção
corresponde ao valor negativo desses passos dados na direção oposta.
Exercício 9.22: ???
Escreva uma classe RoboPesadoABateria que herde da classe RoboABateria e que represente também o peso do robô
em quilos. Esse peso determinará a constante a ser usada para o gasto de energia com o movimento do robô: para que o
robô se movimente na direção horizontal ou vertical, o gasto de energia será o peso do robô vezes o número de passos a
ser percorrido, e para que o robô se movimente na diagonal, o gasto de energia será 1.4 multiplicado pelo peso do robô
multiplicado pelo número de passos a ser percorrido. Veja também o exercício 9.12.
Exercício 9.32: ?
Escreva um método quantaEnergia para a classe RoboABateria (figura 9.3) que retorne a quantidade de energia
restante para o robô.
Exercício 9.37: ??
Escreva um método podeSeMover para a classe RoboABateria (figura 9.3) que retorne true caso o robô possa se mover
na distância passada como argumento para o método, e false caso contrário. Escreva outro método sobrecarregado que
não receba argumentos e considere que a distância a ser percorrida é um
Exercício 9.39: ???
Modifique a classe abstrata RoboAbstrato (figura 9.1) de forma que em vez de usar dois valores separados para a posi-ção do robô, a classe use uma instância da classe Ponto2D. Que modificações deverão ser feitas nas classes herdeiras
Exercício 13.45: ??
Os métodos da classe RoboComMemoria (figura 13.6) não consideram a primeira posição do robô – podemos ver isso no
resultado da execução da classe DemoRoboComMemoria (figura 13.7). Modifique os métodos necessários para que, ao
executar o método retornaÀBase, o robô esteja na posição original e na direção original.
*/
public class RoboSimples 
{

}

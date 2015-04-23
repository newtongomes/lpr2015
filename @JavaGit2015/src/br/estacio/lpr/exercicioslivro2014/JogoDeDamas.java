package br.estacio.lpr.exercicioslivro2014;

/*
Exercício 11.81: ?
O construtor da classe JogoDeDamas (figura 11.13) inicializa todo o array de duas dimensões com o caracter ponto (’.’)
para depois reinicializar algumas posições com os caracteres que representam as peças. Modifique o construtor para que
este seja mais eficiente, inicializando com pontos somente as posições que não serão inicializadas posteriormente.
Exercício 11.84: ??
Modifique o método toString da classe JogoDeDamas (figura 11.13) para que este imprima uma borda ao redor do
tabuleiro. Essa borda pode ser feita com os caracteres ’-’ (para linhas horizontais), ’|’ (para linhas verticais) e ’+’
para intersecções.
Exercício 11.86: ???
Modifique o método toString da classe JogoDeDamas (figura 11.13) para que este imprima um tabuleiro ampliado,
de forma que em vez de um caracter para representar cada peça, quatro caracteres arranjados dois a dois sejam usados.
Dessa forma, os caracteres ’.’ (ponto, representando posição sem peça), ’o’ e ’x’ (representando as peças dos
jogadores) podem ser representados pelos grupos de quatro caracteres mostrados abaixo:
.. /\ \/
.. \/ /\
Escreva o método de forma que uma borda seja colocada entre cada caracter. Uma amostra de como o tabuleiro deve
ser impresso é mostrada abaixo (somente as quatro primeiras colunas das duas primeiras linhas são mostradas):
+--+--+--+--+
|/\|..|\/|..|
|\/|..|/\|..|
+--+--+--+--+
|/\|..|..|\/|
|\/|..|..|/\|
+--+--+--+--+
Dica: Para cada linha do array encapsulado, três linhas devem ser impressas, e, para cada coluna, três caracteres devem
ser impressos.
Exercício 11.87: ???
Escreva a classe TabuleiroGenerico que represente um tabuleiro de jogos como Damas e Xadrez. Escreva, para essa
classe, métodos que permitam a inicialização do tabuleiro e a colocação e remoção de peças, assim como a impressão
do tabuleiro (com um método toString, por exemplo). Modifique a classe JogoDeDamas para que esta seja herdeira da
classe TabuleiroGenerico.
Exercício 11.88: ???
Escreva a classe TabuleiroOitoRainhas que deve herdar da classe TabuleiroGenerico (exercício 11.87) e receber,
como argumento para seu construtor, um array de instâncias da classe Rainha, e preencher o tabuleiro com as posições
das rainhas. Dica: Será necessário criar, para a classe Rainha, métodos que retornem as coordenadas da rainha no
tabuleiro.
Exercício 11.89: ???
Escreva, para a classe TabuleiroOitoRainhas (exercício 11.88), um método éSolução que retorne true se a confi-guração das rainhas passadas como argumento para o construtor da classe for uma solução para o problema das oito
rainhas. Dica: Use o método podeSerAtacada da classe OitoRainhas (figura 11.11) como base.
Exercício 11.90: ???
Imagine uma solução recursiva para o problema das oito rainhas que tente resolver o problema partindo de uma solução
para o problema das sete rainhas (que esperançosamente é mais simples) e tentando posicionar somente a oitava rainha
de forma a resolver o problema. O problema das sete rainhas pode ser resolvido usando-se uma solução do problema
das seis rainhas e posicionando a sétima adequadamente, e assim por diante. Explique a razão pela qual esse algoritmo,
como apresentado, não funcionará, e uma possível correção.
*/
public class JogoDeDamas 
{

}

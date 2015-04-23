package br.estacio.lpr.exercicioslivro2014;

/*
Exerc�cio 11.81: ?
O construtor da classe JogoDeDamas (figura 11.13) inicializa todo o array de duas dimens�es com o caracter ponto (�.�)
para depois reinicializar algumas posi��es com os caracteres que representam as pe�as. Modifique o construtor para que
este seja mais eficiente, inicializando com pontos somente as posi��es que n�o ser�o inicializadas posteriormente.
Exerc�cio 11.84: ??
Modifique o m�todo toString da classe JogoDeDamas (figura 11.13) para que este imprima uma borda ao redor do
tabuleiro. Essa borda pode ser feita com os caracteres �-� (para linhas horizontais), �|� (para linhas verticais) e �+�
para intersec��es.
Exerc�cio 11.86: ???
Modifique o m�todo toString da classe JogoDeDamas (figura 11.13) para que este imprima um tabuleiro ampliado,
de forma que em vez de um caracter para representar cada pe�a, quatro caracteres arranjados dois a dois sejam usados.
Dessa forma, os caracteres �.� (ponto, representando posi��o sem pe�a), �o� e �x� (representando as pe�as dos
jogadores) podem ser representados pelos grupos de quatro caracteres mostrados abaixo:
.. /\ \/
.. \/ /\
Escreva o m�todo de forma que uma borda seja colocada entre cada caracter. Uma amostra de como o tabuleiro deve
ser impresso � mostrada abaixo (somente as quatro primeiras colunas das duas primeiras linhas s�o mostradas):
+--+--+--+--+
|/\|..|\/|..|
|\/|..|/\|..|
+--+--+--+--+
|/\|..|..|\/|
|\/|..|..|/\|
+--+--+--+--+
Dica: Para cada linha do array encapsulado, tr�s linhas devem ser impressas, e, para cada coluna, tr�s caracteres devem
ser impressos.
Exerc�cio 11.87: ???
Escreva a classe TabuleiroGenerico que represente um tabuleiro de jogos como Damas e Xadrez. Escreva, para essa
classe, m�todos que permitam a inicializa��o do tabuleiro e a coloca��o e remo��o de pe�as, assim como a impress�o
do tabuleiro (com um m�todo toString, por exemplo). Modifique a classe JogoDeDamas para que esta seja herdeira da
classe TabuleiroGenerico.
Exerc�cio 11.88: ???
Escreva a classe TabuleiroOitoRainhas que deve herdar da classe TabuleiroGenerico (exerc�cio 11.87) e receber,
como argumento para seu construtor, um array de inst�ncias da classe Rainha, e preencher o tabuleiro com as posi��es
das rainhas. Dica: Ser� necess�rio criar, para a classe Rainha, m�todos que retornem as coordenadas da rainha no
tabuleiro.
Exerc�cio 11.89: ???
Escreva, para a classe TabuleiroOitoRainhas (exerc�cio 11.88), um m�todo �Solu��o que retorne true se a confi-gura��o das rainhas passadas como argumento para o construtor da classe for uma solu��o para o problema das oito
rainhas. Dica: Use o m�todo podeSerAtacada da classe OitoRainhas (figura 11.11) como base.
Exerc�cio 11.90: ???
Imagine uma solu��o recursiva para o problema das oito rainhas que tente resolver o problema partindo de uma solu��o
para o problema das sete rainhas (que esperan�osamente � mais simples) e tentando posicionar somente a oitava rainha
de forma a resolver o problema. O problema das sete rainhas pode ser resolvido usando-se uma solu��o do problema
das seis rainhas e posicionando a s�tima adequadamente, e assim por diante. Explique a raz�o pela qual esse algoritmo,
como apresentado, n�o funcionar�, e uma poss�vel corre��o.
*/
public class JogoDeDamas 
{

}

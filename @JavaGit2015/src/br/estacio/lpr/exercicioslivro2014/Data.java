package br.estacio.lpr.exercicioslivro2014;

/*
Exercício 1.42: ????
A operação inicializaData do modelo Data (figura 1.7) tem uma abordagem simplista demais para verificar se o dia
sendo usado é válido ou não: nessa operação ainda seria possível passar a data 31/02/2000 e a operação iria considerar
os valores passados como sendo válidos. Modifique a operação dataÉVálida para que esta considere o valor máximo
que pode ser aceito como válido, dependendo do mês, de forma que, para meses com 30 dias, o valor 31 para o dia seja
considerado incorreto, e que para fevereiro o valor máximo seja calculado em função de o ano ser bissexto ou não. Dica:
Anos bissextos (tendo 29 dias em fevereiro) são divisíveis por quatro, a não ser que sejam divisíveis por 100. Anos que
podem ser divididos por 400 também são bissextos. Dessa forma, 1964 e 2000 são bissextos, mas 1900 não é bissexto.
A operação de divisibilidade pode ser implementada pela função módulo, representada pelo sinal %, e comparada com
zero: a expressão (1966 % 4) == 0 é verdadeira, enquanto a expressão (1967 % 4) == 0 é falsa.
Exercício 2.13: ?
Modifique o método mostraData da classe Data (figura 2.7) para que o mês seja mostrado por extenso em vez de
numeral (isto é, quando o mês for 3, que o método imprima março, etc.)
Exercício 1.10: ?
Baseado no modelo Data (figura 1.7) crie o modelo HoraAproximada, que represente uma hora qualquer (usando
valores para representar horas e minutos). Que dados e operações este modelo deve ter?
Exercício 1.28: ??
Modifique a operação mostraData no modelo Data (figura 1.7) para que o mês seja mostrado por extenso. Dica: Veja
o exercício 1.13.
Exercício 2.17: ?
A classe Data (figura 2.7) pode representar datas não-válidas, com os valores de dia, mês e ano iguais a zero. Modifique
o método mostraData para que, se a data encapsulada não for válida, uma mensagem “Data Inválida” seja impressa,
em vez dos valores de dia, mês e ano (veja o exercício 1.13).
Exercício 2.25: ?
Modifique o método éIgual da classe Data (figura 2.7) para que uma data inválida seja considerada sempre diferente
de qualquer outra
Exercício 2.38: ??
Escreva, na classe Data, um método duplicaData que receba como argumento uma outra instância da classe Data, e
duplique os valores dos campos da instância passada como argumento para os campos encapsulados
Exercício 2.42: ???
Implemente a lógica correta de cálculo de anos bissextos e dias nos meses mostrada no exercício 1.42 na classe Data.
Exercício 2.48: ???
Uma das operações que podemos efetuar com datas é a comparação para ver se uma data ocorre antes de outra. O
algoritmo para comparação é muito simples, e seus passos estão abaixo. Nesse algoritmo, consideramos que dia1, mês1
e ano1 são os dados da primeira data, e que dia2, mês2 e ano2 são os dados da segunda data.
1. Se ano1 < ano2 a primeira data vem antes da segunda.
2. Se ano1 > ano2 a primeira data vem depois da segunda.
3. Se ano1 == ano2 e mês1 < mês2 a primeira data vem antes da segunda.
4. Se ano1 == ano2 e mês1 > mês2 a primeira data vem depois da segunda.
5. Se ano1 == ano2 e mês1 == mês2 e dia1 < dia2 a primeira data vem antes da segunda.
6. Se ano1 == ano2 e mês1 == mês2 e dia1 > dia2 a primeira data vem depois da segunda.
7. Se nenhum desses casos ocorrer, as datas são exatamente iguais.
Escreva um método vemAntes na classe Data (figura 2.7) que receba como argumento outra instância da classe Data e
implemente o algoritmo acima, retornando true se a data encapsulada vier antes da passada como argumento e false
caso contrário. Se as datas forem exatamente iguais, o método deve retornar true.
Exercício 4.24: ?
Se a classe Data tivesse um método toString (pedido no exercício 3.20), o método toString da classe
EventoAcademico (figura 4.3) poderia ser escrito de maneira muito mais simples. Reescreva o método toString
da classe EventoAcademico usando uma chamada ao método toString da classe Data.
Exercício 4.25: ?
Quando chamamos o método inicializaData para inicializar campos de uma instância da classe Data, somos obri-gados a fazer o cast para que os argumentos para o método sejam reconhecidos como sendo dos tipos apropriados (ver
linhas 35 e 42 da figura 3.1). Usando sobrecarga, seria possível escrever um outro método inicializaData que recebe
três argumentos do tipo int, que serão convertidos dentro do corpo do método, fazendo com que o programador usuário
da classe não precise se preocupar com o cast em seus programas. Embora a solução possa ser compilada e executada,
existe um pequeno problema de design ou de organização de classes com essa solução. Qual é?
*/
public class Data 
{

}

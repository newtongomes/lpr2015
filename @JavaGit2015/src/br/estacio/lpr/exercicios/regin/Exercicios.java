package br.estacio.lpr.exercicios.regin;

public class Exercicios {

}



PROBLEMA 1 
/* Elabore um programa para receber pela entrada de dados do computador dois números,  
 * em seguida calcular e mostrar a soma e o produto dos dois números e mostre o maior   
 * numero digitado ou a informacão se forem iguais */   
 
package br.estacio.lpr.exercícios;  
import java.util.Scanner; 
 
public class Exercicio1 { 
 
public static void main(String[] args) { 
Scanner teclado = new Scanner (System.in); 
int n1, n2, soma, prod; 
 
System.out.println ("Digite dois numeros:"); 
 
System.out.print ("n1: ");  
n1 = teclado.nextInt();  
 
System.out.print ("n2: ");  
n2 = teclado.nextInt();  
soma = n1+n2; 
prod = n1*n2;  
 
System.out.println("Soma = " + soma); 
System.out.println("Produto = " + prod);  
 
} 
 
} 
 

PROBLEMA 2 
/* Elabore um programa para receber o nome e as 3 notas de um aluno,   
 * em seguida calcular  e mostrar a media das notas do aluno com o   
 * respectivo resultado da aprovado (Aprovado se media >= 6) */ 
 
package br.estacio.lpr.exercícios;  
import java.util.Scanner; 

public class Exercicio2 { 
 
public static void main(String[] args) { 
Scanner teclado = new Scanner (System.in); 
String nome; 
float n1, n2, n3, media;  
System.out.println("Digite o nome do aluno: ");  
nome = teclado.nextLine(); 
System.out.println("Digite as tres notas do aluno: "); 
System.out.println("Nota 1: ");  
n1 = teclado.nextFloat(); 
System.out.println("Nota 2: ");  
n2 = teclado.nextFloat(); 
System.out.println("Nota 3: ");  
n3 = teclado.nextFloat(); 
media = (n1+n2+n3)/3; 
System.out.println("Media do aluno = " + media);  
if (media < 6){ 
System.out.println("Reprovado!");  
} 
else{  
System.out.println("Aprovado!"); 
} 
 
} 
} 
 
PROBLEMA 3 
/*Elabore um novo programa para calcular a média do Problema 2,  
considerando apenas as duas maiores notas do aluno.  
*/ 
import java.util.Scanner; 
public class Problema3 {  
public static void main (String[] args){  
Scanner teclado = new Scanner(System.in);  
String nome;  
float n1, n2, n3;   
System.out.println("Nome do aluno: ");  
nome = teclado.nextLine();  
System.out.println("Nota 1, Nota 2 e Nota 3: ");  
n1 = teclado.nextLine();  
n2 = teclado.nextLine();  
n3 = teclado.nextLine();  
int menor=11;  
if (n1<menor){ 
menor=n1;  
}  
if (n2<menor){  
menor=n2;  
}  
if (n3<menor){ 
menor=n3;  
}  
int media = (n1+n2+n3)­menor;  
media=media/2;  
System.out.println("\n"+media); 
System.out.println("\n"+nome+" esta ");  
if (media>=6){  
System.out.println("Aprovado");  
}  
else{   
System.out.println("Reprovado"); 
}  
} 
 
} 
 
 
PROBLEMA 4 
/** 
 * @author Reginaldo 
 * @version 1.0 
 */ 
/* PROBLEMA: 
 * Elabore um programa para receber as 2 notas de uma turma de 30 alunos,  
 * e para cada  aluno mostrar sua media calculada.   
 * Ao final mostrar a maior media e a menor media da  turma,  
 * bem como a media geral da turma */ 
 
package br.estacio.lpr.exercícios;  
import java.util.Scanner; 
class Aluno{ 
double nota1; 
double nota2; 
double media; 
} 
 
public class Exercicio4 { 
public static void main (String[] args){ 
Scanner tc = new Scanner (System.in);  
Aluno als[] = new Aluno[3]; 
for (int i=0; i<3; i++){ 
als[i].nota1 = tc.nextDouble();  
als[i].nota2 = tc.nextDouble();  
als[i].media = (als[i].nota1+als[i].nota2)/2;   
System.out.println("Media do aluno " + i+1 + " = " + als[i].media); 
} 
} 

} 
 
PROBLEMA 5 
/* Elabore um programa para receber os nomes dos 5 candidatos a líder de turma,  
 * em seguida receber os votos dos alunos existentes na sala, 
 * e ao final mostrar o total de votos de cada candidato  
 * e ainda o candidato vencedor da eleição*/  
 
package br.estacio.lpr.exercícios;  
import java.util.Scanner; 
public class Exercicio5 { 
 
public static void main(String[] args) { 
Scanner teclado = new Scanner(System.in); 
String[] candidatos = new String[5]; 
int eleitores, voto, nulo = 0; 
int c[] = new int[5]; 
 
System.out.println("Digite o nome dos 5 candidatos, separados por ENTER: ");  
for (int i = 0; i < 5; i++) { 
candidatos[i] = teclado.nextLine(); 
} 
System.out.println("Digite a quantidade de eleitores: "); 
eleitores = teclado.nextInt();  
 
System.out.println("Hora dos votos: "); 
for (int i = 0; i < 5; i++){ 
System.out.print("\nCANDIDATO " + (i+1) + ": "); 
System.out.print(candidatos[i]); 
} 
 
for (int i = 0; i < eleitores; i++) { 
System.out.print("\nQual o numero do seu candidato? "); 
voto = teclado.nextInt(); 
 switch (voto){ 
             case 1:  
                  c[0]++; 
                  break; 
             case 2:  
   c[1]++; 
                  break; 
             case 3:  
   c[2]++; 
                  break; 
             case 4:  
   c[3]++; 
                  break; 
             case 5:  
   c[4]++; 


break; 
             default:  
                    nulo++;  
                    break; 
 } 
 
} 
System.out.print("\nRESULTADO:");  
for (int i = 0; i < 5; i++) { 
System.out.print("\nCandidato " + (i+1) + " = " + c[i] + "votos");  
} 
 
System.out.print("\nNulos = " + nulo);  
 
int maior = c[0]; 
String venc = candidatos[0];  
 
 if (c[1]>maior){ 
              maior=c[1]; 
              venc=candidatos[1]; 
} 
if (c[2]==maior){ 
               venc="Empate";  
} 
else{  
     if (c[2]>maior){ 
              maior=c[2]; 
              venc=candidatos[2]; 
     } 
} 
if (c[3]==maior){ 
               venc="Empate";  
} 
else{  
     if (c[3]>maior){ 
              maior=c[3]; 
              venc=candidatos[3]; 
     } 
} 
if (c[4]==maior){ 
               venc="Empate";  
} 
else{  
     if (c[4]>maior){ 
              maior=c[4]; 
              venc=candidatos[4]; 
     } 
} 
System.out.print("\nO VENCEDOR E " + venc + " com " + maior + " votos.");    
 
} 
 
} 
 
 
NÍVEL 2 
PROBLEMA 1 
/*Temos a precipitação diária durante o ano de 2013 no Estado do Ceará, e pretende­se armazenar todos os 
dados em um programa para gerar as seguintes estatísticas sobre os dados armazenados. 
­ total de precipitação para cada mês do ano 
­ dia de maior e menor precipitação no ano 
­ mês de maior e menor precipitação no ano 
­ média de precipitação do ano 
­ média da precipitação de cada mês do ano 
­ Os 10 Dias de maior precipitação no ano 
*/ 
PROBLEMA 2 
/*Pretendemos armazenar os dados de todos os alunos da turma de Linguagem de Programação com a 
matricula, nome, curso e média do aluno. Fazer um programa para armazenar os dados de uma turma de 
alunos com os dados acima, gerando a lista de alunos em ordem alfabética, e a lista de alunos em ordem 
decrescente da média, com as opções de Incluir, Alterar, Consultar por Nome, Consultar por Matricula e 
Excluir Alunos da Lista. 
*/ 
NÍVEL 3 
PROBLEMA 1 
/*Deseja­se calcular o salário líquido de um grupo de 10 funcionários de uma empresa,  
e ainda o total a ser pago a estes funcionários.  
Cada funcionário deve entrar com sua matrícula, nome e o salário bruto. 
O salário líquido será calculado com um desconto de 6% se o salário do funcionário for até R$1.500,00,  
e 9,5% para os salários maiores que esse valor.  
Ao final mostrar a lista de todos os funcionários com seus dados e o salário líquido de cada um.  
E ainda o total geral a ser pago aos funcionários. 
*/ 
 
package br.estacio.lpr.exemplos; 
import java.util.Scanner; 
 
public class SalarioLiquido { 
 
public static void main(String[] args) { 
Scanner teclado = new Scanner(System.in); 
int mat[] = new int[10]; 
String nome[] = new String[10];  
double salB[] = new double[10]; 
double salL[] = new double[10]; 
 
for (int i = 0; i<2; i++) {  
System.out.println("Digite a matricula: "); 
mat[i] = teclado.nextInt();   
teclado.nextLine();  
System.out.println("Digite o nome: "); 
nome[i] = teclado.nextLine(); 
System.out.println("Digite o salário bruto: "); 
salB[i] = teclado.nextDouble();  
 
salL[i] = salarioLiquido(salB[i]); 
} 
 
//System.out.println("Nome: " + nome[0]); 
 
for (int i = 0; i<2; i++) {  
System.out.println("Matricula: " + mat[i]); 
System.out.println("Nome: " + nome[i]);  
System.out.println("Salário bruto: " + salB[i]); 
System.out.println("Salário liquido: " + salL[i]); 
} 
 
} 
 
static double salarioLiquido (double x) { 
double liq;  
if (x <= 1500) {  
liq = x ­ (x * 6)/100; 
} 
else{  
liq = x ­ (x * 0.0095);  
} 
return liq;  
 
} 
} 
 
PROBLEMA 2 
/*Problema 2: 
Deseja­se ler o nome e o tempo de profissão de um grupo de 10 professores da faculdade, 
em seguida deve­se mostrar o tempo médio de profissão dos professores,  
e o nome do professor mais antigo da faculdade pelo tempo de profissão.*/  
 
package br.estacio.lpr.exemplos; 
import java.util.Scanner; 
public class ProfessoresTempo {  
 
public static void main(String[] args) { 
Scanner teclado = new Scanner(System.in); 
String nome[] = new String[10];  
int tempo[] = new int[10]; 
int tempoTotal = 0;  
int maisTempo = 0; 
for (int i = 0; i < 10; i++){ 
System.out.print("\nDigite o nome do " + (i+1) + "º professor: "); 
nome[i] = teclado.nextLine(); 
System.out.print("\nDigite o tempo de profissao do " + (i+1) + "º professor: ");  
tempo[i] = teclado.nextInt(); 
teclado.nextLine();  
if (tempo [i] > tempo[maisTempo]) { 
maisTempo = i; 
} 
tempoTotal += tempo[i];  
} 
System.out.print("\nTempo medio de profissao dos professores: " + (tempoTotal/10));  
System.out.print("\nProfessor com mais tempo de profissao: " + nome[maisTempo]);  
} 
 
} 
 
PROBLEMA 3 
/*Precisamos armazenar a precipitação de chuva diária para um determinado mês do ano,  
 * respeitando a quantidade de dias no mês solicitado.  
 * Ao final mostrar a precipitação de chuva média do mês e o dia que ocorreu a maior chuva. 
*/ 
package br.estacio.lpr.exemplos; 
import java.util.Scanner; 
public class Precipitacao {  
public static void main(String[] args) { 
Scanner teclado = new Scanner(System.in); 
int mes, dias, maisChuva = 0, total = 0; 
System.out.print("Digite o mes: "); 
mes = teclado.nextInt();  
if ((mes == 1)||(mes == 3)||(mes == 5)||(mes == 7)||(mes == 8)||(mes == 10)||(mes == 12)){ 
dias = 31;  
} 
else { 
if ((mes == 4)||(mes == 6)||(mes == 9)||(mes == 11)) { 
dias = 30;  
} 
else { 
if (mes == 2) { 
dias = 28;  
} 
else { 
System.out.println ("Numero invalido!");  
return;  
} 
} 
} 
double precip[] = new double[dias]; 
for (int i = 0; i < dias; i++) { 
System.out.print("\nPrecipitacao do " + (i+1) + "º dia: ");  
precip[i] = teclado.nextDouble(); 
total += precip[i]; 
if (precip[i] > precip[maisChuva]) { 
maisChuva = i;  
} 
} 
System.out.print("\nPrecipitacao media do mes: " + (total/dias)); 
System.out.print("\nDia que mais choveu: " + (maisChuva+1)); 
} 
} 
 
PROBLEMA 4 
/*Deve­se ler um número inteiro correspondente ao número do mês do ano (1 a 12)  
em seguida mostrar o nome do mês do ano com a quantidade de dias que o mês tem (28, 29, 30 ou 31 dias) 
Perguntar ao usuário se deseja executar o programa novamente,  
caso a resposta seja "sim", repetir o programa, caso contrário finalizar 
*/ 
 
package br.estacio.lpr.exemplos; 
import java.util.Scanner; 
 
public class MesDoAno { 
 
public static void main(String[] args) { 
Scanner teclado = new Scanner(System.in); 
int mes;  
int resp = 1; 
while (resp == 1) { 
System.out.println("Digite um numero de 1 a 12: "); 
mes = teclado.nextInt(); 
System.out.println(month(mes)); 
System.out.println("Digite 1 para repetir?"); 
resp = teclado.nextInt(); 
} 
} 
 
static String month (int m){ 
switch (m){ 
case 1:  
return "Janeiro";  
case 2:  
return "Fevereiro";  
case 3:  
return "Marco"; 
case 4:  
return "Abril"; 
case 5:  
return "Maio"; 
case 6:  
return "Junho"; 
case 7:  
return "Julho"; 
case 8:  
return "Agosto"; 
case 9:  
return "Setembro"; 
case 10: 
return "Outubro";  
case 11: 
return "Novembro";  
case 12: 
return "Dezembro";  
default: 
return "Invalido"; 
} 
} 
} 
 
 
PROBLEMA 5 
/*Problema 5: 
Ler o nome e o sobrenome de uma pessoa, em seguida mostrar as formatações:  
a) Nome Sobrenome 
b) N.S. 
c) Nome, S. 
d) S., Nomes 
e) NOME Sobrenome */  
 
package br.estacio.lpr.exemplos; 
 
import java.util.Scanner; 
 
public class NomeSobrenome {  
 
public static void main(String[] args) { 
Scanner teclado = new Scanner(System.in); 
String nome, sobrenome;  
 
System.out.print("Digite seu primeiro nome: "); 
nome = teclado.nextLine(); 
System.out.print("Digite seu sobrenome: ");  
sobrenome = teclado.nextLine();  
System.out.println(nome + " " + sobrenome); 
System.out.println(nome.charAt(0) + "." + sobrenome.charAt(0) + ".");  
System.out.println(nome + " " + sobrenome.charAt(0) + ".");  
System.out.println(sobrenome.charAt(0) + "., " + nome); 
System.out.println(nome.toUpperCase() + " " + sobrenome); 
 
} 
 
} 
 







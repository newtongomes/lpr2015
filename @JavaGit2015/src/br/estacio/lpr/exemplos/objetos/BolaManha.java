package br.estacio.lpr.exemplos.objetos;

/*
Bola:
+-------------------------+
| cor:String              |
| tamanho:int             |
| estado: boolean         |
|-------------------------|
| pintar(String):void     |
| encher(): void          |
| esvaziar(): void        |
+-------------------------+
	  
ProgramaBola:
-instanciar um objetos da classe Bola
-definir o tamanho da bola com 20
-definir a cor da bola como Amarelo
-definir a bola como cheia
-instanciar outra bola com tamanho 50 e cor Azul, inicialmente como vazia
-pintar a primeira bola de "Branco"
-esvaziar a primeira bola;
-encher a segunda bola
-re-definir o tamanho da segunda bola como 37
-mostrar os dados da primeira bola
-mostrar os dados da segunda bola
*/
public class BolaManha 
{
	// Atributos 
	
	private String cor;
	private int tamanho;
	private boolean estado;  //true=cheia false=vazia
	
	// Métodos
	
	public void pintar(String c)
	{
		cor = c;
	}
	
	public void encher()
	{
		estado = true;
	}
	
	public void esvaziar()
	{
		estado = false;
	}
	
	public void setTamanho(int tam)
	{
		if (tam < 0 || tam > 1000000)
		{
			System.out.println("tamanho inválido");
			tamanho = 0;
		}
		else
		{
		    tamanho = tam;
		}
	}
	
	public int getTamanho()
	{
		return tamanho;
	}
	


}

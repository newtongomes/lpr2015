package br.estacio.lpr.exercicios.robot;

/**
 * @author Davi Monteiro Barbosa
 */

public class RobotDavi 
{
	//Atributos	
	private String name = "Robot";
	private double speed;
	//Velocidade m�xima permitida(constante) em m/s (27.5m/s � igual a 99Km/h)
	private  double maxSpeed;
	//temperatura em Fahrenheit. Nesta escala o ponto de fus�o da �gua � de 32 �F e o ponto de ebuli��o de 212 �F.
	private double temperature;	
	private byte status;
	private int power;
	
	//Vari�vel auxiliar. Ajuda a controlar a porcentagem de carga da bateria.
	private double speedVariacao;
		
	
	//M�todos construtores
	public RobotDavi(double maxSpeed)
	{
		setStatus((byte)4);
		setMaxSpeed(maxSpeed);
		//Eleva a carga para seu valor m�ximo.
		fullCharge();
		setSpeedVariacao(0);
	}
	
	public RobotDavi(String name, double maxSpeed)
	{		
		setName(name);
		setMaxSpeed(maxSpeed);
		setStatus((byte)4);
		fullCharge();
		setSpeedVariacao(0);
	}
	
	public RobotDavi(String name, double speed, double temperature, int power, double velocidadeMax)
	{
		setName(name);
		setSpeed(speed);
		setTemperature(temperature);
		setPower(power);	
		setStatus((byte) 1);
		setSpeedVariacao(0);
		setMaxSpeed(maxSpeed);
	}
	
	//Propriedades
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		if (!name.isEmpty()) {
			this.name = name;
		}
	}
	
	public double getSpeed()
	{
		return speed;
	}
	
	private void setSpeed(double speed)
	{
		this.speed = speed;
	}
	
	public double getMaxSpeed()
	{
		return maxSpeed;
	}
	
	private void setMaxSpeed(double maxSpeed)
	{
		 if (maxSpeed > 0) {
			this.maxSpeed = maxSpeed;
		}
	}
	
	public double getTemperature() 
	{
		return temperature;
	}

	private void setTemperature(double temperature) 
	{
		this.temperature = temperature;
	}
	
	
	/*
	 *  Situa��o atual do rob�, podendo assumir 5 possibilidades
	 *	poss�veis: 1-StandBy, 2-Moving, 3-Exploring, 4-Stopped, 5-
	 *	ReturningHome
	 *
	 */
	public String getStatus()
	{
		String stringStatus;
		
		switch (status) 
		{		
		case 1:
			stringStatus = "StandBy";
			break;
			
		case 2:
			stringStatus = "Moving";
			break;
			
		case 3:
			stringStatus = "Exploring";
			break; 
		
		case 4:
			stringStatus = "Stopped";
			break;
		
		case 5:
			stringStatus = "ReturningHome";
			break;
			
		default:
			stringStatus = "Ocorreu um erro interno no sistema.";
			break;
		}
		
		return stringStatus;
	}	
	
	private void setStatus(byte status)
	{
		if (status >= 1 && status <= 5) {
			this.status = status;
		}
	}
	
	public int getPower()
	{
		return power;
	}
	
	private void setPower(int power)
	{	
		if (power >= 1 && power <= 100) {
			this.power = power;
		}
	}
	
	private double getSpeedVariacao() {
		return speedVariacao;
	}

	private void setSpeedVariacao(double speedVariacao) {
		this.speedVariacao = speedVariacao;
	}
	
	//M�todos
	
	//M�todos de mudan�a de velocidade
	public void show()
	{
		/*System.out.println("Nome: " + getName());
		System.out.println("Velocidade: " + getSpeed() + " m/s");
		System.out.println("Temperatura: " + getTemperature() + " �F");
		System.out.println("Status: " + getStatus());
		System.out.println("Carga da bateria: " + getPower() + "%");*/
		
		System.out.println(toString());
	}
	
	public String toString(){
		return "Nome: " + getName() 
				+ "\nVelocidade: " + getSpeed() + " m/s"
				+ "\nTemperatura: " + getTemperature() + " �F"
				+ "\nStatus: " + getStatus()
				+ "\nCarga da bateria: " + getPower() + "%";
	}
	
	public void stop()
	{
		if (getSpeed() == 0) 
		{
			System.out.println("O " + name + " j� est� parado!!!");
		}
		else
		{	
			//Atualiza a velocidade.
			setSpeed(0);
			//Atualizar o status (4-Stopped).
			setStatus((byte) 4);
		
			//Atualizar a temperatura reduzindo a 10% da temperatura atual.
			setTemperature(getTemperature() * 0.1);
		}
	}
	
	public void speedUp(int speedUp)
	{
		//Verifica se a velocidade ultrapassa o m�ximo permitido
		if((getSpeed() + speedUp) > getMaxSpeed() || getPower() <= 0)
		{
			System.out.println("ERRO!!!");
			System.out.println("O " + name + " n�o pode ultrapassar a velocidade de " + getMaxSpeed() + "m/s");
			System.out.println("Ou o " + name + "  n�o tem carga sufuciente.");
			
		}
		else
		{
			//Atualiza a carga da bateria de acordo com a varia��o de velocidade.
			downCharge(getSpeed(), (getSpeed() + speedUp));
			
			//Atualiza a temperatura
			upTemperature(getSpeed(),getSpeed()+speedUp);
			
			//Atualiza a velocidade
			setSpeed(getSpeed() + speedUp);
			
			//Atualiza o status (2-Moving).
			setStatus((byte) 2);					
			
		}
	}
	
	//Esse m�todo s� pode ser usado se o robot j� estiver em movimento.
	public void speedUp()
	{
		//Verifica se a velocidade ultrapassa o m�ximo permitido
		if ((getSpeed() + (getSpeed() * 0.1)) > getMaxSpeed() || getPower() <= 0) 
		{
			System.out.println("ERRO!!!");
			System.out.println("O " + name + " n�o pode ultrapassar a velocidade de " + getMaxSpeed() + "m/s");
			System.out.println("Ou o " + name + "  n�o tem carga sufuciente.");
		} 
		else if (getSpeed() > 0)
		{
			double velocidadeAtual = getSpeed() + (getSpeed() * 0.1);
			
			//Atualiza a carga da bateria de acordo com a varia��o de velocidade.
			downCharge(getSpeed(), (getSpeed() * 0.1));

			//Atualiza a temperatura
			upTemperature(getSpeed(),velocidadeAtual);
			
			//Atualiza a velocidade
			setSpeed(velocidadeAtual);
		}		
	}
	
	public void speedDown(int speedDown)
	{
		//Verifica se a velocidade ficar� negativa
		if ((getSpeed() - speedDown) <= 0) 
		{
			System.out.println("Erro! Velocidade abaixo ou igual a 0 m/s.");
			//Se a velocidade for igual a 0, o robot estar� parado.
			setStatus((byte) 4);
		} 
		else 
		{
			double velocidadeAtual = getSpeed() - speedDown;
			
			upTemperature(getSpeed(),velocidadeAtual);
				
			setSpeed(velocidadeAtual);
		}
	}
	
	public void speedBreak()
	{
		//-10% da velocidade atual
		if ((getSpeed() - (getSpeed() * 0.1)) <= 0) 
		{
			System.out.println("Erro! Velocidade abaixo ou igual a 0 m/s.");
			//Se a velocidade for igual a 0, o robot estar� parado.
			setStatus((byte) 4);
		} 
		else 
		{
			double velocidadeAtual = getSpeed() - (getSpeed() * 0.1);
			
			//Atualiza a temperatura
			upTemperature(getSpeed(),velocidadeAtual);
			
			//Atualiza a velocidade (reduzindo a 10%).
			setSpeed(velocidadeAtual);
		}
	}
	
	//M�todos de mudando de estado
	public void standBy()
	{
		//Atualiza a o status(1-StandBy).
		setStatus((byte) 1);
		
		//Atualiza a velocidade
		setSpeed(0);
		
		//32 em Fahrenheit � igual a 0 �C.	
		setTemperature(32);
		
		setPower(0);
	}
	
	public void explorer()
	{
		if(getStatus().equalsIgnoreCase("Stopped") && getPower() > 10)
		{
			//Atualiza a temperatura, aumentando em 20�F.
			setTemperature(getTemperature() + 20);
			
			//Atualiza a o status(3-Exploring).
			setStatus((byte) 3);
			
			//Ao explorar a carga da bateria � reduzida em 10% de 100(full charge).
			setPower(getPower() - 10);
			
		}
		else 
		{
			System.out.println("ERRO! O " + getName() + " deve estar em movimento para explorar.");
			System.out.println("Ou n�o existe bateria suficiente.");
		}	
	}	

	
	public void returning()
	{
		if (getSpeed() == 0) {
			System.out.println("ERRO! O " + getName() + " deve estar em movimento para retornar.");
		}
		else {
			//Apenas atualiza a o status(2-Moving).
			setStatus((byte) 2);
		}
	}
	
	//M�todo de mudan�a de temperatura
	private void upTemperature(double velocidadeInicial, double velocidadeFinal)
	{
		double variacao =  velocidadeFinal - velocidadeInicial;
		if (variacao < 0) {
			variacao = variacao * -1;
		}
		
		//Atualiza a temperatura.
		//A cada incremento de 1 m/s na velocidade, ser� acrescido 0,5�F na temperatura. 
		setTemperature(getTemperature() + variacao * 0.5);
		
	}
	
		
	//M�todos de mudan�a de carga
	
	//M�todo aumenta 10% na carga respeitando a carga m�xima.
	//10% da carga m�xima(100).
	public void charge()
	{		
		if(getPower() < 100)
			setPower(getPower() + 10);
	}
	
	//M�todo de carrega toda a bateria.
	public void fullCharge()
	{
		if (getPower() < 100) {
			setPower(100);
		}
		
	}
	
	private void downCharge(double speedInicial, double speedFinal)
	{
		setSpeedVariacao(getSpeedVariacao() + (speedFinal - speedInicial));
		
		System.out.println("Varia��o de velocidade: " + getSpeedVariacao() + " m/s.");
		
		//Calculando a perca de carga da bateria
		//A cada aumento de 1 m/s a carga reduz em 0.25% ou 
		//A cada aumento de 4 m/s a carga reduz em 1%
		if (getSpeedVariacao() >= 4) 
		{			
			setPower(getPower() - (1 * ((int)getSpeedVariacao() / 4)));
			setSpeedVariacao(getSpeedVariacao() % 4);			
		}
		
		if (getPower() <= 0) 
		{
			System.out.println("Bateria descarregada. Entrando em Stand by...");
			standBy();
		}
	}
}

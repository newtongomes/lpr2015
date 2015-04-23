package br.estacio.lpr.exercicios.robot;

public class Robot2014 
{
	//Atributos	
	
	private String name;
	private float speed;
	private float temperature;	
	private byte status;
	private int power;	
	private float maxSpeed;
	
	//Constantes para Status do Robot
	
	public static final byte STAND_BY 	= 1;
	public static final byte MOVING 	= 2;
	public static final byte EXPLORING 	= 3;
	public static final byte STOPPED 	= 4;
	public static final byte RETURNING_HOME = 5;
	
	//Construtores
	
	public Robot2014()
	{
		this.name = "Robot";
		this.speed = 0;
		this.temperature = 0;
		this.status = STAND_BY;
		this.power = 0;
		this.maxSpeed = 0;
	}
	
	public Robot2014(String name)
	{		
		this();
		setName(name);
	}
	
	public Robot2014(String name, float speed, 
			float temperature, byte status,
			int power, float maxSpeed)
	{
		setName(name);
		setSpeed(speed);
		setTemperature(temperature);
		setStatus(status);
		setPower(power);	
		setMaxSpeed(maxSpeed);
	}
	
	//Acessores e Modificadores
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		if (!name.isEmpty()) 
		{
			this.name = name;
		}
	}
	
	public float getSpeed()
	{
		return this.speed;
	}
	
	/*-*/private void setSpeed(float speed)
	{
		if (speed >=0 && speed <= this.maxSpeed)
			this.speed = speed;
		else
			if (speed > this.maxSpeed)
				this.speed = this.maxSpeed;
			else
				this.speed = 0;
	}
	
	public float getTemperature() 
	{
		return temperature;
	}

	/*-*/private void setTemperature(float temperature) 
	{
		this.temperature = temperature;
	}
	
	public byte getStatus()
	{
		return this.status;
	}
	
	public String statusStr()
	{
		String stringStatus;
		
		switch (status) 
		{		
			case STAND_BY:
				stringStatus = "1-StandBy";
				break;
			case MOVING:
				stringStatus = "2-Moving";
				break;
			case EXPLORING:
				stringStatus = "3-Exploring";
				break; 
			case STOPPED:
				stringStatus = "4-Stopped";
				break;
			case RETURNING_HOME:
				stringStatus = "5-ReturningHome";
				break;
			default:
				stringStatus = "Erro!!!";
			break;
		}
		return stringStatus;
	}	
	
	/*-*/private void setStatus(byte status)
	{
		if (status >= STAND_BY && status <= RETURNING_HOME) 
		{
			this.status = status;
		}
	}
	
	public int getPower()
	{
		return power;
	}
	
	/*-*/private void setPower(int power)
	{	
		if (power >= 0 && power <= 100) 
		{
			this.power = power;
		}
	}
	
	public float getMaxSpeed()
	{
		return maxSpeed;
	}
	
	public void setMaxSpeed(float maxSpeed)
	{
		 if (maxSpeed >= 0 && maxSpeed >= this.speed) 
		 {
			this.maxSpeed = maxSpeed;
		}
	}
	
	//Métodos
	
	public void show()
	{
		//System.out.println("Nome: " + getName());
		//System.out.println("Velocidade: " + getSpeed() + " m/s");
		//System.out.println("Temperatura: " + getTemperature() + " °F");
		//System.out.println("Status: " + getStatus());
		//System.out.println("Carga da bateria: " + getPower() + "%");
		//System.out.println("Velocidade Máxima: " + getMaxSpeed() + " m/s");
		
		System.out.println(this.toString());
	}
	
	public String toString(){
		return "Nome: " + getName() 
				+ "\nVelocidade: " + getSpeed() + " m/s"
				+ "\nTemperatura: " + getTemperature() + " °F"
				+ "\nStatus: " + getStatus()
				+ "\nCarga da bateria: " + getPower() + "%"
				+ "\nVelocidade Máxima: " + getMaxSpeed() + " m/s";
	}
	
	public void stop()
	{
		this.setSpeed(0);
		this.setStatus(STOPPED);
		this.setTemperature(this.getTemperature() * 0.1f);
	}
	
	public void moving()
	{
		this.setStatus(MOVING);					
	}

	public void speedUp(float speed)
	{
		float speedAtual = this.getSpeed();
		
		this.setSpeed(this.getSpeed() + speed);
		if (this.getStatus() != MOVING && this.getStatus() != RETURNING_HOME)
			this.moving();
		
		if (speedAtual != this.getSpeed())
		{
			
		}
	}
	
	public void speedUp()
	{
		this.speedUp(this.getSpeed() * 1.1f);
	}
	
	public void speedDown(float speed)
	{
		if (this.getStatus() == MOVING || this.getStatus() == RETURNING_HOME)
		{
			this.setSpeed(this.getSpeed() - speed);
			if (this.getSpeed() == 0)
				this.stop();					
		}
	}
	
	public void breaking()
	{
		this.speedDown(this.getSpeed() * 0.9f);
	}

	public void standBy()
	{
		this.setStatus(STAND_BY);					
		this.setSpeed(0);
		this.setTemperature(0);
	}
	
	public void exploring()
	{
		if(this.getStatus() == STOPPED)
		{
			this.setStatus(EXPLORING);					
			this.setTemperature(this.getTemperature() + 20);
		}
	}	
	
	public void returning()
	{
		if (this.getStatus() == MOVING)
		{
			this.setStatus(RETURNING_HOME);
		}
	}
			
	public void charge()
	{		
		this.setPower((int)(this.getPower() + 1.1f));
		if (this.getPower() > 100)
			this.setPower(100);
	}
	
	public void fullCharge()
	{
		this.setPower(100);
	}
	
}

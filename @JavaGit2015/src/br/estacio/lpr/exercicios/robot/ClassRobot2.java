package br.estacio.lpr.exercicios.robot;
// Implementação de Vinicius - SOOI-15-10-2008
public class ClassRobot2
{
	private String name;
	private float speed;
	private float temperature;
	private String status;
	private float power;
	private float maxVelocity;
	
	public ClassRobot2()
	{
	status = "StandBy";
	}

	public ClassRobot2(String name)
	{
		this.name = name;
		status = "StandBy";
	}

	public ClassRobot2(String name, float temperature, float maxVelocity)
	{
		this.name = name;
		power = 0;
		speed = 0;
		status = "StandBy";
		this.temperature = temperature;
		setMaxVelocity(maxVelocity);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public float getSpeed()
	{
		return speed;
	}
	
	private void setSpeed(float speed)
	{
		float inicial=speed;
		this.speed = speed;
		if (! getStatus().equals("ReturningHome"))
			setStatus((byte)2);
		if (this.speed>maxVelocity)
			this.speed=maxVelocity;
		if (this.speed<=0)
		{
			this.speed=0;
			setStatus((byte)1);
		}
		setTemperature(this.temperature + (this.speed-inicial)*0.5f);
	}
	
	public float getMaxVelocity()
	{
		return maxVelocity;
	}

	public void setMaxVelocity(float maxVelocity)
	{
		this.maxVelocity = maxVelocity;
	}

	public float getTemperature()
	{
		return temperature;
	}

	public void setTemperature(float temperature)
	{
		this.temperature = temperature;
	}

	public String getStatus()
	{
		return status;
	}

	private void setStatus(byte status)
	{
		if (status==1) this.status = "StandBy";
		else if (status==2) this.status = "Moving";
		else if (status==3) this.status = "Exploring";
		else if (status==4) this.status = "Stopped";
		else if (status==5) this.status = "ReturningHome";
	}

	public float getPower()
	{
		return power;
	}

	private void setPower(float power)
	{
		this.power = power;
	}
	
        @Override
	public String toString()
	{
		return "Nome: "+getName()+", \nVelocidade Maxima: "+getMaxVelocity()+", \nVelocidade Atual: "+getSpeed()+", \nTemperatura: "+getTemperature()+"\nStatus: "+getStatus()+", \nCarga da bateria: "+getPower()+"%.";
	}
	
	public void show()
	{
		System.out.println(toString());
	}
	
	public void stop()
	{
		setSpeed(0);
		setStatus((byte)4);
		temperature -= (temperature*10)/100;			
	}
	
	public void speedUp(int x)
	{
		setSpeed(speed+x);
	}
	
	public void speedUp()
	{
		setSpeed((speed+(speed*10))/100);
	}
	
	public void speedDown (int x)
	{
		setSpeed(speed-x);
	}

	public void breaking ()
	{
		setSpeed((speed-(speed*10))/100);
	}
	
	public void standBy()
	{
		setStatus((byte)1);
		setSpeed(0);
		temperature=0;
	}
	
	public void explorer()
	{
		setPower(power-10/100);
		if (status.equals("Stopped"))
			setTemperature(20);
	}
	
	public void returning ()
	{
		if (status.equals("Moving"))
			setStatus((byte)2);	
	}
	
	public void charge ()
	{
		setPower(power+ 10);
	}
	
	public void fullCharge()
	{
		setPower(100);
	}
}
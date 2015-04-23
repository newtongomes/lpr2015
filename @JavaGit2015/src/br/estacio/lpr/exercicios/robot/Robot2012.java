package br.estacio.lpr.exercicios.robot;
/*
   Implementação * Com correções - 2012
   Aluna Lucimara - 2008.2 - POO - Manhã
*/


public class Robot2012 {

	public static final byte STAND_BY = 1;
	public static final byte MOVING = 2;
	public static final byte EXPLORING = 3;
	public static final byte STOPPED = 4;
	public static final byte RETURNING_HOME = 5;
	
	
	private String name;
	private float speed;
	private float temperature;
	private String status;
	private float power;
	private float maxVelocity;


	public Robot2012() 
	{
		setName("");
		setSpeed(0);
		setTemperature(0);
		setPower(0);
		setMaxVelocity(0);
		setStatus((byte)1);
	}

	public Robot2012(String name) 
	{
		this();
		setName(name);
	}

	public Robot2012(String name, float speed, float temperature,
			byte status, float power, float maxVelocity) 
	{
		this(name);
		setSpeed(speed);
		setTemperature(temperature);
		setStatus(status);
		setPower(power);
		setMaxVelocity(maxVelocity);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSpeed() {
		return speed;
	}

	private void setSpeed(float speed) 
	{
		this.speed += speed;
		if (this.speed > this.maxVelocity)
			this.speed = this.maxVelocity;
	}

	public float getTemperature() {
		return temperature;
	}

	private void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public String getStatus() {
		return status;
	}

	private void setStatus(byte status) {
		switch (status) {
		case STAND_BY:
			this.status = "StandBy";
			break;
		case MOVING:
			this.status = "Moving";
			break;
		case EXPLORING:
			this.status = "Exploring";
			break;
		case STOPPED:
			this.status = "Stopped";
			break;
		case RETURNING_HOME:
			this.status = "ReturningHome";
			break;
		default:
			System.out.println("Error");
			break;
		}
	}

	public float getPower() {
		return power;
	}

	private void setPower(float power) 
	{
		this.power = power;
		if (this.power < 0)
			this.power = 0;
		if (this.power > 100)
			this.power = 100;
	}

	public float getMaxVelocity() {
		return maxVelocity;
	}

	public void setMaxVelocity(float maxVelocity) {
		this.maxVelocity = maxVelocity;
		if (this.maxVelocity < 0)
			this.maxVelocity = 0;
		if (this.speed > this.maxVelocity)
			this.speed = this.maxVelocity;
	}

	public void show() 
	{
		System.out.println(this.toString());
	}

	public String toString() 
	{
		return "Name: [" + getName() + "] Speed: [" + getSpeed() + "m/s] " +
				"maxVel: [" + getMaxVelocity() + "m/s] "
				+ "Temperature: [" + getTemperature() + "°F] " + "Status: ["
				+ getStatus() + "] Power: [" + getPower() + "]";
	}

	public void stop() 
	{
		if (getStatus().equals("Moving") || getStatus().equals("ReturningHome")) 
		{
			this.setSpeed(0);
			this.setTemperature(getTemperature() * 0.9f);
			this.setStatus((byte)4);  // "Stopped"
		}
	}

	public void speedUp() 
	{
		float incSpeed = this.getSpeed() * 0.1F;
		if (incSpeed == 0)
			incSpeed = 10;
		this.speedUp(incSpeed);
	}

	public void speedUp(float incSpeed) 
	{
		float oldSpeed = this.getSpeed();
		if (incSpeed < 0)
			incSpeed = 0;
		if (! getStatus().equals("Explorer") && incSpeed > 0)
		{
			if (getStatus().equals("StandBy") || getStatus().equals("Stopped"))
				this.setStatus((byte)2); // "Moving"
			this.setSpeed(this.getSpeed() + incSpeed);
			incSpeed = this.getSpeed() - oldSpeed;
			this.setTemperature(this.getTemperature() + incSpeed * 0.5F);
			this.setPower(this.getPower() - this.getPower() * incSpeed * 0.25F);
			if (this.getPower() == 0)
				this.standBy();
		}
	}

	// parei aqui...
	public void speedDown(int vel){
		float speed = getSpeed() - vel;
		setTemperature((float) (getTemperature() - vel * 0.5));
		float power = getPower() + getPower() * vel * 0.25f;
		if (speed == 0) stop();
		else {
			setSpeed(speed);
			if (power > 100) fullChange();
			else {
				if (power == 0) setStatus((byte)1);
				else setPower(power);
			}
		}
		
	}

	public void breaking(){
		float speed = (float) (getSpeed() * 0.9);
		if(speed == 0) stop();
		else setSpeed(speed);
	}

	public void standBy(){
		if (this.getStatus().equals("Stopped"))
		{
			this.setStatus((byte)1);  // "StandBy"
			this.setSpeed(0);
			this.setTemperature(0);
		}
	}

	public void explorer(){
		if (getStatus().equals("Stopped")){
			setStatus((byte) 3);
			setTemperature(getTemperature() + 20);
			float power = getPower() * 0.9f;
			if (power < 0) setPower(0);
			else {
				if (power > 100) fullChange();
				else setPower(power);
			}
		}
	}

	public void returning(){
		if (getStatus().equals("Moving")) setStatus((byte) 2);
	}

	public void change(){
		float power = (float) (getPower() * 1.1); 
		if (power < 100) {
			if (power == 0){
				setStatus((byte)1);
			} else setPower(power);
		}
		else fullChange();
	}

	public void fullChange(){
		setPower(100);
	}

}

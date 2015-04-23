package br.estacio.lpr.exercicios.robot;
public class ClassRobot 
{
    private String name;
    private float speed;
    private float temperature;
    private int power;
    private String status;
    private float maxSpeed;

    public ClassRobot() 
    {
        setName("");
        setSpeed(0);
        setTemperature(0);
        setPower(0);
        setStatus((byte)1);
        setMaxSpeed(0);
    }

    public ClassRobot(String name) 
    {
        this();
        setName(name);
    }

    public ClassRobot(String name, float maxSpeed) 
    {
        this(name);
        setMaxSpeed(maxSpeed);
    }

    public String getName() 
    {   return name;  }

    public int getPower() 
    {   return power;  }

    public float getSpeed() 
    {   return speed;  }

    public String getStatus() 
    {   return status;  }

    public float getTemperature() 
    {   return temperature;  }

    public float getMaxSpeed() 
    {   return maxSpeed;  }
    
    public void setName(String name) 
    {   this.name = name;  }

    public void setPower(int power) 
    {   this.power = power;  }

    public void setSpeed(float speed) 
    {   this.speed = speed;  }

    public void setTemperature(float temperature) 
    {   this.temperature = temperature;  }

    public void setMaxSpeed(float maxSpeed) 
    {   this.maxSpeed = maxSpeed;  }
    
    private void setStatus(byte st) 
    {   
        if (st==1)       status = "1-StandBy";
        else if (st==2)  status = "2-Moving";
        else if (st==3)  status = "3-Exploring";
        else if (st==4)  status = "4-Stopped";
        else if (st==5)  status = "5-ReturningHome";
    }

    public String toString() 
    {
        return "Robot: "+getName()+
                " Speed:"+getSpeed()+
                " Temperature:"+getTemperature()+
                " Power(%):"+getPower()+
                " MaxSpeed:"+getMaxSpeed()+
                " Status: "+getStatus();
    }
    
    public void show()
    {
        System.out.println(this.toString());
    }
    
    
    
    
    

}

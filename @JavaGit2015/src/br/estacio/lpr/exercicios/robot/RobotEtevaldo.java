package br.estacio.lpr.exercicios.robot;
import javax.swing.JOptionPane;

public class RobotEtevaldo
{
	private String nome;
	private double velocidade;
	private double temperatura;
	private String status;
	private double power;
	private double velocidadeMax;
	
	
	
	public RobotEtevaldo()
	{
		this.nome="";
		this.velocidade=0;
		this.setStatus((byte)1);
		this.temperatura=0;
		this.power=0;
		this.velocidadeMax=0;
	}
	
	public RobotEtevaldo(String nome)
	{
		this.nome=nome;
		this.velocidade=0;
		this.setStatus((byte)1);
		this.temperatura=0;
		this.power=0;
		this.velocidadeMax=0;
	}
	
	public RobotEtevaldo(String nome,double velocidade,double temperatura,double velocidadeMax)
	{
		this.nome=nome;
		this.velocidade=velocidade;
		this.setStatus((byte)1);
		this.temperatura=temperatura;
		this.power=power;
		this.velocidadeMax=velocidadeMax;
		
	}
		

public String getNome()
	{
		return nome;
	}
	
	public double getVelocidade()
	{
		return velocidade;
	}
	
	public double getVelocidadeMax()
	{
		return velocidadeMax;
	}
	
	public double getTemperatura()
	{
		return temperatura;
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public double getPower()
	{
		return power;
	}
	
	public void setNome(String nome)
	{
		this.nome=nome;
	}
	
	private void setVelocidade(double velocidade)
	{
	 		
		this.velocidade=velocidade;
	}
	
	private void setVelocidadeMax(double velocidadeMax)
	{
		
		this.velocidadeMax=velocidadeMax;
	}
	
	private void setTemperatura(double temperatura)
	{
		this.temperatura=temperatura;
	}
	
	private void setStatus(byte status)
	{
		if(status==1)
			this.status="StandBy";
		else
			if(status==2)
				this.status="Moving";
			else
				if(status==3)
					this.status="Exploring";
				else
					if(status==4)
						this.status="Stopped";
					else
						if(status==5)
							this.status="Returning Home";
						else
							this.status="Não reconhece";
		
	}
	
	
	
	
	public String toString()
	{
		return "Estado do Robô / Nome: "+ this.getNome()+ ",Power: " +this.getPower()+ ",Velocidade: " +this.getVelocidade()+ ",Status: " +this.getStatus()+ ",Temperatura: "+this.getTemperatura();
	}
	
	public void show()
	{
		
	JOptionPane.showMessageDialog(null,""+this.toString(),"PROGRAMA ROBÔ",JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void stop()
	{
		this.velocidade=0;
	    this.setStatus((byte) 4);
	    this.temperatura-= 0.10*this.temperatura; 
		}
	
	public void SpeedUp(int a)
	{
		this.velocidade+=a;
		if(this.velocidade>this.velocidadeMax)
		{
	    	this.setVelocidade(this.getVelocidadeMax());
		}
		
		if(a>this.velocidadeMax)
		{
			this.setTemperatura(0.5*this.getVelocidadeMax());
			this.power-=0.25*this.velocidadeMax;
		}
		

        else
		{
		this.temperatura=0.5*a;
		this.power-=0.25*a;
		}
		
		this.setStatus((byte) 2);
		
		if(this.power<=0)
		{
	    	this.velocidade=0;
	    	this.power=0;
	    	this.setStatus((byte)1);
	    }
		
		}
	
	public void SpeedUp()
	{
		if(this.velocidade==0)
		{
			this.velocidade=10;
			this.temperatura=0.5*10;
			this.setStatus((byte) 2);
		}
		else
		{
		this.velocidade=(this.velocidade*0.10) + this.velocidade;
		this.temperatura=0.5*(this.velocidade*0.10);
		}
		
		if(this.velocidade>this.velocidadeMax)
		{
	    	this.velocidade=this.velocidadeMax;
		}
		
		this.power-=0.25*(this.velocidade*0.10);
		this.setStatus((byte) 2);
		
		if(this.power<=0)
		{
	    	this.velocidade=0;
	    	this.power=0;
	    	this.setStatus((byte)1);
	    }
		
		}
	
	public void SpeedDown(int a)
	{
		
		this.velocidade-=a;
		this.temperatura-=0.5*a;
		this.setStatus((byte) 2);
		
		if(this.temperatura<=0)
		{
			this.temperatura=0;
			this.velocidade=0;
			this.setStatus((byte)1);
		}
		
		if(this.power<=0)
		{
	    	this.velocidade=0;
	    	this.power=0;
	    	this.setStatus((byte)1);
	    }
		   
		if(this.velocidade<=0)
		{
		 this.velocidade=0;
		 this.setStatus((byte)1);	
		}
		
	   }
	
	public void breaking()
	{
		
		
		this.velocidade=0.10*this.velocidade;
		this.temperatura-=0.5*(this.velocidade*0.10);
		
		if(this.temperatura<=0)
		{
			this.temperatura=0;
			this.velocidade=0;
			this.setStatus((byte)1);
		}
		
		if(this.power<=0)
		{
	    	this.velocidade=0;
	    	this.power=0;
	    	this.setStatus((byte)1);
	    }
		
		if(this.velocidade<=0)
		{
			this.velocidade=0;
		 this.setStatus((byte)1);	
		}
		
	  }
	
	
	public void standBy()
	{
		this.velocidade=0;
		this.temperatura=0;
		this.setStatus((byte)1);
		
	}
	
	public void explorer()
	{
		
		if(this.status=="Stopped")
		{
			this.temperatura+=20;
			this.SpeedUp();
		this.setStatus((byte) 3);
		this.power=(this.power)-this.power*0.10;
		}
		
		else
		{
			this.stop();
		}
		
		if(this.power<=0)
		{
	    	this.velocidade=0;
	    	this.power=0;
	    	this.setStatus((byte)1);
	    }
		
		}
	
	public void returning()
	{
		if(this.status=="Moving")
		{
			this.setStatus((byte)5);
		}
		else
		{
			this.stop();
		}
	}
	
	public void charge()
	{
		this.power=(0.10*this.power)+this.power;
		
		if(this.power>100)
		{
			this.power=100;
		}

	}
	
	public void fullcharge()
	{
		this.power=100;
		
	}
		
}

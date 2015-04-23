package cap07;
public class Lampada {
    private boolean status;

    public void ligar(){
        status = true;
    }
    public void desligar(){
        status = false;
    }
    public String observar(){
        if(status)
            return "ligado";
        else
            return "desligado";
    }
}

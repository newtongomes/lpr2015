package cap07;
public class Tv {
    private boolean ligado;
    private int canal;
    private int volume;

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
    public Tv(){
    }
    public Tv(int canal){
        this.canal = canal;
        this.volume = 25;
    }
    public void aumentarVolume(){
        if (volume<100)
            volume ++;
    }
    public void reduzirVolume(){
        if (volume>0)
            volume --;
    }
    public void trocarCanal(int canal){
        if(canal>=0 || canal<=999)
            this.canal = canal;
    }
    public void mostrar(){
        System.out.println("Status: " + ligado + "\nCanal: " + canal + "\nVolume: " + volume);
    }
}

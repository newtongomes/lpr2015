package cap07;
public class UsaTv {
    public static void main(String[] args) {
        Tv tv  = new Tv(50);
        tv.ligar();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.reduzirVolume();
        tv.trocarCanal(30);
        tv.mostrar();
        tv.desligar();
    }
}

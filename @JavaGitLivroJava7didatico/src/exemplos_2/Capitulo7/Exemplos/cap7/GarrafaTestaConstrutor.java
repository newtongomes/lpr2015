package cap07;
public class GarrafaTestaConstrutor {
    public static void main(String[] Args) {
        Garrafa garrafa1 = new Garrafa();
        Garrafa garrafa2 = new Garrafa("Vidro");
        Garrafa garrafa3 = new Garrafa(1000);
        Garrafa garrafa4 = new Garrafa("Plástico", 2500);

        //garrafa1.mostrarConteudo();
        //garrafa2.mostrarConteudo();
        //garrafa3.mostrarConteudo();
        //garrafa4.mostrarConteudo();
    }
}




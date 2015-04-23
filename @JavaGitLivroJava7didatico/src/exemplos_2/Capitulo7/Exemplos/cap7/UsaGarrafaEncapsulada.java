package cap07;
public class UsaGarrafaEncapsulada {
    public static void main(String[] args) {
        GarrafaEncapsulada garrafa1 = new GarrafaEncapsulada();
        garrafa1.setCapacidade(1000);
        garrafa1.setTipoMaterial("vidro");
        System.out.println(garrafa1.getTipoMaterial());
        System.out.println(garrafa1.getCapacidade());

    }
}



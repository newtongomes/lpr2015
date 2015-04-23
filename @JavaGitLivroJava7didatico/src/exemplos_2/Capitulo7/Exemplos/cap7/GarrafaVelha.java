package cap07;
public class GarrafaVelha {
    public String tipoMaterial;
    public int capacidade;
    public void encher() {
        System.out.println("Enchendo a garrafa");
    }
    public void esvaziar() {
        System.out.println("Esvaziado a garrafa");
    }
    public void mostrarConteudo() {
        System.out.println("Material: " + tipoMaterial + "\nCapacidade: " + capacidade);
    }
}




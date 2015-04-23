package cap07;
public class UsaGarrafa {
    public static void main(String[] args) {
        GarrafaVelha garrafa1 = new GarrafaVelha();
        garrafa1.capacidade = 1000;
        garrafa1.tipoMaterial = "vidro";
        garrafa1.mostrarConteudo();
        garrafa1.encher();
        garrafa1.esvaziar();
    }
}




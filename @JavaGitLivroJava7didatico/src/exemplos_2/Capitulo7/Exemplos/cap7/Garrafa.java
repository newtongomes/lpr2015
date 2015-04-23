package cap07;
public class Garrafa {
    private String tipoMaterial;
    private int capacidade;
    public Garrafa() {
    }
    public Garrafa(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
    public Garrafa(int capacidade) {
        this.capacidade = capacidade;
    }
    public Garrafa(String tipoMaterial, int capacidade) {
        this.tipoMaterial = tipoMaterial;
        this.capacidade = capacidade;
    }
    public void encher() {
        System.out.println("Enchendo a Garrafa");
    }
}



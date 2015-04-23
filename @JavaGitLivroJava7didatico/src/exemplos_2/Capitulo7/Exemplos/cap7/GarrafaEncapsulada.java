package cap07;
public class GarrafaEncapsulada {
    private String tipoMaterial;
    private int capacidade;
    public void encher() {
        System.out.println("Enchendo a garrafa");
    }
    public void esvaziar() {
        System.out.println("Esvaziado a garrafa");
    }
    public void mostrarConteudo() {
        System.out.println("Material: " + getTipoMaterial() + "\nCapacidade: " + getCapacidade());
    }
    public String getTipoMaterial() {
        return tipoMaterial;
    }
    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}





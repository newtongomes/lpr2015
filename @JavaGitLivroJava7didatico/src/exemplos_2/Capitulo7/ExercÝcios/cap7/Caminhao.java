package cap07;
public class Caminhao {
    private String combustivel;
    private int velocidade;

    public Caminhao(){
        combustivel = "gasolina";
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        if(combustivel.toLowerCase().equals("gasolina") ||
           combustivel.toLowerCase().equals("gas") ||
           combustivel.toLowerCase().equals("diesel"))
                this.combustivel = combustivel;
        else
            System.out.println("Combustível inválido!!");
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void aumentarVelocidade(){
        if (velocidade<150)
            velocidade++;
    }

    public void reduzirVelocidade(){
        if (velocidade>0)
            velocidade--;
    }
}

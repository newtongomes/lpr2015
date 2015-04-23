package cap07;
public class UsaCaminhao {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao();
        caminhao.setCombustivel("alcool"); //não aceita
        caminhao.aumentarVelocidade();
        caminhao.aumentarVelocidade();
        caminhao.aumentarVelocidade();
        caminhao.reduzirVelocidade();

        System.out.println("Combustivel: " + caminhao.getCombustivel());
        System.out.println("Velocidade: " + caminhao.getVelocidade());
    }
}

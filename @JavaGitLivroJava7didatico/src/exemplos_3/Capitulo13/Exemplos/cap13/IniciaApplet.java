package cap13;
import java.applet.Applet;
import java.awt.*;
public class IniciaApplet extends Applet {
    private int cont = 1;
    private TextField tfTexto;
    public void init() {
        tfTexto = new TextField(40);
        add(tfTexto);
    }
    public void start() {
        System.out.println("Iniciando...");
    }
    public void stop() {
        System.out.println("Parando...");
    }
    public void destroy() {
        System.out.println("Destruindo a Applet...");
    }
    public void paint(Graphics g) {
        tfTexto.setText("Atualizou " + cont + " vezes");
        cont++;
    }
}





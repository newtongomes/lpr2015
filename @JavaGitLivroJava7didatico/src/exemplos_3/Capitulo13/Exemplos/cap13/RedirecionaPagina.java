package cap13;
import java.net.*;
import java.applet.Applet;
public class RedirecionaPagina extends Applet {
    public void init() {
        try {
            URL endereco = new URL("http://www.outroendereco.com.br");
            getAppletContext().showDocument(endereco);
            // getAppletContext().showDocument(endereco,"_blank");
        }
        catch (Exception erro) {
            getAppletContext().showStatus("Erro ao carregar o Endereço\n" + erro.toString());
        }
    }
}


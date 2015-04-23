package exemplos;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class C10EX06 extends JFrame {

  JLabel ROTUL2;
  JLabel ROTUL3;

  JComboBox LISTA;

  String ESTADO[] = {
    "Acre",             "Alagoas",             "Amapá",
    "Amazonas",         "Bahia",               "Ceará",
    "Distrito Federal", "Espírito Santo",      "Goiás",
    "Maranhão",         "Mato Grosso",         "Mato Grosso do Sul",
    "Minas Gerais",     "Pará",                "Paraíba",
    "Paraná",           "Pernambuco",          "Piauí",
    "Rio de Janeiro",   "Rio Grande do Norte", "Rio Grande do Sul",
    "Rondônia",         "Roraima",             "Santa Catarina",
    "São Paulo",        "Sergipe",             "Tocantins"
  };

  String UNIFED[] = {
    "AC", "AL", "AP",
    "AM", "BA", "CE",
    "DF", "ES", "GO",
    "MA", "MT", "MS",
    "MG", "PA", "PB",
    "PR", "PE", "PI",
    "RJ", "RN", "RS",
    "RO", "RR", "SC",
    "SP", "SE", "TO" 
  };

  String CAPITAL[] = {
    "Rio Branco",     "Maceió",    "Macapá",
    "Manaus",         "Salvador",  "Fortaleza",
    "Brasília",       "Vitória",   "Goiânia", 
    "São Luís",       "Cuiabá",    "Campo Grande",
    "Belo Horizonte", "Belém",     "João Pessoa",
    "Curitiba",       "Recife",    "Teresina",
    "Rio de Janeiro", "Natal",     "Porto Alegre",
    "Porto Velho",    "Boa Vista", "Florianópolis",
    "São Paulo",      "Aracaju",   "Palmas"
  };

  public C10EX06() {

    super("Estados Brasileiros - v. 2.0");
    Container CONT = getContentPane();

    JLabel ROTUL1 = new JLabel("Selecione um Estado");
    JLabel ROTUL4 = new JLabel("Capital:");
    JLabel ROTUL5 = new JLabel("Unidade Federativa:");

    LISTA  = new JComboBox(ESTADO);

    ROTUL2 = new JLabel(CAPITAL[0]);
    ROTUL3 = new JLabel(UNIFED[0]);

    ROTUL2.setHorizontalAlignment(JLabel.RIGHT);
    ROTUL3.setHorizontalAlignment(JLabel.RIGHT);

    setLayout(null);
 
    CONT.add(ROTUL1);

    CONT.add(LISTA);

    CONT.add(ROTUL4);
    CONT.add(ROTUL5);
    CONT.add(ROTUL2);
    CONT.add(ROTUL3);

    ROTUL1.setBounds(75,20,200,20);
    ROTUL4.setBounds(75,150,130,20);
    ROTUL5.setBounds(75,170,130,20);

    LISTA.setBounds(75,50,250,20);
    LISTA.setMaximumRowCount(4);

    ROTUL2.setBounds(195,150,130,20);
    ROTUL3.setBounds(195,170,130,20);

    LISTA.addItemListener(new EVENTO());
 
    setSize(400, 245);
    setVisible(true);

  }

  private class EVENTO implements ItemListener {
    public void itemStateChanged (ItemEvent ie) {

      int I = LISTA.getSelectedIndex();
      String MOSTRACAP = CAPITAL[I];
      String MOSTRAUFE = UNIFED[I];

      ROTUL2.setText(MOSTRACAP);
      ROTUL3.setText(MOSTRAUFE);

    }
  } 

  public static void main(String args[]) {
    javax.swing.SwingUtilities.invokeLater(
      new Runnable() {
        public void run() {
          JFrame.setDefaultLookAndFeelDecorated(true);
          JDialog.setDefaultLookAndFeelDecorated(true);
          C10EX06 VISUAL = new C10EX06();
          VISUAL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
      }
    );
  }	
}

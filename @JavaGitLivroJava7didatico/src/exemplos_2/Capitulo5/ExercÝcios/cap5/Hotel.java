package cap05;

import javax.swing.JOptionPane;

public class Hotel {

    public static void main(String[] args) {
        String[][] quartos = new String[5][10];
        for (int andar = 0; andar < 5; andar++) {
            for (int quarto = 0; quarto < 10; quarto++) {
                quartos[andar][quarto] = "Livre";
            }
        }
        while (true) {
            String op = JOptionPane.showInputDialog("Escolha uma opção: " +
                    "\n1-Imprimir lista de quartos" +
                    "\n2-Definir ocupação" +
                    "\n3-Sair");
            if (op.equals("1")) {
                for (int andar = 0; andar < 5; andar++) {
                    for (int quarto = 0; quarto < 10; quarto++) {
                        System.out.println("\nAndar: " + (andar + 1) + "\nquarto: " + (quarto + 1) + "\n" + quartos[andar][quarto]);
                    }
                }
            } else if (op.equals("2")) {
                int numeroAndar = Integer.parseInt(JOptionPane.showInputDialog("Forneça o andar"));
                int numeroQuarto = Integer.parseInt(JOptionPane.showInputDialog("Forneça o quarto"));
                numeroAndar--;
                numeroQuarto--;
                String ocupacao = JOptionPane.showInputDialog("Escolha uma opção: " +
                        "\n1-Definir como ocupado" +
                        "\n2-Definir como livre");
                if (ocupacao.equals("1")) {
                    quartos[numeroAndar][numeroQuarto] = "Ocupado";
                } else {
                    quartos[numeroAndar][numeroQuarto] = "Livre";
                }
            } else if (op.equals("3")) {
                break;
            }
        }
        System.exit(0);
    }
}


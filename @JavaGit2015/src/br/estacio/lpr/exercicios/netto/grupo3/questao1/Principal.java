package br.estacio.lp.questao1;

import javax.swing.JOptionPane;

public class Principal {    
    public static void main(String[] args) {
        FuncionarioDAO funcDao = new FuncionarioDAO();
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(
                  "\nOpções:"
                + "\n1 - Cadastrar funcionário."
                + "\n2 - Listar funcionários."
                + "\n3 - Informações."
                + "\n4 - Sair."));
            switch(op){
                case 1:
                    Funcionario func = new Funcionario();
                    func.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula do funcionário:")));
                    func.setNome(JOptionPane.showInputDialog("Informe o nome do funcionário:"));
                    func.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do funcionário:")));
                    funcDao.cadastra(func);
                    JOptionPane.showMessageDialog(null, "Funcionário cadastrado!");
                    break;
                case 2:
                    String str = "";
                    for(Funcionario lista : funcDao.lista()){
                        str +=  "Matricula: " + lista.getMatricula()+
                                "\nNome: " + lista.getMatricula() +
                                "\nSalário: " + lista.getSalario() +
                                "\n\n";
                    }
                    if(!funcDao.lista().isEmpty()){
                        JOptionPane.showMessageDialog(null, str);
                    } else{
                        JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado!");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, 
                            "Quantidade de funcionários: " + funcDao.lista().size() + 
                            "\nTotal pago em salários: " + funcDao.totalSalarios());
                    break;
                default:
                    break;
            }
        } while(op != 4);
    }
}
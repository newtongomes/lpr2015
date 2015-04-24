package br.estacio.lp.questao1;

import br.estacio.lp.questao1.Funcionario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAO {
    private ArrayList<Funcionario> funcionario = new ArrayList<Funcionario>();
    
    public Funcionario cadastra(Funcionario novoFunc){
        this.funcionario.add(novoFunc);
        return novoFunc;
    }
    
    public ArrayList<Funcionario> lista(){
        return funcionario;
    }

    public ArrayList<Funcionario> getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(ArrayList<Funcionario> funcionario) {
        this.funcionario = funcionario;
    }
    
    public double totalSalarios(){
        double total = 0;
        if(!funcionario.isEmpty()){
            for(Funcionario f : funcionario){
                total += f.getSalarioL(f.getSalario());
            }
        } else{
            return 0.0;
        }
        return total;
    }
}

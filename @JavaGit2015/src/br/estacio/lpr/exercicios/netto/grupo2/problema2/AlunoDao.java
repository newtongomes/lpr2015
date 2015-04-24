package br.estacio.lp.problema2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import javax.swing.JOptionPane;

public class AlunoDao {
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    Aluno compatator = new Aluno();
    
    public AlunoDao(){
    }
    
    public void cadastrar(Aluno novoAluno){
        alunos.add(novoAluno);
    }
    
    public void alterar(int matricula){
        if(!alunos.isEmpty()){
            for(Aluno a : alunos){
                if(a.getMatricula() == matricula){
                    a.setNome(JOptionPane.showInputDialog("Informe o nome do aluno"));
                    a.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula do aluno:")));
                    a.setCurso(JOptionPane.showInputDialog("Informe o curso do aluno:"));
                    a.setMedia(Double.parseDouble(JOptionPane.showInputDialog("Informe a média geral do aluno:")));
                    cadastrar(a);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Lista de alunos vazia!");
        }
    }
    
    public void excluir(int matricula){
        if(!this.alunos.isEmpty()){
            for(Aluno a : this.alunos){
                if(a.getMatricula() == matricula){
                    alunos.remove(a);
                } else{
                    JOptionPane.showInputDialog("Aluno não encontrado!");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Lista de alunos vazia!");
        }
    }
    
    public Aluno consultarNome(String nome){
        if(!alunos.isEmpty()){
            for(Aluno a : alunos){
                if(a.getNome().contains(nome)){
                    return a;
                } else{
                    JOptionPane.showInputDialog("Aluno não encontrado!");
                    return null;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Lista de alunos vazia!");
        }
        return null;
    }
    
    public Aluno consultarMatricula(int matricula){
        if(!alunos.isEmpty()){
            for(Aluno a : alunos){
                if(a.getMatricula() == matricula){
                    return a;
                } else{
                    JOptionPane.showInputDialog("Aluno não encontrado!");
                    return null;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Lista de alunos vazia!");
        }
        return null;
    }
    
    public ArrayList<Aluno> listarAlfabeticamente(){
        Collections.sort(alunos, compatator);
        return alunos;
    }
    
    public ArrayList<Aluno> listarMediaDecrescente(){
        Collections.sort(alunos);
        return alunos;
    }
}

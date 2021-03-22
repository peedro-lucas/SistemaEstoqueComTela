
package sistemaestoque;

import javax.swing.JOptionPane;



public class Funcionario {
    String nome;
    String CPF;
    String idade;
    String matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
    
    public void cadastrarFuncionario(){
        this.nome = JOptionPane.showInputDialog("Nome: ");
        this.CPF = JOptionPane.showInputDialog("CPF: ");
        this.idade = JOptionPane.showInputDialog("idade: ");
        this.matricula = JOptionPane.showInputDialog("matricula: ");
     }
        public void exibirfuncionario(){
        JOptionPane.showMessageDialog(null, "Nome" + this.nome + "\nCPF: " + this.CPF + "\nIdade" + this.idade + "\nMatricula: " + this.matricula);
        }
    
    
    
    
}

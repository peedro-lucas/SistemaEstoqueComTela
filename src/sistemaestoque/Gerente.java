
package sistemaestoque;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Gerente extends Funcionario{
    private String funcao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
   
    
    public String salvar(){
        try {
            FileWriter fw = new FileWriter("Gerentes.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome: " + this.nome);
            pw.println("CPF: " + this.CPF);
            pw.println("Idade: " + this.idade);
            pw.println("Matrícula: " + this.matricula);
            pw.println("Função: " + this.funcao);
            pw.println("");
            pw.print("");
            pw.flush();
            pw.close();
            fw.close();
           
            
            
        } catch (IOException ex) {
            Logger.getLogger(Gerente.class.getName()).log(Level.SEVERE, null, ex);
            return "CADASTRO INDISPONIVEL!";
        }
        
        
        
        return "Cadastrado com sucesso!";
    
    }
    
    public String lerArquivo(){
        Path caminho = Paths.get("Gerentes.txt");
         try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            
            JOptionPane.showMessageDialog(null, leitura);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        
        
        
        return null;
    }
    
    
    
    
    public void cadastrargerente(){
        super.cadastrarFuncionario();
        this.funcao = "Gerente";
    }
    public void exibirgerente(){
        super.exibirfuncionario();
        JOptionPane.showMessageDialog(null, "Função " + this.funcao);
    }}

 
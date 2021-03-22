
package sistemaestoque;

import java.awt.HeadlessException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String codCliente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }
    
    public String salvar(){
    
        try {
            FileWriter fw = new FileWriter("clientes.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome: " + this.nome);
            pw.println("Telefone: " + this.telefone);
            pw.println("CPF: " + this.cpf);
            pw.println("");
            pw.flush();
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        return "Cadastrado com sucesso!";
    }
    
    public void LerArquivo(){
        Path caminho = Paths.get("clientes.txt");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            
            JOptionPane.showMessageDialog(null, leitura);
            
            } 
        catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    


    
    
    
    public void cadastrarcliente(){
        this.nome = JOptionPane.showInputDialog("Nome");
        this.cpf = JOptionPane.showInputDialog("CPF");
        this.telefone = JOptionPane.showInputDialog("Telefone");
    }
    public void exibircliente(){
        JOptionPane.showMessageDialog(null, "Nome" + this.nome + "\nCPF: " + this.cpf + "\ntelefone" + this.telefone);
    
    
}

    void setCpf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setTelefone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

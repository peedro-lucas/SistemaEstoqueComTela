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

public class Produto {
    private String codigo;
    private String nome;
    private String preco;
    
    
    public int inserirNovoProduto(){
        return 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     public void setPreco(String preco) {
        this.preco = preco;
     }
        
    public String getPreco() {
        return preco;
    }
    
    public String salvar(){
        try {
            FileWriter fw = new FileWriter("produtos.txt", true);
            PrintWriter pw =  new PrintWriter(fw);
            pw.println("Nome: " + this.nome);
            pw.println("Código: " + this.codigo);
            pw.println("Preço: " + this.preco);
            pw.println("");
            pw.flush();
            pw.close();
            fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        return "Cadastrado com sucesso!";
    }
    
    public void lerArquivo(){
        Path caminho = Paths.get("produtos.txt");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            
            JOptionPane.showMessageDialog(null, leitura);
            
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
    
    

    
    
    public void cadastrarproduto(){
    this.codigo = JOptionPane.showInputDialog("Nome do produto");
    this.nome = JOptionPane.showInputDialog("Nome do produto");
    }
    public void exibirproduto(){
        JOptionPane.showMessageDialog(null, "Nome" + this.nome + "\ncodigo " + this.codigo);
    }
    
    
    
}

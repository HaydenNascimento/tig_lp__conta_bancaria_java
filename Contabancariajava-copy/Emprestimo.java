
/**
 * Escreva uma descrição da classe Emprestimo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Emprestimo
{
    private String nome;
    private double valor;
    private int numPrestações;
    private double taxa; 

    public Emprestimo(
      String nome, 
      double valor, 
      int numPrestações, 
      double taxa
    ){
        this.nome = nome;
        this.valor = valor;
        this.numPrestações = numPrestações;
        this.taxa = taxa;
    }
    
    /**
     * Método para aceder à var de instância nome
     */
    public String getNome() {
        return this.nome;
    }
    
    /**
     * Método para alterar o valor da var instância nome
     */
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }
    
    /**
     * Método para aceder à var de instância nome
     */
    public double getValor() {
        return this.valor;
    }
    
    /**
     * Método para alterar o valor da var instância nome
     */
    public void setValor(double novoValor) {
        this.valor = novoValor;
    }
    
    /**
     * Método para aceder à var de instância nome
     */
    public int getNumPrestações() {
        return this.numPrestações;
    }
    
    /**
     * Método para alterar o valor da var instância nome
     */
    public void setNumPrestações(int novoNumPrestações) {
        this.numPrestações = novoNumPrestações;
    }
    
    /**
     * Método para aceder à var de instância nome
     */
    public double getTaxa() {
        return this.taxa;
    }
    
    /**
     * Método para alterar o valor da var instância nome
     */
    public void setTaxa(double novaTaxa) {
        this.taxa = novaTaxa;
    }
    
    public String toString(){
        return "Nome: " + this.nome + "|valor: " + this.valor + "|numPrestações: " + this.numPrestações + "|taxa: " + this.taxa;
    }
}

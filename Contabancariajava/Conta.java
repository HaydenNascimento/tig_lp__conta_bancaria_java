
/**
 * Escreva uma descrição da classe Conta aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Conta
{
    //variavel de Instãncia
    String nome;
    //PT5050058750259207
    private String nif;
    private String email;
    private String morada;
    // +351
    private String telefone;
    // 200.30
    private double saldo;
    
    public Conta(String nome,
        String nif,
        String email,
        String morada,
        String telefone,
        double saldo
    ) {
        this.nome = nome;
        this.nif = nif;
        this.email = email;
        this.morada = morada;
        this.telefone = telefone;
        this.saldo = saldo;
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
    public String getNif() {
        return this.nif;
    }
    
    /**
     * Método para alterar o valor da var instância nome
     */
    public void setNif(String novoNif) {
        this.nif = novoNif;
        
    }
    
    /**
     * Método para aceder à var de instância nome
     */
    public String getEmail() {
        return this.email;
    }
    
    /**
     * Método para alterar o valor da var instância nome
     */
    public void setEmail(String novoEmail) {
        this.email = novoEmail;
        
    }
    
    /**
     * Método para aceder à var de instância nome
     */
    public String getMorada() {
        return this.morada;
    }
    
    /**
     * Método para alterar o valor da var instância nome
     */
    public void setMorada(String novaMorada) {
        this.morada = novaMorada;
        
    }

    /**
     * Método para aceder à var de instância nome
     */
    public String getTelefone() {
        return this.telefone;
    }
    
    /**
     * Método para alterar o valor da var instância nome
     */
    public void setTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
        
    }
    
    /**
     * Método para aceder à var de instância nome
     */
    public double getSaldo() {
        return this.saldo;
    }
    
    /**
     * Não aceita valores negativo
     * Ou seja o novoSaldo não pode ser <= 0
     */
    public void setSaldo(double novoSaldo) {
        if(this.saldo > 0) {
        this.saldo = novoSaldo;
        }
    }
    
    
    
    public String toString(){
        return "Nome: " + this.nome + "|nif: " + this.nif + "|email: " + this.email + "|morada: " + this.morada + "|telefone: " + this.telefone + "|saldo: " + this.saldo;
    }
}
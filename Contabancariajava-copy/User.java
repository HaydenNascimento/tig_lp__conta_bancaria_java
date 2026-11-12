
/**
 * Escreva uma descrição da classe User aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class User
{
    private String nome;
    private String telefone;
    private String morada;
    private String email;
    private String nif;
    
    public User(String nome,
            String telefone,
            String morada,
            String email,
            String nif
    ){
        this.nome = nome;
        this.telefone = telefone;
        this.morada = morada;
        this.email = email;
        this.nif = nif;
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
    public String getMorada() {
        return this.morada;
    }
    
    /**
     * Método para alterar o valor da var instância nome
     */
    public void setMorada(String novoMorada) {
        this.morada = novoMorada;
        
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
    public String getNif() {
        return this.nif;
    }
    
    /**
     * Método para alterar o valor da var instância nome
     */
    public void setNif(String novoNif) {
        this.nif = novoNif;
        
    }

    
    
    
    public String toString(){
        return "Nome: " + this.nome + "|telefone: " + this.telefone + "|morada: " + this.morada + "|email: " + this.email + "|nif: ";
    }
}

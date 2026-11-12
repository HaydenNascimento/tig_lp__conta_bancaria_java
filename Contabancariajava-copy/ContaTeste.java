
/**
 * Escreva uma descrição da classe ContaTeste aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ContaTeste
{
   public static void main(String[] args) {
        System.out.println("Classe para testar a Conta Bancaria!!!");
        // Criar um objeto do tipo conta
        Conta c1 = new Conta ("Hayden", "PT425650", "nickyhayden@icloud.com", "Torres da Bela Vista", "+3518376", 450.30);
        
        Conta c2 = new Conta ("Gedniel", "PT30102", "gednieljunior@gmail.com", "Pontinha Metro", "+3517865", 10.30);
        
        System.out.println(c1.getNome());
        //Alterar o nome o objeto c1
        c1.setNome("Luana Meireles");
        System.out.println(c1.getNome());
        
        String novoNome = "Luana";
        
        c1.setNome(novoNome);
        
        System.out.println(c1.getMorada());
        System.out.println(c1.getEmail());
        System.out.println(c1.getSaldo());
        // c1Saldo
        double c1Saldo = c1.getSaldo();
        
        c1.setSaldo(-1000.00);
        System.out.println("Fiz um deposito de -1000");
        System.out.println(c1.getSaldo());
        
        String infoC1 = c1.toString();
        
        System.out.println(c1Saldo);
        
        System.out.println("----------------------------");
        
        System.out.println(c2.toString());
    }
}
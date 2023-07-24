import fatec.poo.model.Instrutor;
import fatec.poo.model.Cliente;

/**
 *
 * @author 0030482221007
 */
public class Aplic {

    public static void main(String[] args) {
        
        Instrutor instrutor = new Instrutor(1010, "Carlos Silveira", "991812324");
        instrutor.setAreaAtuacao("Tecnologia da Informação");
        
        System.out.println("Instrutor");
        System.out.println("Identificação: " + instrutor.getIdentificacao());
        System.out.println("Nome: " + instrutor.getNome());
        System.out.println("Telefone: " + instrutor.getTelefone());
        System.out.println("Área de atuação: " + instrutor.getAreaAtuacao());
        
        Cliente cliente = new Cliente("21212034", "João Pereira", "996012765");
        cliente.setAltura(1.75);
        cliente.setPeso(83.9);
        
        System.out.println("\nCliente");
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.printf("IMC: %.1f%n", cliente.calcImc());
    }
    
}

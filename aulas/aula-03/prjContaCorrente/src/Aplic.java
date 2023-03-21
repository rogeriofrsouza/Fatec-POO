import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030482221007
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        System.out.print("Digite o número da conta: ");
        int numero = entrada.nextInt();
        
        System.out.print("Digite o saldo inicial: R$");
        double saldo = entrada.nextDouble();
        
        ContaCorrente cc = new ContaCorrente(numero, saldo);
        
        int opcao;
            
        do {
            System.out.println("\n1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Consultar saldo");
            System.out.println("4- Sair");
            System.out.print("Digite a opção: ");
            opcao = entrada.nextInt();
            
            System.out.println("\nNúmero da conta: " + cc.getNumero());

            switch (opcao) {
                case 1:
                    System.out.print("Valor de depósito: R$");
                    double valor = entrada.nextDouble();
                    cc.depositar(valor);
                    
                    break;
                case 2:
                    System.out.print("Valor de saque: R$");
                    valor = entrada.nextDouble();
                    
                    if (valor > cc.getSaldo()) {
                        System.out.println("Saldo insuficiente");
                    }
                    else {
                        cc.sacar(valor);
                    }
                    
                    break;
                case 3:
                    System.out.println("Saldo: R$" + df.format(cc.getSaldo()));
                    break;
            }
        } while (opcao != 4);
    }
    
}

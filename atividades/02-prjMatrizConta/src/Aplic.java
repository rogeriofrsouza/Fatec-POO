import fatec.poo.model.ContaCorrente;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030482221007
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        ContaCorrente[] vetConta = new ContaCorrente[15];
        
        for (int i = 0; i < 15; i++) {
            System.out.print("Digite o número da conta: ");
            int numero = sc.nextInt();
        
            System.out.print("Digite o saldo inicial: R$");
            double saldo = sc.nextDouble();
        
            vetConta[i] = new ContaCorrente(numero, saldo);
            System.out.println();
        }
        
        int opcao;
        ContaCorrente cc;
        double valor;
        
        do {
            System.out.println("\n1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Consultar saldo");
            System.out.println("4- Listar contas");
            System.out.println("5- Sair");
            System.out.print("Digite a opção: ");
            opcao = sc.nextInt();
            
            System.out.println();
            
            switch (opcao) {
                case 1:
                    cc = pesquisaConta(sc, vetConta);
                    
                    if (cc != null) {
                        System.out.print("Valor de depósito: R$");
                        valor = sc.nextDouble();
                        cc.depositar(valor);
                    }
                    else {
                        System.out.println("Conta não cadastrada");
                    }
                    
                    break;
                case 2:
                    cc = pesquisaConta(sc, vetConta);
                    
                    if (cc != null) {
                        System.out.print("Valor de saque: R$");
                        valor = sc.nextDouble();
                        
                        if (valor > cc.getSaldo()) {
                            System.out.println("Saldo insuficiente");
                        }
                        else {
                            cc.sacar(valor);
                        }
                    }
                    else {
                        System.out.println("Conta não cadastrada");
                    }
                    
                    break;
                case 3:
                    cc = pesquisaConta(sc, vetConta);
                    
                    if (cc != null) {
                        System.out.println("Saldo: R$" + df.format(cc.getSaldo()));
                    }
                    else {
                        System.out.println("Conta não cadastrada");
                    }
                    
                    break;
                case 4:
                    System.out.println("Número da conta      Saldo");
                    
                    for (int i = 0; i < 15; i++) {
                        System.out.printf("    %5d           R$%s%n", vetConta[i].getNumero(), df.format(vetConta[i].getSaldo()));
                    }
                    
                    break;
            }
        } while (opcao != 5);
    }
    
    public static ContaCorrente pesquisaConta(Scanner sc, ContaCorrente[] vetConta) {
        System.out.print("\nInforme o número da conta: ");
        int numero = sc.nextInt();
        
        for (int i = 0; i < 15; i++) {
            if (numero == vetConta[i].getNumero()) {
                return vetConta[i];
            }
        }
        
        return null;
    }
    
}

import fatec.poo.model.Livro;
import java.util.Scanner;

/**
 *
 * @author 0030482221007
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a identificação do livro: ");
        int id = sc.nextInt();
        
        System.out.print("Digite a situação do livro [D - Disponível/ E- Emprestado]: ");
        char ch = sc.next().toUpperCase().charAt(0);
        
        boolean situacao = ch == 'E';
        
        System.out.print("Informe o valor da multa diária: R$");
        double valMultaDiaria = sc.nextDouble();
        
        Livro livro = new Livro(id, situacao, valMultaDiaria);
        int opcao;
        
        do {
            System.out.println("\nMENU");
            System.out.println("1- Consultar livro");
            System.out.println("2- Emprestar livro");
            System.out.println("3- Devolver livro");
            System.out.println("4- Sair");
            System.out.print("Digite a opção: ");
            opcao = sc.nextInt();
            
            System.out.println();
            
            switch (opcao) {
                case 1:
                    System.out.println(livro);
                    break;
                
                case 2:
                    if (livro.isSituacao()) {
                        System.out.println("O livro está emprestado");
                    }
                    else {
                        livro.emprestar();
                    }
                    
                    break;
                    
                case 3:
                    if (!livro.isSituacao()) {
                        System.out.println("O livro já está disponível");
                    }
                    else {
                        System.out.print("Dias em atraso: ");
                        int diasEmAtraso = sc.nextInt();
                        
                        double valor = livro.devolver(diasEmAtraso);
                        
                        if (valor > 0.0) {
                            System.out.println("Valor a ser pago: R$" + valor);
                        }
                    }
                    
                    break;
            }
        } while (opcao != 4);
        
        sc.close();
    }
    
}

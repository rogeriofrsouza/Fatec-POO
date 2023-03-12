
import java.util.Scanner;

/**
 *
 * @author 0030482221007
 */
public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        
        System.out.println();
        
        // i é uma variável de apoio, utilizada somente no bloco de repetição
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
        
        sc.close();
    }
    
}

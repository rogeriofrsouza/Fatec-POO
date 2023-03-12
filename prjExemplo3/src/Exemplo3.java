
import java.util.Scanner;

/**
 *
 * @author 0030482221007
 */
public class Exemplo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        
        System.out.println();
        int i = 1;
        
        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }
        
        sc.close();
    }
    
}

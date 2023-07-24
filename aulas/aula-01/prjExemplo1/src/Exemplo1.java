
import java.util.Scanner;

/**
 * 
 * @author 0030482221007
 */
public class Exemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int codProd, qtdeVend;
        String descProd;
        double precUnit, valCompra;
        
        System.out.print("Digite o código do produto: ");
        codProd = entrada.nextInt(); // scanf("%d", &codProd);
        
        System.out.print("Digite a descrição: ");
        descProd = entrada.next(); // scanf("%s", descProd);
        
        System.out.print("Digite o preço unitário: ");
        precUnit = entrada.nextDouble(); // scanf("%lf", &precUnit
        
        System.out.print("Digite a quantidade vendida: ");
        qtdeVend = entrada.nextInt();
        
        valCompra = precUnit * qtdeVend;
        double desconto = 0.0;
        
        // Padrão Java: utilizar chaves
        if (valCompra >= 850.0) {
            desconto = 0.1 * valCompra;
        }
        
        valCompra -= desconto;
        
        System.out.println();
        System.out.println("Valor desconto: R$" + String.format("%.2f", desconto));
        System.out.println("Valor da compra: R$" + String.format("%.2f", valCompra));
        
        entrada.close();
    }
    
}

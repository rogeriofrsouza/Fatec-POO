import java.util.Scanner;
import fatec.poo.model.Circulo;

/**
 *
 * @author 0030482221007
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Circulo circ = new Circulo();
        
        System.out.print("Digite a medida do raio: ");
        double raio = sc.nextDouble();
        
        circ.setRaio(raio);
        
        System.out.println();
        System.out.println("Medida do raio: " + circ.getRaio());
        System.out.println("Medida da área: " + circ.calcArea());
        System.out.println("Medida do perímetro: " + circ.calcPerimetro());
        System.out.println("Medida do diâmetro: " + circ.calcDiametro());
        
        sc.close();
    }
    
}

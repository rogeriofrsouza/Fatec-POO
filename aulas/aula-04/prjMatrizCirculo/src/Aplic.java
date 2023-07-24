import fatec.poo.model.Circulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030482221007
 */
public class Aplic {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        int i;

        Circulo[] vetCirc = new Circulo[10];

        for (i = 0; i < 10; i++) {
            System.out.print("Digite a medida do raio: ");
            double raio = sc.nextDouble();

            vetCirc[i] = new Circulo(raio);
            System.out.println();
        }

        for (i = 0; i < 10; i++) {
            System.out.println("\nCírculo " + (i + 1));
            System.out.println("Medida do raio: " + df.format(vetCirc[i].getRaio()));
            System.out.println("Área: " + df.format(vetCirc[i].calcArea()) + "²");
            System.out.println("Perímetro: " + df.format(vetCirc[i].calcPerimetro()));
            System.out.println("Diâmetro: " + df.format(vetCirc[i].calcDiametro()));
        }
    }
}

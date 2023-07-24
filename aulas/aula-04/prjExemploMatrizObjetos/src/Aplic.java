import fatec.poo.model.Retangulo;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030482221007
 */
public class Aplic {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.0");
        Scanner entrada = new Scanner(System.in);
        int i;

        // Definição de uma matriz de objetos para classe Retangulo
        Retangulo[] matRet = new Retangulo[3];

        for (i = 0; i < 3; i++) {
            System.out.print("Digite a unidade de medida: ");
            String unidade = entrada.next();

            // Instanciação do objeto da classe Retangulo e chamada do método construtor
            matRet[i] = new Retangulo(unidade);

            System.out.print("Digite a medida da altura: ");
            double altura = entrada.nextDouble();

            System.out.print("Digite a medida da base: ");
            double base = entrada.nextDouble();

            // Passagem de mensagens
            matRet[i].setAltura(altura);
            matRet[i].setBase(base);
            System.out.println();
        }

        // Acessando matriz de objetos     
        for (i = 0; i < 3; i++) {
            System.out.println("\nRetangulo " + (i + 1));
            System.out.println("Medida da altura: " + df.format(matRet[i].getAltura()) + matRet[i].getUnidadeMedida());
            System.out.println("Medida da base: " + df.format(matRet[i].getBase()) + matRet[i].getUnidadeMedida());
            System.out.println("Área: " + df.format(matRet[i].calcArea()) + matRet[i].getUnidadeMedida() + "²");
            System.out.println("Perímetro: " + df.format(matRet[i].calcPerimetro()) + matRet[i].getUnidadeMedida());
            System.out.println("Diagonal: " + df.format(matRet[i].calcDiagonal()) + matRet[i].getUnidadeMedida());
        }
    }
}

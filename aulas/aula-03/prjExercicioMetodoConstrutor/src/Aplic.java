import fatec.poo.model.Circulo;
import java.util.Scanner;

/**
 *
 * @author 0030482221007
 */
public class Aplic {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a unidade de medida: ");
        String unidade = entrada.next();
        
        Circulo objCirc = new Circulo(unidade);
        
        System.out.print("Digite a medida do raio: ");
        double medRaio = entrada.nextDouble();
        
        objCirc.setRaio(medRaio);
        
        int opcao;
            
        do {
            System.out.println("\n1- Consultar área");
            System.out.println("2- Consultar perímetro");
            System.out.println("3- Consultar diâmetro");
            System.out.println("4- Sair");
            System.out.print("Digite a opção: ");
            opcao = entrada.nextInt();

            System.out.println("\nMedida do raio: " + objCirc.getRaio() + " " + objCirc.getUnidadeMedida());
            
            switch (opcao) {
                case 1:
                    System.out.println("Área: " + objCirc.calcArea() + " " + objCirc.getUnidadeMedida() + "²");
                    break;
                case 2:
                    System.out.println("Perímetro: " + objCirc.calcPerimetro());
                    break;
                case 3:
                    System.out.println("Diâmetro: " + objCirc.calcDiametro());
                    break;
            }
        } while (opcao != 4);
    }
    
}

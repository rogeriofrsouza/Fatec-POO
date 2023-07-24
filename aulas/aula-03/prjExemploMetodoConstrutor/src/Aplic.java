import fatec.poo.model.Retangulo;
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
        
        //instanciação(alocação) de um objeto da classe Retangulo
        //e chamada do método construtor
        Retangulo objRet = new Retangulo(unidade);
        
        System.out.print("Digite a medida da altura: ");
        double medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base: ");
        double medBase = entrada.nextDouble();
        
        //Utilizando a passagem de mensagens
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        int opcao;
            
        do {
            System.out.println("\n1- Consultar área");
            System.out.println("2- Consultar perímetro");
            System.out.println("3- Consultar diagonal");
            System.out.println("4- Sair");
            System.out.print("Digite a opção: ");
            opcao = entrada.nextInt();

            System.out.println("\nMedida da altura: " + objRet.getAltura() + " " + objRet.getUnidadeMedida());
            System.out.println("Medida da base: " + objRet.getBase() + " " + objRet.getUnidadeMedida());
            
            switch (opcao) { //passagem de mensagens
                case 1:
                    System.out.println("Área: " + objRet.calcArea() + " " + objRet.getUnidadeMedida() + "²");
                    break;
                case 2:
                    System.out.println("Perímetro: " + objRet.calcPerimetro());
                    break;
                case 3:
                    System.out.println("Diagonal: " + objRet.calcDiagonal());
            }
        } while (opcao != 4);
    }
}

import fatec.poo.model.Retangulo;
import java.util.Scanner;

/**
 *
 * @author 0030482221007
 */
public class Aplic {

    public static void main(String[] args) {
        
        // Instanciação dos objetos
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        System.out.print("Digite a medida da altura: ");
        double medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base: ");
        double medBase = entrada.nextDouble();
        
        // Passagem de mensagens para o objeto
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println();
        System.out.println("Medida da altura: " + objRet.getAltura());
        System.out.println("Medida da base: " + objRet.getBase());
        System.out.println("Medida do perímetro: " + objRet.calcPerimetro());
        System.out.println("Medida da área: " + objRet.calcArea());
        System.out.println("Medida da diagonal: " + objRet.calcDiagonal());
        
        entrada.close();
    }
    
}

import fatec.poo.model.Aluno;
import java.util.Scanner;

/**
 *
 * @author 0030482221007
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o RA do aluno: ");
        int ra = sc.nextInt();
        
        System.out.println("\nDigite a nota das provas");
        System.out.print("Prova 1: ");
        double prova1 = sc.nextDouble();
        System.out.print("Prova 2: ");
        double prova2 = sc.nextDouble();
        
        System.out.println("\nDigite a nota dos trabalhos");
        System.out.print("Trabalho 1: ");
        double trab1 = sc.nextDouble();
        System.out.print("Trabalho 2: ");
        double trab2 = sc.nextDouble();
        
        Aluno aluno = new Aluno(ra, prova1, prova2, trab1, trab2);
        int opcao;
        
        do {
            System.out.println("\nMENU");
            System.out.println("1- Exibir nota das provas/trabalhos");
            System.out.println("2- Exibir média das provas/trabalhos");
            System.out.println("3- Exibir média final");
            System.out.println("4- Sair");
            System.out.print("Digite a opção: ");
            opcao = sc.nextInt();
            
            System.out.println();
            System.out.println("RA: " + aluno.getRA());
            
            switch (opcao) {
                case 1:
                    System.out.println("Prova 1: " + aluno.getNotaProva1());
                    System.out.println("Prova 2: " + aluno.getNotaProva2());
                    System.out.println("Trabalho 1: " + aluno.getNotaTrab1());
                    System.out.println("Trabalho 2: " + aluno.getNotaTrab2());
                    break;
                
                case 2:
                    System.out.println("Média das provas: " + aluno.calcMediaProva());
                    System.out.println("Média dos trabalhos: " + aluno.calcMediaTrab());
                    break;
                    
                case 3:
                    double media = aluno.calcMediaFinal();
                    System.out.printf("Média final: %.2f%n", media);
                    
                    if (media >= 6.0) {
                        System.out.println("Situação: APROVADO");
                    }
                    else {
                        System.out.println("Situação: REPROVADO");
                    }
            }
        } while (opcao != 4);
        
        sc.close();
    }
    
}

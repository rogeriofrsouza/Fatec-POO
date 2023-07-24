import fatec.poo.model.QuartoHotel;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author 0030482221007
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner sc = new Scanner(System.in);
        QuartoHotel[] vet = new QuartoHotel[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Quarto " + (i + 1));
            System.out.print("Informe o valor da diária: R$");
            double valor = sc.nextDouble();

            System.out.println();
            vet[i] = new QuartoHotel(i + 1, valor);
        }
        
        while (true) {
            System.out.println("1- Consultar quarto\n2- Reservar quarto\n3- Liberar quarto\n4- Consultar faturamento quarto\n5- Consultar faturamento hotel\n6- Sair");
            System.out.print("Digite a opção: ");
            int op = sc.nextInt();
            
            if (op == 6) {
                break;
            }
            System.out.println();
            QuartoHotel obj;

            switch (op) {
                case 1:
                    obj = procuraQuarto(sc, vet);

                    if (obj != null) {
                        System.out.println("Situação: " + (obj.getSituacao() ? "Ocupado" : "Livre"));
                    } else {
                        System.out.println("Quarto não cadastrado");
                    }
                    
                    break;
                case 2:
                    obj = procuraQuarto(sc, vet);

                    if (obj != null) {
                        if (!obj.getSituacao()) {
                            System.out.print("Informe o número do RG: ");
                            obj.reservar(sc.nextInt());
                        } else {
                            System.out.println("O quarto já foi reservado");
                        }
                    } else {
                        System.out.println("Quarto não cadastrado");
                    }

                    break;
                case 3:
                    obj = procuraQuarto(sc, vet);

                    if (obj != null) {
                        if (obj.getSituacao()) {
                            System.out.print("Informe o número de dias: ");
                            double pagamento = obj.liberar(sc.nextInt());
                            System.out.println("Pagamento: R$" + df.format(pagamento));
                        } else {
                            System.out.println("O quarto já está livre");
                        }
                    } else {
                        System.out.println("Quarto não cadastrado");
                    }

                    break;
                case 4:
                    obj = procuraQuarto(sc, vet);

                    if (obj != null) {
                        System.out.println("Faturamento do quarto: R$" + df.format(obj.getTotalFaturado()));
                    } else {
                        System.out.println("Quarto não cadastrado");
                    }

                    break;
                case 5:
                    double total = 0.0;

                    for (int i = 0; i < 10; i++) {
                        total += vet[i].getTotalFaturado();
                    }

                    System.out.println("Faturamento do hotel: R$" + df.format(total));
            }

            System.out.println();
        }

        sc.close();
    }

    private static QuartoHotel procuraQuarto(Scanner sc, QuartoHotel[] vet) {
        System.out.print("Informe o número do quarto: ");
        int numQuarto = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (vet[i].getNumQuarto() == numQuarto) {
                return vet[i];
            }
        }
        return null;
    }
}

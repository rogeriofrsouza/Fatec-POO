import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 0030482221007
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        FuncionarioHorista horista = new FuncionarioHorista(1, "Pedro Silveira", LocalDate.parse("1978-05-14"), 15.80);
        FuncionarioMensalista mensalista = new FuncionarioMensalista(2, "Maria dos Anjos", LocalDate.parse("1983-01-30"), 1050.80);
        
        horista.setQtdeHoraTrab(60);
        horista.setCargo("Auxiliar de escritório");
        mensalista.setNumSalMinimo(3.5);
        mensalista.setCargo("Secretária");
        
        System.out.println("1. Funcionário horista");
        System.out.println("Registro: " + horista.getRegistro());
        System.out.println("Nome: " + horista.getNome());
        System.out.println("Data admissão: " + horista.getDataAdmissao().format(fmt));
        System.out.println("Cargo: " + horista.getCargo());
        System.out.println("Gratificação: $" + df.format(horista.calcGratificacao()));
        System.out.println("Salário bruto: $" + df.format(horista.calcSalBruto()));
        System.out.println("Desconto: $" + df.format(horista.calcDesconto()));
        System.out.println("Salário líquido: $" + df.format(horista.calcSalLiquido()));
        
        System.out.println("\n2. Funcionário mensalista");
        System.out.println("Registro: " + mensalista.getRegistro());
        System.out.println("Nome: " + mensalista.getNome());
        System.out.println("Data admissão: " + mensalista.getDataAdmissao().format(fmt));
        System.out.println("Cargo: " + mensalista.getCargo());
        System.out.println("Salário bruto: $" + df.format(mensalista.calcSalBruto()));
        System.out.println("Desconto: $" + df.format(mensalista.calcDesconto()));
        System.out.println("Salário líquido: $" + df.format(mensalista.calcSalLiquido()));
    }
    
}

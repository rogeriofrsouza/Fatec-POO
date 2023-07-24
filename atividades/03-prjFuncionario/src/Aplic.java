import fatec.poo.model.FuncionarioComissionado;
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
        FuncionarioComissionado comissionado = new FuncionarioComissionado(3, "Fabiano de Souza", LocalDate.parse("2000-09-26"), 5);
        
        horista.setQtdeHoraTrab(60);
        horista.setCargo("Auxiliar de escritório");
        mensalista.setNumSalMinimo(3.5);
        mensalista.setCargo("Secretária");
        comissionado.setSalBase(1300.67);
        comissionado.setCargo("Vendedor");
        comissionado.addVendas(10000.23);
        comissionado.addVendas(15000.97);
        
        System.out.println("1. Funcionário horista");
        System.out.println("Registro: " + horista.getRegistro());
        System.out.println("Nome: " + horista.getNome());
        System.out.println("Data admissão: " + fmt.format(horista.getDataAdmissao()));
        System.out.println("Cargo: " + horista.getCargo());
        System.out.println("Gratificação: $" + df.format(horista.calcGratificacao()));
        System.out.println("Salário bruto: $" + df.format(horista.calcSalBruto()));
        System.out.println("Desconto: $" + df.format(horista.calcDesconto()));
        System.out.println("Salário líquido: $" + df.format(horista.calcSalLiquido()));
        
        System.out.println("\n2. Funcionário mensalista");
        System.out.println("Registro: " + mensalista.getRegistro());
        System.out.println("Nome: " + mensalista.getNome());
        System.out.println("Data admissão: " + fmt.format(mensalista.getDataAdmissao()));
        System.out.println("Cargo: " + mensalista.getCargo());
        System.out.println("Salário bruto: $" + df.format(mensalista.calcSalBruto()));
        System.out.println("Desconto: $" + df.format(mensalista.calcDesconto()));
        System.out.println("Salário líquido: $" + df.format(mensalista.calcSalLiquido()));
        
        System.out.println("\n3. Funcionário comissionado");
        System.out.println("Registro: " + comissionado.getRegistro());
        System.out.println("Nome: " + comissionado.getNome());
        System.out.println("Data admissão: " + fmt.format(comissionado.getDataAdmissao()));
        System.out.println("Cargo: " + comissionado.getCargo());
        System.out.println("Gratificação: $" + df.format(comissionado.calcGratificacao()));
        System.out.println("Salário bruto: $" + df.format(comissionado.calcSalBruto()));
        System.out.println("Desconto: $" + df.format(comissionado.calcDesconto()));
        System.out.println("Salário líquido: $" + df.format(comissionado.calcSalLiquido()));
    }
    
}

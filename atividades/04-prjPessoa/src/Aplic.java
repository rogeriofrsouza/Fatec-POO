import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author 0030482221007
 */
public class Aplic {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        PessoaFisica pf = new PessoaFisica("Marcos Aurélio", 2007, "109.132.120-59");
        PessoaJuridica pj = new PessoaJuridica("Carlos Pereira Santos", 1998, "73.686.307/0001-61");
        
        pf.setBase(3.5);
        pf.addCompras(6700.99);
        pf.addCompras(6215.28);
        pj.setTaxaIncentivo(5.7);
        pj.addCompras(35768.55);
        pj.addCompras(3209.10);
        
        System.out.println("Pessoa física");
        System.out.println("Nome: " + pf.getNome());
        System.out.println("Ano inscrição: " + pf.getAnoInscricao());
        System.out.println("CPF: " + pf.getCpf());
        System.out.println("Base: " + pf.getBase());
        System.out.println("Bônus: R$" + df.format(pf.calcBonus(2023)));
        
        System.out.println("\nPessoa jurídica");
        System.out.println("Nome: " + pj.getNome());
        System.out.println("Ano inscrição: " + pj.getAnoInscricao());
        System.out.println("CGC: " + pj.getCgc());
        System.out.println("Taxa incentivo: " + pj.getTaxaIncentivo() * 100.0 + "%");
        System.out.println("Bônus: R$" + df.format(pj.calcBonus(2023)));
    }
    
}

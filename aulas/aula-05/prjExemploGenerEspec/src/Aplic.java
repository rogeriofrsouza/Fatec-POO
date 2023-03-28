import fatec.poo.model.Aluno;
import fatec.poo.model.Professor;
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
        
        Aluno aluno = new Aluno(1010, "Carlos Silveira", LocalDate.parse("15/03/1978", fmt));
        aluno.setMensalidade(1500.90);
        
        System.out.println("Aluno");
        System.out.println("Registro escolar: " + aluno.getRegEscolar());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Data nascimento: " + fmt.format(aluno.getDataNascimento()));
        System.out.println("Mensalidade: R$" + df.format(aluno.getMensalidade()));
        
        Professor prof = new Professor(2121, "João Pereira", LocalDate.parse("25/07/1990", fmt));
        prof.setSalario(5000.73);
        
        System.out.println("\nProfessor");
        System.out.println("Registro funcional: " + prof.getRegFuncional());
        System.out.println("Nome: " + prof.getNome());
        System.out.println("Data nascimento: " + fmt.format(prof.getDataNascimento()));
        System.out.println("Salário: R$" + df.format(prof.getSalario()));
    }
    
}

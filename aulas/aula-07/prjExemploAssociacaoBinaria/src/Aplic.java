import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;

public class Aplic {

    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/78", 15.80);
        funcHor.setCargo("Programador");

        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Ana Beatriz", "22/07/88", 600);
        funcMen.setCargo("Aux. Administrativo");

        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, "Joao Mendes", "10/12/1975", 10);
        funcCom.setCargo("Vendedor");

        // Instanciação de objetos da classe Departamento
        Departamento objDep1 = new Departamento("RH", "Recursos Humanos");
        Departamento objDep2 = new Departamento("VD", "Vendas");

        // Associação binária entre Funcionario e Departamento
        funcHor.setDepartamento(objDep2);
        System.out.println("Funcionário(a) " + funcHor.getNome() + " trabalha no departamento " + objDep2.getNome());

        funcMen.setDepartamento(objDep1);
        System.out.println("Funcionário(a) " + funcMen.getNome() + " trabalha no departamento " + objDep1.getNome());

        funcCom.setDepartamento(objDep2);
        System.out.println("Funcionário(a) " + funcCom.getNome() + " trabalha no departamento " + objDep2.getNome());

        // Associação binária entre Departamento e 1 ou mais Funcionarios
        objDep2.getFuncionarios().add(funcHor);
        objDep2.getFuncionarios().add(funcCom);
        objDep1.getFuncionarios().add(funcMen);

        System.out.println("\nDepartamento " + objDep1.getNome());
        System.out.println("Funcionários(as): " + objDep1.getFuncionarios());
        System.out.println("\nDepartamento " + objDep2.getNome());
        System.out.println("Funcionários(as): " + objDep2.getFuncionarios());
    }
}

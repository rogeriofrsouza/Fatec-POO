import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

public class Aplic {
    
    public static void main(String[] args) {
        FuncionarioHorista funcHor  = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/78", 15.80);
        funcHor.setCargo("Programador");
        
        FuncionarioMensalista funcMen  = new FuncionarioMensalista(2020, "Ana Beatriz", "22/07/88", 600);
        funcMen.setCargo("Aux. Administrativo");
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, "Joao Mendes", "10/12/1975", 10);
        funcCom.setCargo("Vendedor");
       
        Departamento objDep1 = new Departamento("RH", "Recursos Humanos");
        Departamento objDep2 = new Departamento("VD", "Vendas");
        
        Projeto objProj = new Projeto(1234, "Segurança no trabalho");
        objProj.setDtInicio("02/05/2023");
        objProj.setDtTermino("12/05/2023");
	  
        // Associação binária: Funcionario com Departamento
        funcHor.setDepartamento(objDep2);
        funcMen.setDepartamento(objDep1);
        funcCom.setDepartamento(objDep2);

        // Associação binária: Departamento com 1 ou mais (1..*) Funcionarios
        objDep2.getFuncionarios().add(funcHor);
        objDep2.getFuncionarios().add(funcCom);
        objDep1.getFuncionarios().add(funcMen);
        
        // Associação binária: Funcionario com Projeto
        funcHor.setProjeto(objProj);
        funcMen.setProjeto(objProj);
        funcCom.setProjeto(objProj);
        
        // Associação binária: Projeto com Funcionario
        objProj.addFuncionario(funcHor);
        objProj.addFuncionario(funcMen);
        objProj.addFuncionario(funcCom);
        
        System.out.println(objDep1);
        System.out.println("Funcionários:");
        objDep1.getFuncionarios().forEach(x -> System.out.println("  - " + x));
        
        System.out.println(objDep2);
        System.out.println("Funcionários:");
        objDep2.getFuncionarios().forEach(x -> System.out.println("  - " + x));
        
        
    }
}

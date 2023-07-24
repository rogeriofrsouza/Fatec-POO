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
       
        // Instanciação de objetos da classe Departamento
        Departamento objDep1 = new Departamento("RH", "Recursos Humanos");
        Departamento objDep2 = new Departamento("VD", "Vendas");
      
	    // Instanciação de um objeto da classe Projeto
        Projeto objPrj = new Projeto(1234, "Segurança no Trabalho");
        objPrj.setDtInicio("02/11/2023");
        objPrj.setDtTermino("25/11/2023");
       
        // Associação binária: Funcionario com Departamento
        funcHor.setDepartamento(objDep1);
        funcMen.setDepartamento(objDep1);
        funcCom.setDepartamento(objDep2);

        // Associação binária: Departamento com 1 ou mais (1..*) Funcionarios
        objDep1.addFuncionario(funcHor);
        objDep1.addFuncionario(funcMen);
        objDep2.addFuncionario(funcCom);

        objDep1.listarFuncionarios();
        objDep2.listarFuncionarios();
       
        // Associação binária: Funcionario com Projeto
        funcHor.setProjeto(objPrj);
        funcMen.setProjeto(objPrj);
        funcCom.setProjeto(objPrj);

        // Associação binária: Projeto com Funcionarios
        objPrj.addFuncionario(funcHor);
        objPrj.addFuncionario(funcMen);
        objPrj.addFuncionario(funcCom);
        objPrj.listarFuncionarios();
    }    
}

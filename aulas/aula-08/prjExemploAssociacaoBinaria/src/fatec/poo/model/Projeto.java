package fatec.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }
    
    public void addFuncionario(Funcionario func) {
        funcionarios.add(func);
    }
    
    public void listarFuncionario() {
        System.out.println("\nCódigo: ");
        System.out.println("Descrição: ");
        System.out.println("Data início: ");
        System.out.println("Data término: ");
        System.out.println("Registro\tNome\tCargo\tDepartamento");
        
        for (Funcionario func : funcionarios) {
            System.out.println(func.getRegistro() + func.getNome() + func.getCargo() + func.getDepartamento().getNome());
        }
    }
}

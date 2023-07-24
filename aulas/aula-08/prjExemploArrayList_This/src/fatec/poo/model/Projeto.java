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

    public String getDtTermino() {
        return dtTermino;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }
    
    public void addFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
    
    public void listarFuncionarios() {
        System.out.println("\nCódigo: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Data de início: " + dtInicio);
        System.out.println("Data de término: " + dtTermino);
        System.out.println("Qtde. funcionários: " + funcionarios.size());
        
        System.out.println("\nRegistro\t\tNome\t\t\tCargo\t\tDepartamento");
        funcionarios.forEach(x -> System.out.println(x.getRegistro() + "\t\t" + x.getNome() + "\t\t" + x.getCargo() + "\t\t" + x.getDepartamento().getNome()));
    }
}

package fatec.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    
    private String sigla;
    private String nome;

    private List<Funcionario> funcionarios = new ArrayList<>();
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() { 
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f) {
        funcionarios.add(f);
    }
    
    public void listarFuncionarios() {
        System.out.println("\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        funcionarios.forEach(x -> System.out.println(x.getRegistro() + "\t\t" + x.getNome() + "\t\t" + x.getCargo()));
        System.out.println("---------------------------------------------------");
    }
}

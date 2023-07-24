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

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    @Override
    public String toString() {
        return "\nSigla: " + sigla + "\nNome: " + nome;
    }
}

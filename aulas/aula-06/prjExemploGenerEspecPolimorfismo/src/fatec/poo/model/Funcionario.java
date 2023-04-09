package fatec.poo.model;

import java.time.LocalDate;

/**
 *
 * @author 0030482221007
 */
public abstract class Funcionario {

    private int registro;
    private String nome;
    private LocalDate dataAdmissao;
    private String cargo;

    public Funcionario(int registro, String nome, LocalDate dataAdmissao) {
        this.registro = registro;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
    }

    public int getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public abstract double calcSalBruto();
    
    public double calcDesconto() {
        return calcSalBruto() * 0.10;
    }
    
    public double calcSalLiquido() {
        return calcSalBruto() - calcDesconto();
    }
}

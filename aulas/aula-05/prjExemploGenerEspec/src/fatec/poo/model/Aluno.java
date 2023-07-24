package fatec.poo.model;

import java.time.LocalDate;

/**
 *
 * @author 0030482221007
 */
public class Aluno extends Pessoa {
    
    private int regEscolar;
    private double mensalidade;

    public Aluno(int regEscolar, String nome, LocalDate dataNascimento) {
        super(nome, dataNascimento);
        this.regEscolar = regEscolar;
    }

    public int getRegEscolar() {
        return regEscolar;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
    
}

package fatec.poo.model;

import java.time.LocalDate;

/**
 *
 * @author 0030482221007
 */
public class FuncionarioHorista extends Funcionario {
    
    private double valHoraTrab;
    private int qtdeHoraTrab;

    public FuncionarioHorista(int registro, String nome, LocalDate dataAdmissao, double valHoraTrab) {
        super(registro, nome, dataAdmissao);
        this.valHoraTrab = valHoraTrab;
    }

    public double getValHoraTrab() {
        return valHoraTrab;
    }

    public int getQtdeHoraTrab() {
        return qtdeHoraTrab;
    }

    public void setQtdeHoraTrab(int qtdeHoraTrab) {
        this.qtdeHoraTrab = qtdeHoraTrab;
    }

    @Override
    public double calcSalBruto() {
        return valHoraTrab * qtdeHoraTrab;
    }
    
    public double calcGratificacao() {
        return calcSalBruto() * 0.075;
    }
    
    @Override
    public double calcSalLiquido() {
        return super.calcSalLiquido() + calcGratificacao();
    }
}

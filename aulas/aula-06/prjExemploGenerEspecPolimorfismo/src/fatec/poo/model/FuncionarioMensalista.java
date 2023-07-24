package fatec.poo.model;

import java.time.LocalDate;

/**
 *
 * @author 0030482221007
 */
public class FuncionarioMensalista extends Funcionario {
    
    private double valSalMinimo;
    private double numSalMinimo;

    public FuncionarioMensalista(int registro, String nome, LocalDate dataAdmissao, double valSalMinimo) {
        super(registro, nome, dataAdmissao);
        this.valSalMinimo = valSalMinimo;
    }

    public double getValSalMinimo() {
        return valSalMinimo;
    }

    public double getNumSalMinimo() {
        return numSalMinimo;
    }

    public void setNumSalMinimo(double numSalMinimo) {
        this.numSalMinimo = numSalMinimo;
    }
    
    @Override
    public double calcSalBruto() {
        return valSalMinimo * numSalMinimo;
    }
}

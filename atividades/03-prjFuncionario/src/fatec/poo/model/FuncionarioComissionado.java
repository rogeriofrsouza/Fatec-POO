package fatec.poo.model;

import java.time.LocalDate;

/**
 *
 * @author 0030482221007
 */
public class FuncionarioComissionado extends Funcionario {

    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, LocalDate dataAdmissao, double taxaComissao) {
        super(registro, nome, dataAdmissao);
        this.taxaComissao = taxaComissao;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getTaxaComissao() {
        return taxaComissao;
    }
    
    public double getTotalVendas() {
        return totalVendas;
    }
    
    public void addVendas(double valor) {
        totalVendas += valor;
    }
    
    @Override
    public double calcSalBruto() {
        return salBase + taxaComissao / 100.0 * totalVendas;
    }
    
    public double calcGratificacao() {
        double gratificacao;
        
        if (totalVendas <= 5000.0) {
            gratificacao = 0.0;
        } else if (totalVendas <= 10000.0) {
            gratificacao = 0.03;
        } else {
            gratificacao = 0.05;
        }
        
        return gratificacao * calcSalBruto();
    }
    
    @Override
    public double calcSalLiquido() {
        return super.calcSalLiquido() + calcGratificacao();
    }
}

package fatec.poo.model;

public class FuncionarioComissionado extends Funcionario {
    
    private double salBase;
    private double taxaComissao;
    private double totalVendas;

    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, double taxaComissao) {
        super(registro, nome, dtAdmissao);
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
    
    public void addVendas(double vendas) {
        totalVendas += vendas;
    }
    
    // Aplicando polomorfismo
    @Override
    public double calcSalBruto() {
        return salBase + (taxaComissao / 100.0 * totalVendas); 
    }
    
    public double calcGratificacao() {
        if (totalVendas <= 5000.0) {
            return 0.0;
        } else if (totalVendas <= 10000.0) {
            return calcSalBruto() * 0.03;
        }
        else {
            return calcSalBruto() * 0.05;
        }
    }
    
    // Aplicando polomorfismo
    @Override
    public double calcSalLiquido() {
        return super.calcSalLiquido() + calcGratificacao();
    }
}

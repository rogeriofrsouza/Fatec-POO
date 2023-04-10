package fatec.poo.model;

/**
 *
 * @author 0030482221007
 */
public abstract class Pessoa {

    private String nome;
    private int anoInscricao;
    private double totalCompras;

    public Pessoa(String nome, int anoInscricao) {
        this.nome = nome;
        this.anoInscricao = anoInscricao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
    public void addCompras(double valor) {
        totalCompras += valor;
    }
    
    public abstract double calcBonus(int anoAtual);
}

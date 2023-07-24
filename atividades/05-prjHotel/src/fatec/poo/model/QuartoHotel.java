package fatec.poo.model;

/**
 *
 * @author 0030482221007
 */
public class QuartoHotel {
    
    private int numQuarto;
    private double valorDiaria;
    private int numRG;
    private boolean situacao;  // false – Livre true – Ocupado
    private double totalFaturado;

    public QuartoHotel(int numQuarto, double valorDiaria) {
        this.numQuarto = numQuarto;
        this.valorDiaria = valorDiaria;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public double getTotalFaturado() {
        return totalFaturado;
    }
    
    public void reservar(int numRG) {
        this.numRG = numRG;
        situacao = true;
    }
    
    public double liberar(int dias) {
        double pagamento = valorDiaria * dias;
        totalFaturado += pagamento;
        numRG = 0;
        situacao = false;
        
        return pagamento;
    }
}

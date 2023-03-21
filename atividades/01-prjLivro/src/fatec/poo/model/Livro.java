package fatec.poo.model;

/**
 *
 * @author 0030482221007
 */
public class Livro {
    
    private int id;
    private boolean situacao;
    private double valMultaDiaria;

    public Livro() {
    }

    public Livro(int id, boolean situacao, double valMultaDiaria) {
        this.id = id;
        this.situacao = situacao;
        this.valMultaDiaria = valMultaDiaria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public double getValMultaDiaria() {
        return valMultaDiaria;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }

    @Override
    public String toString() {
        return id + ", " + situacao + ", R$" + String.format("%.2f", valMultaDiaria);
    }
    
    public void emprestar() {
        situacao = true;
    }
    
    public double devolver(int diasEmAtraso) {
        situacao = false;
        
        if (diasEmAtraso > 0) {
            return valMultaDiaria * diasEmAtraso;
        }
        
        return 0.0;
    }
}

package fatec.poo.model;

/**
 *
 * @author 0030482221007
 */
public class Circulo {
    
    private double raio;
    private String unidadeMedida;

    public Circulo(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    public double calcArea() {
        return Math.PI * Math.pow(raio, 2.0);
    }
    
    public double calcPerimetro() {
        return 2.0 * Math.PI * raio;
    }
    
    public double calcDiametro() {
        return raio * 2.0;
    }
}

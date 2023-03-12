package fatec.poo.model;

/**
 *
 * @author 0030482221007
 */
public class Circulo {
    
    private double raio;

    public Circulo() {
    }
    
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
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

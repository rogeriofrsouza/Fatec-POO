package fatec.poo.model;

/**
 *
 * @author 0030482221007
 */
public class Retangulo {
    
    private double altura;
    private double base;
    private String unidadeMedida;
        
    //Definição do método construtor
    public Retangulo(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    public double getAltura() {
        return(altura);
    }
    
    public void setAltura(double a) {
        altura = a;
    }
    
    public double getBase() {
        return(base);
    }
    
    public void setBase(double b){
        base = b;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }
    
    public double calcArea() {
        return base * altura;
    }
    
    public double calcPerimetro() {
        return 2 * (base + altura);
    }
    
    public double calcDiagonal() {
        return Math.sqrt(Math.pow(altura, 2.0) + Math.pow(base, 2.0));
    }
}

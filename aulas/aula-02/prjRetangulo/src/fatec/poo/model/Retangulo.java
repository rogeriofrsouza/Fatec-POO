package fatec.poo.model;

/**
 *
 * @author 0030482221007
 */
public class Retangulo {
    private double altura;
    private double base;
    
//    public Retangulo() {
//    }
//    
//    public Retangulo(double altura, double base) {
//        this.altura = altura;
//        this.base = base;
//    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getBase() {
        return base;
    }
    
    public void setBase(double base) {
        this.base = base;
    }
    
    public double calcArea() {
        return altura * base;
    }
    
    public double calcPerimetro() {
        return 2 * (altura + base);
    }

    public double calcDiagonal() {
        return Math.sqrt(Math.pow(altura, 2.0) + Math.pow(base, 2.0));
    }
}

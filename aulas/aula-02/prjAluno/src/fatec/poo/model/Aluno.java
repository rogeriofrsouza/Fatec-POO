package fatec.poo.model;

/**
 *
 * @author 0030482221007
 */
public class Aluno {
    
    private int RA;
    private double notaProva1;
    private double notaProva2;
    private double notaTrab1;
    private double notaTrab2;

    public Aluno() {
    }
    
    public Aluno(int RA, double notaProva1, double notaProva2, double notaTrab1, double notaTrab2) {
        this.RA = RA;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrab1 = notaTrab1;
        this.notaTrab2 = notaTrab2;
    }

    public int getRA() {
        return RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getNotaTrab1() {
        return notaTrab1;
    }

    public void setNotaTrab1(double notaTrab1) {
        this.notaTrab1 = notaTrab1;
    }

    public double getNotaTrab2() {
        return notaTrab2;
    }

    public void setNotaTrab2(double notaTrab2) {
        this.notaTrab2 = notaTrab2;
    }
    
    public double calcMediaProva() {
        return 0.75 * (notaProva1 + 2.0 * notaProva2) / 3.0;
    }
    
    public double calcMediaTrab() {
        return 0.25 * (notaTrab1 + notaTrab2) / 2.0;
    }
    
    public double calcMediaFinal() {
        return calcMediaProva() + calcMediaTrab();
    }
}

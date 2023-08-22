package Vettori;

public class Punto {

    public double x, y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    public double calcolaDistanza(Punto altro){
        return Math.sqrt(Math.pow((altro.x - this.x), 2) + Math.pow((altro.y - this.y), 2));
    }

}

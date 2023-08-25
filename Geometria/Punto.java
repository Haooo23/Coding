package Geometria;

import java.util.StringTokenizer;

public class Punto {
    private double x,y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    public Punto(String values) {
        StringTokenizer tokenizer = new StringTokenizer(values, ";");

        this.x = Double.parseDouble(tokenizer.nextToken());
        this.y = Double.parseDouble(tokenizer.nextToken());
    }

    public double calcolaDistanza(Punto altro){
        return Math.sqrt(Math.pow((altro.x - this.x), 2) + Math.pow((altro.y - this.y), 2));
    }

    @Override
    public String toString(){
        return x + ";" + y;
    }
}

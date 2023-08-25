package Geometria;

import java.util.Random;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Vector <Punto> vertici1 = new Vector<>();
        for (int index = 0; index < 4; index++) {
            vertici1.add(new Punto(1 + new Random().nextInt(10), 1 + new Random().nextInt(10)));
        }

        Vector <Punto> vertici2 = new Vector<>();
        for (int index = 0; index < 6; index++) {
            vertici2.add(new Punto(1 + new Random().nextInt(10), 1 + new Random().nextInt(10)));
        }
        
        Poligono poligono1 = new Poligono(vertici1);
        Poligono poligono2 = new Poligono(vertici2);

        System.out.println("pol1 " + poligono1.perimetro());
        System.out.println("pol2 " + poligono2.perimetro());

        int conf = poligono1.confrontoPoligono(poligono2);
        if (conf > 0 ) {
            System.out.println("Pol 1 maggiore");
        } else if(conf < 0) {
            System.out.println("Pol 1 minre");
        } else {
            System.out.println("Ugu");
        }
    }
}
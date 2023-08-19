package AlberoNumeri;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Nodo start = new Nodo(20);
        Albero albero = new Albero(start);
        
        for (int i = 0; i < 10; i++) {
            Nodo nodo = new Nodo(random.nextInt(100));
            albero.inputNodo(nodo);
        }
        albero.viewTree(albero.radice);
    }
}

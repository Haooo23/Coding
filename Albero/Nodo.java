package Albero;

import java.io.Serializable;

class Nodo implements Serializable {
    String valore;
    Nodo sinistro;
    Nodo destro;

    public Nodo(String valore) {
        this.valore = valore;
        this.sinistro = null;
        this.destro = null;
    }
}

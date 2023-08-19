package SalvaOrdini;

import java.io.*;
import java.util.Vector;

public class Bar {

    private static Vector<Ordine> listaOrdini = new Vector<>();
    private static File file = new File("ListaOrdini");

    public static void addOrdine(Cliente cliente, String panino) {
        Ordine ordine = new Ordine(cliente,panino);
        listaOrdini.add(ordine);

        try {
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(ordine);
            objectOut.close();
        } catch (Exception e) {}
    }

    public void readOrdini(){
        for (int i = 0; i < listaOrdini.size(); i++) {
            System.out.println("Ordine[" + (i+1) + "] : " + listaOrdini);
        }
    }

    public static void main(String[] args) {
        addOrdine(null, null);
    }

}

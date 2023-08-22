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

    public static void readOrdini(){
        for (int i = 0; i < listaOrdini.size(); i++) {
            System.out.println("Ordine[" + (i+1) + "] : " + listaOrdini.get(i));
        }
    }
    
    public static void main(String[] args) {
        Cliente dio = new Cliente("dio");
        Cliente cane = new Cliente("dio");
        Cliente porco = new Cliente("dio");
        addOrdine(cane,"dio" );
        addOrdine(porco,"dio" );
        addOrdine(dio,"dio" );
        readOrdini();
    }

}

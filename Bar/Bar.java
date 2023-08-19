package Bar;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Bar {
    
    private Vector<Scontrino> codaOrdini = new Vector<>();

    public void ordine(Cliente cliente, String panino){
        Scontrino scontrino = new Scontrino(cliente, panino, codaOrdini.size() + 1);
        codaOrdini.add(scontrino);

        try {

            FileOutputStream fileOut = new FileOutputStream("Scontrino" + scontrino.getId());
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(scontrino);
            objectOut.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ritiraOrdine(int scontrinoId){
        Scontrino scontrino = codaOrdini.get(scontrinoId);
        System.out.println("nome panino: " + scontrino.getPanino());
    }




}

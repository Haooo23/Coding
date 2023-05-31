package Albero;
import java.io.*;
import java.util.*;

class Dizionario implements Serializable {
    Nodo radice;

    public Dizionario() {
        this.radice = null;
    }

    public void inserisci(String parola) {
        this.radice = inserisciRicorsivo(radice, parola);
    }

    private Nodo inserisciRicorsivo(Nodo corrente, String parola) {
        if (corrente == null) {
            return new Nodo(parola);
        }

        if (parola.compareToIgnoreCase(corrente.valore) < 0) {
            corrente.sinistro = inserisciRicorsivo(corrente.sinistro, parola);
        } else if (parola.compareToIgnoreCase(corrente.valore) > 0) {
            corrente.destro = inserisciRicorsivo(corrente.destro, parola);
        }

        return corrente;
    }

    public boolean ricerca(String parola) {
        return ricercaRicorsiva(radice, parola);
    }

    private boolean ricercaRicorsiva(Nodo corrente, String parola) {
        if (corrente == null) {
            return false;
        }

        if (parola.compareToIgnoreCase(corrente.valore) == 0) {
            return true;
        }

        if (parola.compareToIgnoreCase(corrente.valore) < 0) {
            return ricercaRicorsiva(corrente.sinistro, parola);
        } else {
            return ricercaRicorsiva(corrente.destro, parola);
        }
    }

    public List<String> tutteLeParole() {
        List<String> parole = new ArrayList<>();
        visitaInOrdine(radice, parole);
        return parole;
    }

    private void visitaInOrdine(Nodo corrente, List<String> parole) {
        if (corrente != null) {
            visitaInOrdine(corrente.sinistro, parole);
            parole.add(corrente.valore);
            visitaInOrdine(corrente.destro, parole);
        }
    }

    public void salvaSuFile(String nomeFile) {
        try (FileOutputStream fileOut = new FileOutputStream(nomeFile);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(radice);
            System.out.println("L'albero è stato salvato correttamente in " + nomeFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void caricaDaFile(String nomeFile) {
        try (FileInputStream fileIn = new FileInputStream(nomeFile);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            radice = (Nodo) objectIn.readObject();
            System.out.println("L'albero è stato caricato correttamente da " + nomeFile);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


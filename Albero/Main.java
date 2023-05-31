package Albero;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dizionario dizionario = new Dizionario();

        // Inserimento di parole
        dizionario.inserisci("casa");
        dizionario.inserisci("cane");
        dizionario.inserisci("gatto");
        dizionario.inserisci("albero");

        // Ricerca di una parola
        System.out.println(dizionario.ricerca("cane")); // Output: true
        System.out.println(dizionario.ricerca("auto")); // Output: false

        // Visualizzazione di tutte le parole in ordine alfabetico
        List<String> tutteLeParole = dizionario.tutteLeParole();
        for (String parola : tutteLeParole) {
            System.out.println(parola);
        }

        // Salvataggio dell'albero su file
        dizionario.salvaSuFile("dizionario.dat");

        // Lettura dell'albero da file
        Dizionario dizionarioCaricato = new Dizionario();
        dizionarioCaricato.caricaDaFile("dizionario.dat");
    }
}

package Universita;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main {
    
    private static InputStreamReader in = new InputStreamReader(System.in);
	private static BufferedReader key = new BufferedReader(in);
    private static Vector<Studente> studenti;

    private static Studente inputStudenteCorso(){
        String nome, cognome;
        int immatricolazione; 
        int day, month, year;
        Data iscrizione = null;
        Studente studente = null;

        try {
            
            System.out.println("Inserisci il giorno dell'iscrizione dello studente: ");
            System.out.println("Inserisc il giorno dell'iscrizione dello studente: ");
            day = Integer.parseInt(key.readLine());
            System.out.println("Inserisci il mese dell'iscrizione dello studente: ");
            month = Integer.parseInt(key.readLine());  
            System.out.println("Inserisci l'anno dell'iscrizione dello studente: ");
            year = Integer.parseInt(key.readLine());
            
            Data registrationDate = new Data(day, month, year);  
            if (registrationDate.isTwoYearsAgo()) {
                System.out.println("L'iscrizione è stata fatta esattamente 2 anni fa.");
                
                System.out.println("Inserisci il nome dello studente: ");
                nome = key.readLine();
                System.out.println("Inserisci il cognome dello studente: ");
                cognome = key.readLine();
                System.out.println("Inserisci l'immatricolazione dello studente: ");
                immatricolazione = Integer.parseInt(key.readLine()); 
    
                iscrizione = new Data(day, month, year);
                studente = new Studente(nome, cognome, immatricolazione, iscrizione);

            } else {
                System.out.println("L'iscrizione non è stata fatta esattamente 2 anni fa.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return studente;
    }


    public static void studentiCorso(){
    System.out.println("Studenti iscritti al corso: ");
    for (int i = 0; i < studenti.size(); i++) {
        System.out.printf("Nome: " + studenti.elementAt(i).getNome() + " /nCognome: " +  studenti.elementAt(i).getCognome() + " /nImmatricolazione: " + studenti.elementAt(i).getMatricola() + "/nData d'iscrizione: " + studenti.elementAt(i).getDataIscrizione());
        }
    }



    public static void main(String[] args) {
        int selection;
        studenti = new Vector<>();

        try {
            do {
                System.out.println("\n\n\n\n\n\n\n\n\nREGISTRO");
                System.out.println("[1]Inserisci lo studente nel corso");
                System.out.println("[2]Studenti iscritti al corso");
                System.out.println("[3]");
                System.out.println("[4]");
                System.out.println("[0]Chiudi");
                System.out.print("Seleziona: ");

                selection = Integer.parseInt(key.readLine());

                switch (selection) {
                    case 1:
                        Studente studente = inputStudenteCorso();
                        studenti.add(studente);
                        break;

                    case 2:
                        studentiCorso();
                        break;
                }
            } while (selection != 0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

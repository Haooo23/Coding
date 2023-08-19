package RegistroVoti;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class Main {

    private static InputStreamReader in = new InputStreamReader(System.in);
	private static BufferedReader key = new BufferedReader(in);
    private static Vector<Studente> studenti;
    
    private static Studente inputStudente(){
        String nome, cognome, eta;

        Studente studente = null;
        try {
            System.out.println("Nome dello studente: ");
            nome = key.readLine();
            System.out.println("Cognome dello studente: ");
            cognome = key.readLine();
            System.out.println("Eta dello studente: ");
            eta = key.readLine();
            
            studente = new Studente(nome, cognome, eta);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return studente;
    }

    private static void printIndiceStudente() {
        for (int i = 0; i < studenti.size(); i++) {
            System.out.println("Studente [" + (i + 1) + "]: " + studenti.get(i).getNome() + " " + studenti.get(i).getCognome());
        }
    }


    public static void main(String[] args) {
        int selection, indexStudente;
        double valore;
        String materia;
        Voto voto;
        studenti = new Vector<>();

        try {
            do {
                System.out.println("\n\n\n\n\n\n\n\n\nREGISTRO");
                System.out.println("[1]Inserisci lo studente");
                System.out.println("[2]Media di una materia");
                System.out.println("[3]Media generale");
                System.out.println("[4]Salva voto");
                System.out.println("[0]Chiudi");
                System.out.print("Seleziona: ");

                selection = Integer.parseInt(key.readLine());

                switch (selection) {
                    case 1:

                        Studente studente = inputStudente();
                        studenti.add(studente);

                        break;

                    case 2:
                        printIndiceStudente();

                        System.out.print("Inserisci l'indice dello studente: ");
                        indexStudente = Integer.parseInt(key.readLine());
                        System.out.print("Inserisci la materia da calcolare: ");
                        materia = key.readLine();

                        System.out.println("Media " + materia + " dello studente: " + studenti.get(indexStudente - 1).mediaMateria(materia));
                        break;

                    case 3:
                        printIndiceStudente();

                        System.out.print("Inserisci l'indice dello studente: ");
                        indexStudente = Integer.parseInt(key.readLine());

                        System.out.println("Media generale dello studente: " + studenti.get(indexStudente - 1).mediaGenerale());
                        break;
                    case 4:
                        printIndiceStudente();

                        System.out.print("Inserisci l'indice dello studente: ");
                        indexStudente = Integer.parseInt(key.readLine());
                        System.out.print("Inserisci il valore del voto: ");
                        valore = Double.parseDouble(key.readLine());
                        System.out.print("Inserisci la materia del voto: ");
                        materia = key.readLine();

                        voto = new Voto(valore, materia);
                        studenti.get(indexStudente - 1).addVoto(voto);
                }
            } while (selection != 0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

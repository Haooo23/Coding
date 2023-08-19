package ArchivioUtente;

import java.io.*;
import java.util.Vector;


public class Main {

    public static InputStreamReader isr = new InputStreamReader(System.in);
    public static BufferedReader br = new BufferedReader(isr);
    public static Vector <Utente> listaUtenti = new Vector<>();
    
    public static void inputUtente(){
        Utente utente;
        String nome;
        String cognome;

        try {
            System.out.println("Inserisci Utente: ");
            System.out.println("Inserisci il nome dell'utente: ");
            nome = br.readLine();
            System.out.println("Inserisci il cognome dell'utente: ");
            cognome = br.readLine();

            utente = new Utente(nome,cognome);
            listaUtenti.add(utente);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void outputListaUtente(){
        for (int i = 0; i < listaUtenti.size(); i++) {
            System.out.println("Utente[" + (i + 1) + "]: " + listaUtenti.get(i));
        }
    }

    public static void disactiveUser(){
        try {
            outputListaUtente();
            System.out.println("Inserisci indice utente: ");
            int value = Integer.parseInt(br.readLine());

            listaUtenti.get(value-1).disactiveUser();
        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void viewActiveUser(){
        for (int i = 0; i < listaUtenti.size(); i++) {
            if(listaUtenti.get(i).isActive()){
                System.out.println("Utente[" + (i + 1) + "]: " + listaUtenti.get(i));
            }
        }
    }

    public static void viewDisactiveUser(){
        for (int i = 0; i < listaUtenti.size(); i++) {
                if(!listaUtenti.get(i).isActive()){
                    System.out.println("Utente[" + (i + 1) + "]: " + listaUtenti.get(i));
                }
            }
    }

    public static void main(String[] args) {
        int selection;

        try {
            do {
                System.out.println("\n\n\n\n\n\n\n\nArchivio");
                System.out.println("[1]Inserisci Utente ");
                System.out.println("[2]Visualizzare tutti gli utenti");
                System.out.println("[3]Visualizzare tutti gli utenti Attivi");
                System.out.println("[4]Visualizzare tutti gli utenti non Attivi");
                System.out.println("[5]Disattivare un utente");
                System.out.println("[0]Exit");
                System.out.print("Seleziona: ");

                selection = Integer.parseInt(br.readLine());

                switch (selection) {
                    case 1:
                        inputUtente();
                        break;

                    case 2:
                        outputListaUtente();
                        break;
                    case 3:
                        viewActiveUser();
                    break;
                    case 4:
                        viewDisactiveUser();
                    break;
                    case 5:
                        disactiveUser();
                    break;
                }
            } while (selection != 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





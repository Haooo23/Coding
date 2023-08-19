package RegistroVoti;

import java.util.Vector;

public class Studente {

    private String nome;
    private String cognome;
    private String eta;
    private Vector<Voto> voti = new Vector<>();
    
    public Studente(String nome, String cognome, String eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public void addVoto(Voto voto) {
        voti.add(voto);
    }

    public double mediaGenerale() {
        double somma = 0;
        for (int i = 0; i < voti.size(); i++) {
            somma += voti.elementAt(i).getVoto();
        }

        return somma / voti.size();
    }

    public double mediaMateria(String materia) {
        double somma = 0;
        double counter = 0;
        for (int i = 0; i < voti.size(); i++) {
            if (voti.elementAt(i).getMateria().equalsIgnoreCase(materia)) {
                counter++;
                somma += voti.elementAt(i).getVoto();
            }
        }
        return somma / counter;
    }

    public String getCognome() {
        return cognome; 
    }

    public String getNome() {
        return nome;
    }

    public String getEta() {
        return eta;
    }

    public Vector<Voto> getVoti() {
        return voti;
    }
}

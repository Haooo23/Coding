package Universita;

import java.util.Vector;

public class Studente {
    private String nome;
    private String cognome;
    private int matricola;
    Data dataIscrizione;
    Vector<Studente> students;

    public Studente(String nome, String cognome, int matricola, Data dataIscrizione) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.dataIscrizione = dataIscrizione;
    }


    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
    
        public int getMatricola() {
            return matricola;
        }

    public Data getDataIscrizione() {
        return dataIscrizione;
    }

    public Vector<Studente> getStudents() {
        return students;
    }

}

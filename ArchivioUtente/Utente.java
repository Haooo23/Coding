package ArchivioUtente;

public class Utente {
    private String nome;
    private String cognome;
    private boolean active = true;
    

    public Utente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public void disactiveUser(){
        active = false;
    }

    public String getNome() {
        return nome;
    }
    
    public String getCognome() {
        return cognome;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + " status: " + active;
    }
    

    
}

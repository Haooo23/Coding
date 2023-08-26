package EserciziRecupero.Esercizio11;

public class Telescopio {
    
    private Persone persona = null;

    public synchronized void entra(Persone persona){
        while(this.persona != null){
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        this.persona = persona;
        this.persona.setStatus("In Osservazione");
        System.out.println("Persona[" + this.persona.getIdpersona() + "]: " + this.persona.getStatus());
        
        notifyAll();
    }

    public synchronized void esci(){
        while(this.persona == null){
            try {
                wait();     
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        this.persona.setStatus("Finito");
        System.out.println("Persona[" + this.persona.getIdpersona() + "]: " + this.persona.getStatus());
        this.persona = null;

        notifyAll();
    }
}

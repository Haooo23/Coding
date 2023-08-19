package Bar;

public class Scontrino {
    
    private Cliente cliente;
    private String panino;
    private int id;

    public Scontrino(Cliente cliente, String panino, int id){
        this.cliente = cliente;
        this.panino = panino;
        this.id = id;
    }

    public String getPanino() {
        return panino;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getId() {
        return id;
    }

}

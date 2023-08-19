package SalvaOrdini;

public class Ordine {
    private Cliente cliente;
    private String panino;

    public Ordine(Cliente cliente,String panino){
        this.cliente = cliente;
        this.panino = panino;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getPanino() {
        return panino;
    }

}

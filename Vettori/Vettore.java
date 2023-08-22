package Vettori;

public class Vettore {
    private Punto origine;
    private Punto altro;

    public Vettore(Punto origine, Punto altro){
        this.origine = origine;
        this.altro = altro;
    }

    public double getLunghezza(){
        return origine.calcolaDistanza(altro);
    }

    public double getAltezza(){
        return (altro.y - origine.y);
    }

    public double getBase(){
        return (altro.x - origine.x);
    }

    public Vettore somma(Vettore v){
        double base;
        double altezza;
        base = (v.getBase() + getBase());
        altezza = (v.getAltezza() + getAltezza());
        
        return new Vettore(origine,new Punto(origine.x + base, origine.y + altezza));
    
    }

    public int confrontoVettore(Vettore v){
        if(v.getLunghezza() > getLunghezza()){
            return 1;
        }else if(v.getAltezza() < getAltezza()){
            return -1;
        } else{
            return 0;
        }
    }

}


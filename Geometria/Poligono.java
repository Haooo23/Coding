package Geometria;

import java.io.*;
import java.util.Vector;

public class Poligono {
    private Vector<Punto> vertici;

    public Poligono(Vector<Punto> vertici){
        this.vertici = vertici;
    }

    public Poligono(){
        this.vertici = new Vector<>();
    }

    public Poligono(File file){
        this.vertici = readFile(file);
    }

    public void addVertice(Punto punto){
        vertici.add(punto);
        System.out.println(vertici);
    }

    public double perimetro(){
        double perimetro = 0;
        for (int i = 0; i < vertici.size() - 1; i++) {
            double var = vertici.elementAt(i).calcolaDistanza(vertici.elementAt(i+1));
            perimetro += var;
        }
        return perimetro;
    }

    public int confrontoPoligono(Poligono poligono){
        if(this.perimetro() > poligono.perimetro()){
            return 1;
        }else if(this.perimetro() < poligono.perimetro()){
            return -1;
        }else{
            return 0;
        }
    }

    public void salvaPoligono(){
        try {
            File file = new File("Poligono.txt");
            FileWriter fw = new FileWriter(file);
            
            for (int i = 0; i < vertici.size(); i++) {
                fw.write(vertici.elementAt(i).toString() + "\n");
            }
            fw.close();
        } catch (Exception e) {
        }
    }
        
    public Vector<Punto> readFile(File file){
        Vector<Punto> vertici = new Vector<>();

        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while(line != null){
                vertici.add(new Punto(line));
                line = br.readLine();
            }
            br.close();
        } catch (Exception e) { }

        return vertici;
    }

}



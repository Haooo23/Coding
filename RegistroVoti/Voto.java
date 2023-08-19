package RegistroVoti;

public class Voto {
    private double voto;
    private String materia;

	public Voto(double voto, String materia) {
		this.voto = voto;
		this.materia = materia;
	}

    public double getVoto() {
        return voto;
    }

    public String getMateria() {
        return materia;
    }
}

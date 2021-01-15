package modelos;

import modelos.enums.TipoCursada;

public class Profesor extends Persona {
    private int codProfesor;
    private TipoCursada cursada;

    public Profesor(String nombre, String apellido, int dni, int codProfesor, TipoCursada cursada) {
        super(nombre, apellido, dni);
        this.codProfesor = codProfesor;
        this.cursada = cursada;
    }

    public int getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(int codProfesor) {
        this.codProfesor = codProfesor;
    }

    public TipoCursada getCursada() {
        return cursada;
    }

    public void setCursada(TipoCursada cursada) {
        this.cursada = cursada;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "codProfesor=" + codProfesor +
                ", cursada=" + cursada.name() +
                '}';
    }
}


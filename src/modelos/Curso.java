package modelos;

import com.sun.scenario.effect.impl.prism.PrImage;
import modelos.enums.TipoCursada;
import modelos.enums.TipoCurso;

public class Curso {
    private TipoCursada tipoCursada;
    private Profesor profesor;
    private Alumnas alumnas;

    public Curso(TipoCursada tipoCursada, Profesor profesor, Alumnas alumnas) {

        this.tipoCursada = tipoCursada;
        this.profesor = profesor;
        this.alumnas = alumnas;
    }


    public TipoCursada getTipoCursada() {
        return tipoCursada;
    }

    public void setTipoCursada(TipoCursada tipoCursada) {
        this.tipoCursada = tipoCursada;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Alumnas getAlumnas() {
        return alumnas;
    }

    public void setAlumnas(Alumnas alumnas) {
        this.alumnas = alumnas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                ", tipoCursada=" + tipoCursada.name() +
                ", profesor=" + profesor +
                ", alumnas=" + alumnas +
                '}';
    }
}
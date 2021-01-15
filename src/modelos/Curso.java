package modelos;

import modelos.enums.TipoCurso;

public class Curso {
    private TipoCurso tipoCurso;
    private Profesor profesor;
    private Alumnas alumnas;

    public Curso(TipoCurso tipoCurso, Profesor profesor, Alumnas alumnas) {
        this.tipoCurso = tipoCurso;
        this.profesor = profesor;
        this.alumnas = alumnas;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
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
                "tipoCurso=" + tipoCurso.name() +
                ", profesor=" + profesor +
                ", alumnas=" + alumnas +
                '}';
    }
}

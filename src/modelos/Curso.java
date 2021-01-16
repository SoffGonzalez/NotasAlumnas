package modelos;

import modelos.enums.TipoCurso;

import java.util.List;

public class Curso {
    private TipoCurso tipoCurso;
    private List<Profesor> profesors;
    private List <Alumnas> alumnas;

    public Curso(TipoCurso tipoCurso, List<Profesor> profesors, List<Alumnas> alumnas) {
        this.tipoCurso = tipoCurso;
        this.alumnas = alumnas;
        this.profesors = profesors;
    }

    public List<Alumnas> getAlumnas() {
        return alumnas;
    }

    public void setAlumnas(List<Alumnas> alumnas) {
        this.alumnas = alumnas;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public List<Profesor> getProfesors() {
        return profesors;
    }

    public void setProfesors(List<Profesor> profesors) {
        this.profesors = profesors;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "tipoCurso=" + tipoCurso.name() +
                ", profesor=" + profesors +
                ", alumnas=" + alumnas +
                '}';
    }
}

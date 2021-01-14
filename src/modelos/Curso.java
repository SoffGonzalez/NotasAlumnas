package modelos;

import modelos.enums.TipoCurso;

public class Curso {
    private TipoCurso tipoCurso;

    public Curso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "tipoCurso=" + tipoCurso.name() +
                '}';
    }
}

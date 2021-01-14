package modelos;

import modelos.enums.TipoCurso;

public class Alumnas extends  Persona {

    private Notas Notas;
    private TipoCurso tipoCurso;

    public Alumnas(String nombre, String apellido, int dni, modelos.Notas notas, TipoCurso tipoCurso) {
        super(nombre, apellido, dni);
        Notas = notas;
        this.tipoCurso = tipoCurso;
    }

    public modelos.Notas getNotas() {
        return Notas;
    }

    public void setNotas(modelos.Notas notas) {
        Notas = notas;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }

    @Override
    public String toString() {
        return "Alumnx{" +
                "nombre= '" + getNombre() + //acà  la barra invertida ubica los datos uno debajo del otro
                "' apellido= '" + getApellido() +
                "' curso= '" + tipoCurso.name() +
                "' Notas= " + Notas +
                "' dni= " + getDni() +
                '}';
    }

    public double CalcularNotaFinal (){
        Notas notas;
        Double NotaFinal;
        notas = getNotas();
        NotaFinal = notas.getNota1()*0.1 + notas.getNota2()*0.2 + notas.getNota3()*0.3 + notas.getNota4()*0.4 ;
        return NotaFinal;
    }
}

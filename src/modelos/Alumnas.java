package modelos;

import modelos.enums.TipoCurso;

import java.util.ArrayList;
import java.util.List;

public class Alumnas extends  Persona {

    private Notas Notas;
    private double notaFinal;


    public Alumnas(String nombre, String apellido, int dni, modelos.Notas notas) {
        super(nombre, apellido, dni);
        Notas = notas;
    }

    public modelos.Notas getNotas() {
        return Notas;
    }

    public void setNotas(modelos.Notas notas) {
        Notas = notas;
    }

    @Override
    public String toString() {
        return "Alumnas{" +
                "Notas=" + Notas +
                '}';
    }

    public double CalcularNotaFinal (){
        Notas notas;
        Double NotaFinal;
        notas = getNotas();
        NotaFinal = notas.getNota1()*0.1 + notas.getNota2()*0.2 + notas.getNota3()*0.3 + notas.getNota4()*0.4 ;
        return NotaFinal;
    }

    public double AlumnasAprobadas() {
        List<Alumnas> alumnas = new ArrayList<>();

        for (Alumnas alumnaiteradora : alumnas) {
            notaFinal = alumnaiteradora.CalcularNotaFinal();
            if (notaFinal >= 4.0) {
                System.out.println(" Las alumnas aprobadas son " + alumnaiteradora.getNombre() + " " + alumnaiteradora.getApellido() + " con " + notaFinal);
            } else {
                System.out.println("Las alumnas reprobadas son " + alumnaiteradora.getNombre() + " " + alumnaiteradora.getApellido() + " con " + notaFinal);
            }
        }
        return notaFinal;
    }
}

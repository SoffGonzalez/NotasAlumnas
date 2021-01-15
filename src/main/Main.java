package main;

import interfaces.IPoblarClases;
import interfaces.implementacion.PoblarClasesImpl;
import modelos.Alumnas;
import modelos.Curso;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        double notaFinal;

        IPoblarClases poblarClases = new PoblarClasesImpl();

        List <Alumnas> alumnas = poblarClases.CrearAlumnas();
        System.out.println(alumnas);

        for (Alumnas alumnaiteradora : alumnas) {
            notaFinal = alumnaiteradora.CalcularNotaFinal();
            if (notaFinal >= 4.0) {
                System.out.println(" Las alumnas aprobadas son " + alumnaiteradora.getNombre() + " " + alumnaiteradora.getApellido() + " con " + notaFinal);
            } else {
                System.out.println("Las alumnas reprobadas son " + alumnaiteradora.getNombre() + " " + alumnaiteradora.getApellido() + " con " + notaFinal);
            }
        }

        List<Curso> cursos = poblarClases.CrearCursos();
        System.out.println(cursos);
    }
}

package main;

import interfaces.IPoblarClases;
import interfaces.implementacion.PoblarClasesImpl;
import modelos.Alumnas;
import modelos.Curso;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPoblarClases poblarClases = new PoblarClasesImpl();
        double notaFinal;
        List <Alumnas> alumnas = poblarClases.CrearAlumnas();
        //System.out.println(alumnas);
        List<Curso> cursos = poblarClases.CrearCursos();

        System.out.println(cursos);

        for (Alumnas alumnaiteradora : alumnas){
            notaFinal = alumnaiteradora.CalcularNotaFinal();
            if (notaFinal >= 4.0){
                System.out.println(" Las alumnas aprobadas son " + alumnaiteradora.getNombre() + " " + alumnaiteradora.getApellido() +" con "+ notaFinal );
            }
            else {
                System.out.println("Las alumnas reprobadas son " + alumnaiteradora.getNombre() + " " + alumnaiteradora.getApellido() +" con "+ notaFinal );

            }
            System.out.print("mensaje de prueba para subir a git");
            System.out.print("segundaaaa prueba para subir a git");
        }
        System.out.println("Esto es un ensayo");

    }

}

package main;

import interfaces.IPoblarClases;
import interfaces.implementacion.PoblarClasesImpl;
import modelos.Alumnas;
import modelos.Curso;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPoblarClases poblarClases = new PoblarClasesImpl();

        List <Alumnas> alumnas = poblarClases.CrearAlumnas();
        //System.out.println(alumnas);
        //System.out.print("mensaje de prueba para subir a git");
        //System.out.print("segundaaaa prueba para subir a git");

        //System.out.println("Esto es un ensayo");

        System.out.printf();

        List<Curso> cursos = poblarClases.CrearCursos();
        System.out.println(cursos);
    }

}

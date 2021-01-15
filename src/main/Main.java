package main;

import interfaces.ICalculosAlumnas;
import interfaces.IPoblarClases;
import interfaces.implementacion.CalculosAlumnasImpl;
import interfaces.implementacion.PoblarClasesImpl;
import modelos.Alumnas;
import modelos.Curso;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IPoblarClases poblarClases = new PoblarClasesImpl();
        ICalculosAlumnas calculosAlumnas = new CalculosAlumnasImpl();

        List <Alumnas> alumnas = poblarClases.CrearAlumnas();
        System.out.println(alumnas);

        calculosAlumnas.aprobadasReprobadas(alumnas);

        List<Curso> cursos = poblarClases.CrearCursos();
        System.out.println(cursos);
    }
}

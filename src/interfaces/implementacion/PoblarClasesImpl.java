package interfaces.implementacion;

import interfaces.IPoblarClases;
import modelos.Alumnas;
import modelos.Curso;
import modelos.Notas;
import modelos.Profesor;
import modelos.enums.TipoCurso;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static modelos.enums.TipoCurso.BACKEND;

public class PoblarClasesImpl  implements IPoblarClases {

    @Override
    public List<Curso> CrearCursos() {

        List <Curso> cursos = new ArrayList<>();

        Profesor fran = new Profesor("Fran", "Herrera", 321654,987654, BACKEND);
        Profesor luisa = new Profesor("Luisa", "Martinez", 123456,456789, TipoCurso.FRONTEND);

        Alumnas Ale = new Alumnas("ALE","PANOZO",12346, CrearNotas().get (1));
        Alumnas Sofia = new Alumnas("SOFIA","GONZALEZ",12347, CrearNotas().get (2));

        Curso curso1 = new Curso(BACKEND, fran, Ale);
        Curso curso2 = new Curso(TipoCurso.FRONTEND, luisa, Sofia);

        cursos.add(curso1);
        cursos.add(curso2);


        return cursos;
    }

    @Override
    public List<Alumnas> CrearAlumnas() {
        List <Alumnas> alumnas = new ArrayList<>();

        Alumnas Pepita = new Alumnas("PEPITA","PEREZ",12345, CrearNotas().get (0));
        Alumnas Ale = new Alumnas("ALE","PANOZO",12346, CrearNotas().get (1));
        Alumnas Sofia = new Alumnas("SOFIA","GONZALEZ",12347, CrearNotas().get (2));
        Alumnas Karla = new Alumnas("KARLA","GOMEZ",12348,CrearNotas().get (3));
        Alumnas Camila = new Alumnas("CAMILA","RIOS",12349, CrearNotas().get (4));

        alumnas.add(Pepita);
        alumnas.add(Ale);
        alumnas.add(Sofia);
        alumnas.add(Karla);
        alumnas.add(Camila);

        return alumnas;
    }

    @Override
    public List<Profesor> CrearProfesores() {
        List <Profesor> profesores = new ArrayList<>();

        Profesor fran = new Profesor("Fran", "Herrera", 321654,987654, BACKEND);
        Profesor luisa = new Profesor("Luisa", "Martinez", 123456,456789, TipoCurso.FRONTEND);

        profesores.add(fran);
        profesores.add(luisa);

        return profesores;
    }

    @Override
    public List<Notas> CrearNotas() {
        List <Notas> calificaciones = new ArrayList<>();
        Notas Pepita = new Notas(3,7,5,2);
        Notas Ale = new Notas(8,5,5,4);
        Notas Sofia = new Notas(3,7,5,8);
        Notas Karla = new Notas(1,3,5,2);
        Notas Camila = new Notas(3,7,1,1);

        calificaciones.add(Pepita);
        calificaciones.add(Ale);
        calificaciones.add(Sofia);
        calificaciones.add(Karla);
        calificaciones.add(Camila);
        return calificaciones;
    }

}

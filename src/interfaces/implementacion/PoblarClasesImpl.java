package interfaces.implementacion;

import interfaces.IPoblarClases;
import modelos.Alumnas;
import modelos.Curso;
import modelos.Notas;
import modelos.Profesor;
import modelos.enums.TipoCurso;

import java.util.ArrayList;
import java.util.List;

public class PoblarClasesImpl  implements IPoblarClases {

    @Override
    public List<Curso> CrearCursos() {

        List <Curso> cursos = new ArrayList<>();
        List <Alumnas> alumnasBackEnd = new ArrayList<>();
        List <Alumnas> alumnasFrontEnd = new ArrayList<>();
        List<Profesor> profesorBackEnd = new ArrayList<>();
        List<Profesor> profesorFrontEnd = new ArrayList<>();

        profesorBackEnd.add(CrearProfesores().get(0));
        profesorFrontEnd.add(CrearProfesores().get(1));

        alumnasBackEnd.add(CrearAlumnas().get(0));
        alumnasBackEnd.add(CrearAlumnas().get(1));
        alumnasBackEnd.add(CrearAlumnas().get(2));
        alumnasFrontEnd.add(CrearAlumnas().get(3));
        alumnasFrontEnd.add(CrearAlumnas().get(4));



        Curso backEnd = new Curso(TipoCurso.BACKEND, profesorBackEnd, alumnasBackEnd);
        Curso frontEnd = new Curso(TipoCurso.FRONTEND, profesorFrontEnd, alumnasFrontEnd);

        cursos.add(backEnd);
        cursos.add(frontEnd);

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

        Profesor fran = new Profesor("Fran", "Herrera", 321654,987654);
        Profesor luisa = new Profesor("Luisa", "Martinez", 123456,456789);

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

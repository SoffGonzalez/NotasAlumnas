package interfaces.implementacion;

import interfaces.IPoblarClases;
import modelos.Alumnas;
import modelos.Curso;
import modelos.Notas;
import modelos.enums.TipoCurso;

import java.util.ArrayList;
import java.util.List;

public class PoblarClasesImpl  implements IPoblarClases {

    @Override
    public List<Alumnas> CrearAlumnas() {
        List <Alumnas> alumnas = new ArrayList<>();

        Alumnas Pepita = new Alumnas("PEPITA","PEREZ",12345, CrearNotas().get (0), TipoCurso.BACKEND);
        Alumnas Ale = new Alumnas("ALE","PANOZO",12346, CrearNotas().get (1), TipoCurso.BACKEND);
        Alumnas Sofia = new Alumnas("SOFIA","GONZALEZ",12347, CrearNotas().get (2), TipoCurso.FRONTEND);
        Alumnas Karla = new Alumnas("KARLA","GOMEZ",12348,CrearNotas().get (3), TipoCurso.FRONTEND);
        Alumnas Camila = new Alumnas("CAMILA","RIOS",12349, CrearNotas().get (4), TipoCurso.BACKEND);

        alumnas.add(Pepita);
        alumnas.add(Ale);
        alumnas.add(Sofia);
        alumnas.add(Karla);
        alumnas.add(Camila);

        return alumnas;
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

    @Override
    public List<Curso> CrearCursos() {

        List <Curso> cursos = new ArrayList<>();

        Curso backEnd = new Curso(TipoCurso.BACKEND);
        Curso frontEnd = new Curso(TipoCurso.FRONTEND);

        cursos.add(backEnd);
        cursos.add(frontEnd);

        return cursos;
    }
}

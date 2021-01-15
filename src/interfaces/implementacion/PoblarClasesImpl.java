package interfaces.implementacion;

import interfaces.IPoblarClases;
import modelos.Alumnas;
import modelos.Curso;
import modelos.Notas;
import modelos.Profesor;
import modelos.enums.TipoCursada;

import java.util.ArrayList;
import java.util.List;

import static modelos.enums.TipoCursada.*;

public class PoblarClasesImpl  implements IPoblarClases {

    @Override
    public List<Alumnas> CrearAlumnas() {
        List <Alumnas> alumnas = new ArrayList<>();

        Alumnas Pepita = new Alumnas("PEPITA","PEREZ",12345, CrearNotas().get (0), PRESENCIAL);
        Alumnas Ale = new Alumnas("ALE","PANOZO",12346, CrearNotas().get (1), ONLINE);
        Alumnas Sofia = new Alumnas("SOFIA","GONZALEZ",12347, CrearNotas().get (2), PRESENCIAL);
        Alumnas Karla = new Alumnas("KARLA","GOMEZ",12348,CrearNotas().get (3), ONLINE);
        Alumnas Camila = new Alumnas("CAMILA","RIOS",12349, CrearNotas().get (4), PRESENCIAL);


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
        List <Curso> Cursada  = new ArrayList<>();
        Profesor Fran = new Profesor("Fran", "Herrera", 321654,987654, ONLINE);
        Profesor Luisa = new Profesor("Luisa", "Martinez", 123456,456789, PRESENCIAL);

        Alumnas Ale = new Alumnas("ALE","PANOZO",12346, CrearNotas().get (1), ONLINE);
        Alumnas Sofia = new Alumnas("SOFIA","GONZALEZ",12347, CrearNotas().get (2), PRESENCIAL);

        Curso Backend = new Curso(ONLINE, Fran,  Ale);
        Curso Frontend = new Curso(PRESENCIAL, Luisa, Sofia);

        Cursada.add(Backend);
        Cursada.add(Frontend);
        return Cursada;
    }

}

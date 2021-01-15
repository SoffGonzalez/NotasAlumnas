package interfaces;

import modelos.Alumnas;
import modelos.Curso;
import modelos.Notas;
import modelos.Profesor;

import java.util.List;

public interface IPoblarClases {

    List <Alumnas> CrearAlumnas  ();
    List<Profesor> CrearProfesores ();

    List <Notas> CrearNotas ();

    List<Curso> CrearCursos();

}

package interfaces;

import modelos.Alumnas;
import modelos.Curso;
import modelos.Notas;

import java.util.List;

public interface IPoblarClases {

    List <Alumnas> CrearAlumnas  ();

    List <Notas> CrearNotas ();

    List<Curso> CrearCursos();

}

package interfaces;

import modelos.Alumnas;
import modelos.Curso;
import modelos.Notas;
import modelos.enums.TipoCursada;

import java.util.List;

public interface IPoblarClases {

    List <Alumnas> CrearAlumnas  ();

    List <Notas> CrearNotas ();

    List <Curso> CrearCursos ();


}

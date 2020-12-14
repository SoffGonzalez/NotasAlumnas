package main;

import interfaces.IPoblarClases;
import interfaces.implementacion.PoblarClasesImpl;
import modelos.Alumnas;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IPoblarClases poblarClases = new PoblarClasesImpl();
        double notaFinal;
        List <Alumnas> alumnas = poblarClases.CrearAlumnas();
        //System.out.println(alumnas);

        for (Alumnas alumnaiteradora : alumnas){
            notaFinal = alumnaiteradora.CalcularNotaFinal();
            if (notaFinal >= 4.0){
                System.out.println(" Las alumnas aprobadas son " + alumnaiteradora.getNombre() + " " + alumnaiteradora.getApellido() +" con "+ notaFinal );
            }
            else {
                System.out.println(" Las alumnas reprobadas son " + alumnaiteradora.getNombre() + " " + alumnaiteradora.getApellido() +" con "+ notaFinal );

            }
        }

    }

}

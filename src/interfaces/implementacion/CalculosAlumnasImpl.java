package interfaces.implementacion;

import interfaces.ICalculosAlumnas;
import modelos.Alumnas;

import java.util.ArrayList;
import java.util.List;

public class CalculosAlumnasImpl implements ICalculosAlumnas {

    @Override
    public void aprobadasReprobadas(List<Alumnas> alumnas) {

        double notaFinal;

        List<Alumnas> aprobadas = new ArrayList<>();
        List<Alumnas> reprobadas = new ArrayList<>();

        for (Alumnas alumnaiteradora : alumnas) {
            notaFinal = alumnaiteradora.CalcularNotaFinal();
            if (notaFinal >= 4.0) {
                aprobadas.add(alumnaiteradora);
            } else {
                reprobadas.add(alumnaiteradora);
            }
        }

        System.out.println("Las alumnas aprobadas son : ");
        for (Alumnas alumnaAprobada : aprobadas) {
            System.out.println(alumnaAprobada.getNombre() + " " + alumnaAprobada.getApellido() + " con " + alumnaAprobada.CalcularNotaFinal());
        }

        System.out.println("Las alumnas reprobadas son : ");
        for (Alumnas alumnaReprobada : reprobadas) {
            System.out.println(alumnaReprobada.getNombre() + " " + alumnaReprobada.getApellido() + " con " + alumnaReprobada.CalcularNotaFinal());
        }


    }
}

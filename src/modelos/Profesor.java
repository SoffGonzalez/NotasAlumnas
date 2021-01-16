package modelos;

public class Profesor extends Persona {
    private  int codProfesor;

        public Profesor(String nombre, String apellido, int dni, int codProfesor) {
            super(nombre, apellido, dni);
            this.codProfesor = codProfesor;
        }

        public int getCodProfesor() {
            return codProfesor;
        }

        public void setCodProfesor(int codProfesor) {
            this.codProfesor = codProfesor;
        }

    @Override
        public String toString() {
            return "Alumnx{" +
                    "nombre= '" + getNombre()  + //acà  la barra invertida ubica los datos uno debajo del otro
                    "' apellido= '" + getApellido()  +
                    "' codProfesor= " + codProfesor +
                    "' dni= " + getDni() +
                    '}';
        }
    }

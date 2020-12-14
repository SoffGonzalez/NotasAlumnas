package modelos;

    public class Profesor extends Persona {
    private  int codProfesor;
    private Curso curso;

        public Profesor(String nombre, String apellido, int dni, int codProfesor, Curso curso) {
            super(nombre, apellido, dni);
            this.codProfesor = codProfesor;
            this.curso = curso;
        }

        public int getCodProfesor() {
            return codProfesor;
        }

        public void setCodProfesor(int codProfesor) {
            this.codProfesor = codProfesor;
        }

        public Curso getCurso() {
            return curso;
        }

        public void setCurso(Curso curso) {
            this.curso = curso;
        }

        @Override
        public String toString() {
            return "Alumnx{" +
                    "nombre= '" + getNombre()  + //acà  la barra invertida ubica los datos uno debajo del otro
                    "' apellido= '" + getApellido()  +
                    "' codProfesor= " + codProfesor +
                    "' dni= " + getDni() +
                     "' curso =" + curso +
                    '}';
        }
    }

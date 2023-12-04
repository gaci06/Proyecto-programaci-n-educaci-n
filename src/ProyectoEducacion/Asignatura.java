package ProyectoEducacion;
public class Asignatura {
    private static int contadorAsignaturas = 0;

    private String idAsignatura;
    private String idProfesorAsignado;
    private String nombre;
    private String codigo;
    private NotaAlumno[] notasAlumnos;
    private int numNotas;

 
    private static final int MAX_NOTAS = 50;

	private static final String dniAlumno = null;

    public Asignatura(String idProfesorAsignado, String nombre, String codigo) {
        this.setIdAsignatura(generarIdAsignatura());
        this.setIdProfesorAsignado(idProfesorAsignado);
        this.setNombre(nombre);
        this.setCodigo(codigo);
        this.notasAlumnos = new NotaAlumno[MAX_NOTAS];
        this.numNotas = 0;
    }

  

    private String generarIdAsignatura() {
        contadorAsignaturas++;
        return "ASIG" + String.format("%04d", contadorAsignaturas);
    }
       
 
    public boolean añadirNotaAlumno(Alumno alumno, double nota) {
        if (numNotas < MAX_NOTAS) {
            notasAlumnos[numNotas] = new NotaAlumno(dniAlumno, nota);
            numNotas++;
        } else {
            System.out.println("No se puede añadir más notas. Máximo alcanzado.");
        }
		return false;
    }

   
    public boolean desmatricularAlumno(Alumno alumno) {
        for (int i = 0; i < numNotas; i++) {
            if (notasAlumnos[i].getdniAlumno().equals(alumno)) {
                for (int j = i; j < numNotas - 1; j++) {
                    notasAlumnos[j] = notasAlumnos[j + 1];
                }
                numNotas--;
                System.out.println("Desmatriculación exitosa para el alumno " + alumno);
                return true;
            }
        }
        System.out.println("El alumno " + alumno + " no está matriculado en esta asignatura.");
		return false;
    }



	public String getIdAsignatura() {
		return idAsignatura;
	}



	public void setIdAsignatura(String idAsignatura) {
		this.idAsignatura = idAsignatura;
	}



	public String getIdProfesorAsignado() {
		return idProfesorAsignado;
	}



	public void setIdProfesorAsignado(String idProfesorAsignado) {
		this.idProfesorAsignado = idProfesorAsignado;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public boolean matricularAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return false;
	}



	public boolean asignarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		return false;
	}
}

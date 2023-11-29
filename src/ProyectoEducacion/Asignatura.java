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
       
 
    public void añadirNotaAlumno(String idAlumno, double nota) {
        if (numNotas < MAX_NOTAS) {
            notasAlumnos[numNotas] = new NotaAlumno(idAlumno, nota);
            numNotas++;
        } else {
            System.out.println("No se puede añadir más notas. Máximo alcanzado.");
        }
    }

   
    public void desmatricularAlumno(String idAlumno) {
        for (int i = 0; i < numNotas; i++) {
            if (notasAlumnos[i].getIdAlumno().equals(idAlumno)) {
                for (int j = i; j < numNotas - 1; j++) {
                    notasAlumnos[j] = notasAlumnos[j + 1];
                }
                numNotas--;
                System.out.println("Desmatriculación exitosa para el alumno " + idAlumno);
                return;
            }
        }
        System.out.println("El alumno " + idAlumno + " no está matriculado en esta asignatura.");
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
}
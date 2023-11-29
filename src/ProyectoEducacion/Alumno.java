package ProyectoEducacion;

public class Alumno {
    private static int contadorAlumnos = 0;

    private String idAlumno;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String email;
    private String numeroDocumento;
    private String nombreCiclo;

    public Alumno(String nombre, String primerApellido, String telefono, String email, String numeroDocumento, String nombreCiclo) {
        this.setIdAlumno(generarIdAlumno());
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setTelefono(telefono);
        this.setEmail(email);
        this.setNumeroDocumento(numeroDocumento);
        this.setNombreCiclo(nombreCiclo);
        this.setSegundoApellido("");
    }

    

    public Alumno(String nombre2, String primerApellido2, String segundoApellido2, String telefono2, String email2,
			String numeroDocumento2, String nombreCiclo2) {
		
	}



	private String generarIdAlumno() {
        contadorAlumnos++;
        return "ALUM" + String.format("%04d", contadorAlumnos);
    }



	public String getIdAlumno() {
		return idAlumno;
	}



	public void setIdAlumno(String idAlumno) {
		this.idAlumno = idAlumno;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getPrimerApellido() {
		return primerApellido;
	}



	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}



	public String getSegundoApellido() {
		return segundoApellido;
	}



	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getNumeroDocumento() {
		return numeroDocumento;
	}



	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}



	public String getNombreCiclo() {
		return nombreCiclo;
	}



	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}



	public int getNombreCompleto() {
		
		return 0;
	}
	
}
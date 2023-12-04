package ProyectoEducacion;

public class Alumno {
    private static int contadorAlumnos = 0;

    private String dniAlumno;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String email;
    private String numeroDocumento;
    private String nombreCiclo;

    public Alumno (String nombre, String primerApellido,String segundoApellido , String telefono, String email, String numeroDocumento, String nombreCiclo) {
        this.getdniAlumno();
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
        this.setTelefono(telefono);
        this.setEmail(email);
        this.setNumeroDocumento(numeroDocumento);
        this.setNombreCiclo(nombreCiclo);
        
    }

	public String getdniAlumno() {
        contadorAlumnos++;
        return "ALUM" + String.format("%04d", contadorAlumnos);
    }

	

	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
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



	public Object getDni() {
		
		return null;
	}



	
}

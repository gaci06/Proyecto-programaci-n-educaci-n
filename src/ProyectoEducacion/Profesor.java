package ProyectoEducacion;
public class Profesor { 
    private static int contadorProfesores = 0;

    private String idProfesor;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String email;
    private String numeroDocumento;
    private boolean esTutor;
    private double sueldo;
    private int diasAsuntosPropios;

    public Profesor(String nombre, String primerApellido, String telefono, String email, String numeroDocumento, boolean esTutor, double sueldo, int diasAsuntosPropios) {
        this.setIdProfesor(generarIdProfesor());
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(""); 
        this.setTelefono(telefono);
        this.setEmail(email);
        this.setNumeroDocumento(numeroDocumento);
        this.setEsTutor(esTutor);
        this.setSueldo(sueldo);
        this.setDiasAsuntosPropios(diasAsuntosPropios);
        
    }

   

   Profesor(final String nombre2, final String primerApellido2, final String segundoApellido2, final String telefono2, final String email2,
			final String numeroDocumento2, final boolean esTutor2, final double sueldo2, final String diasAsuntosPropios2) {
		// TODO Auto-generated constructor stub
	}



	public Profesor() {
	// TODO Auto-generated constructor stub
}



	String generarIdProfesor() {
        contadorProfesores++;
        return "PROF" + String.format("%04d", contadorProfesores);
    }



	public String getIdProfesor() {
		return idProfesor;
	}



	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
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



	public boolean isEsTutor() {
		return esTutor;
	}



	public void setEsTutor(boolean esTutor) {
		this.esTutor = esTutor;
	}



	public double getSueldo() {
		return sueldo;
	}



	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}



	public int getDiasAsuntosPropios() {
		return diasAsuntosPropios;
	}



	public void setDiasAsuntosPropios(int diasAsuntosPropios) {
		this.diasAsuntosPropios = diasAsuntosPropios;
	}
	public int getNombreCompleto() {
		
		return getNombreCompleto();
	}



	public Object getDni() {
		// TODO Auto-generated method stub
		return null;
	}
}

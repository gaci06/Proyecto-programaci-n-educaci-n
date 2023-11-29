package ProyectoEducacion;


public class NotaAlumno {

	private String idAlumno;
    private double nota;

    public NotaAlumno(String idAlumno, double nota) {
        this.setIdAlumno(idAlumno);
        this.setNota(nota);
    }

	public Object getIdAlumno() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setIdAlumno(String idAlumno) {
		this.idAlumno = idAlumno;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

  
}

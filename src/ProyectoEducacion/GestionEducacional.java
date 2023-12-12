package ProyectoEducacion;
import java.util.Scanner;

public class GestionEducacional {

    
    private static final int MAX_ALUMNOS = 60;
    private static final int MAX_ASIGNATURAS = 20;
    private static final int MAX_PROFESORES = 15;
	private static final Object[] Profesor = null;
	private static final Object idAlumno = null;

  
    private static Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
    private static Asignatura[] asignaturas = new Asignatura[MAX_ASIGNATURAS];
    private static Profesor[] profesores = new Profesor[MAX_PROFESORES];
	private static int numAlumnos;
	private static int numProfesores;
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        new GestionEducacional();

        int opcion = 2;
        
        do {
        	System.out.println("Bienvenido al software de gestión de centros educativos.");
            System.out.println("--------------------------------------------");
            System.out.println("Por favor, escoja una de las siguientes opciones");
            System.out.println("1. Menú de profesores.");
            System.out.println("2. Menú de alumnos.");
            System.out.println("3. Menú de asignaturas.");
            System.out.println("4. Salir del gestor.");
            System.out.println("--------------------------------------------");
            System.out.print("OPCIÓN: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    menuProfesores(profesores, scanner);
                    break;
                case 2:
                	menuAlumnos(alumnos, scanner);
                    break;
                case 3:
                    menuAsignaturas(asignaturas, profesores, alumnos, scanner);
                    break;
                case 4:
                    System.out.println("Gracias por usar nuestro software. CERRANDO...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }
    

 
    private static void menuAlumnos(Alumno[] alumnos, Scanner scanner) {
        int opcion;
        do {
            System.out.println("--------------------------------------------");
            System.out.println("Alumnos:");
            System.out.println("1. Añadir alumno.");
            System.out.println("2. Consultar datos de los alumnos.");
            System.out.println("3. Volver al menú principal.");
            System.out.println("--------------------------------------------");
            System.out.print("OPCIÓN: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    añadirAlumno(scanner);
                    break;
                case 2:
                    consultarDatosAlumnos(scanner);
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);
    }
    

 
    private static void añadirAlumno(Scanner scanner) { 
    	int opción=0;
        if (numAlumnos < MAX_ALUMNOS) {
            System.out.println("Introduce los datos del alumno:");
            System.out.print("Nombre(MAX 30 caracteres): ");
            String nombre = scanner.nextLine();

            System.out.println("Primer Apellido (MAX 40 caracteres): ");
            String primerApellido = scanner.nextLine();

            System.out.println("Segundo Apellido (opcional): ");
            String segundoApellido = scanner.nextLine();

            System.out.println("Teléfono([6, 7 u 9] y 8 números): ");
            String telefono = scanner.nextLine();

            System.out.println("Email (email@alumno.es): ");
            String email = scanner.nextLine();

            System.out.println("Número de Documento (NIF o NIE): ");
            String numeroDocumento = scanner.nextLine();

            System.out.println("Nombre del Ciclo (opcional): ");
            String nombreCiclo = scanner.nextLine();

            alumnos[numAlumnos] = new Alumno(nombre, primerApellido, segundoApellido, telefono, email, numeroDocumento, nombreCiclo);
            numAlumnos++;

            System.out.println("Alumno añadido correctamente.");
        } else {
            System.out.println("No se puede añadir más alumnos. Máximo alcanzado.");
        }
    }

    
    private static void consultarDatosAlumnos(Scanner scanner) {
        if (numAlumnos > 0) {
            System.out.println("Listado de alumnos:");
            for (int i = 0; i < numAlumnos; i++) {
                System.out.println((i + 1) + ". " + alumnos[i].getidAlumno() + " # " + alumnos[i].getNombreCompleto());
            }

            System.out.print("Escoger alumno (0: Volver al menú anterior): ");
            int seleccion = scanner.nextInt();

            if (seleccion > 0 && seleccion <= numAlumnos) {
                Alumno alumnoSeleccionado = alumnos[seleccion - 1];
                System.out.println("INFO ALUMNO:");
                System.out.println("DNI: " + alumnoSeleccionado.getidAlumno());
                System.out.println("Nombre: " + alumnoSeleccionado.getNombre());
                System.out.println("Apellido1: " + alumnoSeleccionado.getPrimerApellido());
                System.out.println("Apellido2: " + alumnoSeleccionado.getSegundoApellido());
                System.out.println("Teléfono: " + alumnoSeleccionado.getTelefono());
                System.out.println("Email: " + alumnoSeleccionado.getEmail());
                System.out.println("Documento: " + alumnoSeleccionado.getNumeroDocumento());
                System.out.println("Nombre del Ciclo: " + alumnoSeleccionado.getNombreCiclo());
            } else if (seleccion != 0) {
                System.out.println("Selección no válida.");
            }
        } else {
            System.out.println("No hay alumnos registrados en el sistema.");
        }
    }
    
    

    public static void menuProfesores(Profesor[] profesores, Scanner scanner) {
        int opcion;

        do {
            System.out.println("--------------------------------------------");
            System.out.println("Profesores:");
            System.out.println("1. Añadir profesor.");
            System.out.println("2. Consultar datos de los profesores.");
            System.out.println("3. Volver al menú anterior.");
            System.out.println("--------------------------------------------");
            System.out.print("OPCIÓN: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarProfesor(scanner);
                    break;
                case 2:
                    consultarDatosProfesores(profesores, scanner);
                    break;
                case 3:
                    System.out.println("Volviendo al menú anterior...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);
    }
    
    
    


	private static Profesor agregarProfesor(Scanner scanner) {
        int contadorProfesores = 0;
        if (contadorProfesores > MAX_PROFESORES) {
            System.out.println("¡Se ha alcanzado el límite máximo de profesores!");
            return null;
        }

        System.out.println("Añadir profesor al sistema:");

        System.out.print("Nombre del profesor (MAX 30 caracteres): ");
        String nombre = scanner.nextLine();

        System.out.print("Primer apellido del profesor (MAX 40 caracteres): ");
        String primerApellido = scanner.nextLine();

        System.out.print("Segundo apellido del profesor (opcional): ");
        String segundoApellido = scanner.nextLine();

        System.out.print("Teléfono del profesor ([6, 7 u 9] y 8 números): ");
        String telefono = scanner.nextLine();

        System.out.print("Email del profesor (email@profesor.es): ");
        String email = scanner.nextLine();

        System.out.print("Número de documento del profesor (DNI o NIE): ");
        String numeroDocumento = scanner.nextLine();

        System.out.print("¿Es tutor? (0: no; 1: sí): ");
        boolean esTutor = scanner.nextInt() == 1;
        scanner.nextLine(); 

        System.out.print("Sueldo del profesor (>0): ");
        double sueldo = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.print("Días de asuntos propios del profesor (>=0): ");
        String diasAsuntosPropios = scanner.nextLine();
        scanner.nextLine();

        return new Profesor(nombre, primerApellido, segundoApellido, telefono,
                email, numeroDocumento, esTutor, sueldo, diasAsuntosPropios);
        
        
    }

    private static void consultarDatosProfesores(Profesor[] profesores2, Scanner scanner) {
    	if (numProfesores > 0) {
            System.out.println("Listado de Profesores:");
            for (int i = 0; i < numProfesores; i++) {
                System.out.println((i + 1) + ". " + profesores[i].getIdProfesor() + " # " + ( profesores[i]).getNombreCompleto());
            }

            System.out.print("Escoger profesor (0: Volver al menú anterior): ");
            int seleccion = scanner.nextInt();

            if (seleccion > 0 && seleccion <= numProfesores) {
                Profesor profesorSeleccionado = (ProyectoEducacion.Profesor) Profesor[seleccion - 1];
                System.out.println("INFO profesor:");
                System.out.println("ID: " + profesorSeleccionado.generarIdProfesor());
                System.out.println("Nombre: " + profesorSeleccionado.getNombre());
                System.out.println("Apellido1: " + profesorSeleccionado.getPrimerApellido());
                System.out.println("Apellido2: " + profesorSeleccionado.getSegundoApellido());
                System.out.println("Teléfono: " + profesorSeleccionado.getTelefono());
                System.out.println("Email: " + profesorSeleccionado.getEmail());
                System.out.println("Documento: " + profesorSeleccionado.getNumeroDocumento());
                System.out.println("Tutor: " + profesorSeleccionado.isEsTutor());
                System.out.println("Sueldo: " + profesorSeleccionado.getSueldo());
                System.out.println("Dias de asuntos propios: " + profesorSeleccionado.getDiasAsuntosPropios());
                
            } else if (seleccion != 0) {
                System.out.println("Selección no válida.");
            }
        } else {
            System.out.println("No hay profesores registrados en el sistema.");
        }
    
		
    	}
	



  




    public static void menuAsignaturas(Asignatura[] asignaturas, Profesor[] profesores, Alumno[] alumnos, Scanner scanner) {
        int opcion;

        do {
            System.out.println("--------------------------------------------");
            System.out.println("Asignaturas:");
            System.out.println("1. Añadir asignatura.");
            System.out.println("2. Consultar datos de las asignaturas.");
            System.out.println("3. Asignar profesor a asignatura.");
            System.out.println("4. Matricular alumno en asignatura.");
            System.out.println("5. Poner nota a alumno en asignatura.");
            System.out.println("6. Borrar asignatura.");
            System.out.println("7. Desmatricular alumno en asignatura.");
            System.out.println("8. Volver al menú anterior.");
            System.out.println("--------------------------------------------");
            System.out.print("OPCIÓN: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    añadirAsignatura(asignaturas, profesores, scanner);
                    break;
                case 2:
                    consultarDatosAsignaturas(asignaturas, scanner);
                    break;
                case 3:
                    asignarProfesorAsignatura(asignaturas, profesores, scanner);
                    break;
                case 4:
                    matricularAlumnoAsignatura(asignaturas, alumnos, scanner);
                    break;
                case 5:
                    ponerNotaAlumnoAsignatura(asignaturas, alumnos, scanner);
                    break;
                case 6:
                    borrarAsignatura(asignaturas, scanner);
                    break;
                case 7:
                    desmatricularAlumnoAsignatura(asignaturas, alumnos, scanner);
                    break;
                case 8:
                    System.out.println("Volviendo al menú anterior...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 8);
    }

    private static void añadirAsignatura(Asignatura[] asignaturas, Profesor[] profesores, Scanner scanner) {
	    System.out.print("Introduce el nombre de la asignatura: ");
	    String nombre = scanner.nextLine();
	    System.out.print("Introduce el código de la asignatura: ");
	    String codigo = scanner.nextLine();
	    

	    
	    Asignatura nuevaAsignatura = new Asignatura(nombre, codigo);

	    
	    for (int i = 0; i < asignaturas.length; i++) {
	        if (asignaturas[i] == null) {
	            asignaturas[i] = nuevaAsignatura;
	            System.out.println("Asignatura añadida con éxito.");
	            return;
	        }
	    }
	    System.out.println("No se pudo añadir la asignatura, el array está lleno.");
	}
    
    private static void consultarDatosAsignaturas(Asignatura[] asignaturas, Scanner scanner) {
	    System.out.print("Introduce el código de la asignatura que deseas consultar: ");
	    String codigoAsignatura = scanner.nextLine();

	    for (Asignatura asignatura : asignaturas) {
	        if (asignatura != null && asignatura.getCodigo().equals(codigoAsignatura)) {
	            System.out.println("Nombre: " + asignatura.getNombre());
	            System.out.println("Código: " + asignatura.getCodigo());
	            return;
	        }
	    }
	    System.out.println("No se encontró ninguna asignatura con el código " + codigoAsignatura + ".");
	}
    
    private static void asignarProfesorAsignatura(Asignatura[] asignaturas, Profesor[] profesores, Scanner scanner) {
	    System.out.print("Introduce el código de la asignatura: ");
	    String codigoAsignatura = scanner.nextLine();
	    System.out.print("Introduce el DNI del profesor: ");
	    String dniProfesor = scanner.nextLine();

	    for (Asignatura asignatura : asignaturas) {
	        if (asignatura != null && asignatura.getCodigo().equals(codigoAsignatura)) {
	            for (Profesor profesor : profesores) {
	                if (profesor != null && profesor.getDni().equals(dniProfesor)) {
	                    if (asignatura.asignarProfesor(profesor)) {
	                        System.out.println("Profesor asignado con éxito a la asignatura.");
	                        return;
	                    } else {
	                        System.out.println("La asignatura ya tiene un profesor asignado.");
	                        return;
	                    }
	                }
	            }
	            System.out.println("No se encontró ningún profesor con el DNI " + dniProfesor + ".");
	            return;
	        }
	    }
	    System.out.println("No se encontró ninguna asignatura con el código " + codigoAsignatura + ".");
	}
    
    private static void matricularAlumnoAsignatura(Asignatura[] asignaturas, Alumno[] alumnos, Scanner scanner) {
	    System.out.print("Introduce el código de la asignatura: ");
	    String codigoAsignatura = scanner.nextLine();
	    System.out.print("Introduce el DNI del alumno: ");
	    String dniAlumno = scanner.nextLine();

	    for (Asignatura asignatura : asignaturas) {
	        if (asignatura != null && asignatura.getCodigo().equals(codigoAsignatura)) {
	            for (Alumno alumno : alumnos) {
	                if (alumno != null && alumno.getDni().equals(dniAlumno)) {
	                    if (asignatura.matricularAlumno(alumno)) {
	                        System.out.println("Alumno matriculado con éxito.");
	                        return;
	                    } else {
	                        System.out.println("El alumno ya está matriculado en esta asignatura.");
	                        return;
	                    }
	                }
	            }
	            System.out.println("No se encontró ningún alumno con el DNI " + dniAlumno + ".");
	            return;
	        }
	    }
	    System.out.println("No se encontró ninguna asignatura con el código " + codigoAsignatura + ".");
	}
    
    private static void ponerNotaAlumnoAsignatura(Asignatura[] asignaturas, Alumno[] alumnos, Scanner scanner) {
	    System.out.print("Introduce el código de la asignatura: ");
	    String codigoAsignatura = scanner.nextLine();
	    System.out.print("Introduce el DNI del alumno: ");
	    String dniAlumno = scanner.nextLine();

	    for (Asignatura asignatura : asignaturas) {
	        if (asignatura != null && asignatura.getCodigo().equals(codigoAsignatura)) {
	            for (Alumno alumno : alumnos) {
	                if (alumno != null && alumno.getDni().equals(dniAlumno)) {
	                    System.out.print("Introduce la nota del alumno en la asignatura: ");
	                    double nota = scanner.nextDouble();
	                    scanner.nextLine(); 

	                    if (asignatura.añadirNotaAlumno(alumno, nota)) {
	                        System.out.println("Nota asignada con éxito.");
	                        return;
	                    } else {
	                        System.out.println("El alumno no está matriculado en esta asignatura.");
	                        return;
	                    }
	                }
	            }
	            System.out.println("No se encontró ningún alumno con el DNI " + dniAlumno + ".");
	            return;
	        }
	    }
	    System.out.println("No se encontró ninguna asignatura con el código " + codigoAsignatura + ".");
	}
    
    private static void borrarAsignatura(Asignatura[] asignaturas2, Scanner scanner) {
		
	    System.out.print("Introduce el código de la asignatura a borrar: ");
	    String codigoAsignatura = scanner.nextLine();

	    for (int i = 0; i < asignaturas.length; i++) {
	        if (asignaturas[i] != null && asignaturas[i].getCodigo().equals(codigoAsignatura)) {
	            asignaturas[i] = null;
	            System.out.println("Asignatura borrada con éxito.");
	            return;
	        }
	    }
	    System.out.println("No se encontró ninguna asignatura con el código " + codigoAsignatura + ".");
	}

    private static void desmatricularAlumnoAsignatura(Asignatura[] asignaturas, Alumno[] alumnos, Scanner scanner) {
        System.out.print("Introduce el código de la asignatura: ");
        String codigoAsignatura = scanner.nextLine();
        System.out.print("Introduce el DNI del alumno a desmatricular: ");
        String dniAlumno = scanner.nextLine();

        boolean asignaturaEncontrada = false;
        boolean alumnoEncontrado = false;

        for (Asignatura asignatura : asignaturas) {
            if (asignatura != null && asignatura.getCodigo().equals(codigoAsignatura)) {
                asignaturaEncontrada = true;
                for (Alumno alumno : alumnos) {
                    if (alumno != null && alumno.getDni().equals(dniAlumno)) {
                        alumnoEncontrado = true;
                        if (asignatura.desmatricularAlumno(alumno)) {
                            System.out.println("Alumno desmatriculado de la asignatura con éxito.");
                        } else {
                            System.out.println("El alumno no está matriculado en esta asignatura.");
                        }
                        break;
                    }
                }
                if (!alumnoEncontrado) {
                    System.out.println("No se encontró ningún alumno con el DNI " + dniAlumno + ".");
                }
                break;
            }
        }

        if (!asignaturaEncontrada) {
            System.out.println("No se encontró ninguna asignatura con el código " + codigoAsignatura + ".");
        }
    }
    
}
		
	



	
		
	



	



	



	



	



	






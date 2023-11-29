package ProyectoEducacion;
import java.util.Scanner;

public class GestionEducacional {

    
    private static final int MAX_ALUMNOS = 60;
    private static final int MAX_ASIGNATURAS = 20;
    private static final int MAX_PROFESORES = 15;

  
    private static Alumno[] alumnos = new Alumno[MAX_ALUMNOS];
    private static Asignatura[] asignaturas = new Asignatura[MAX_ASIGNATURAS];
    private static Profesor[] profesores = new Profesor[MAX_PROFESORES];
	private int numAlumnos;

    
    
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
    

 
        private static void menuAlumnos(Alumno[] alumnos2, Scanner scanner) {
	}



		{
            System.out.println("--------------------------------------------");
            System.out.println("Alumnos:");
            System.out.println("1. Añadir alumno.");
            System.out.println("2. Consultar datos de los alumnos.");
            System.out.println("3. Volver al menú principal.");
            System.out.println("--------------------------------------------");
            System.out.println("OPCIÓN: ");
          
            Scanner scanner = new Scanner(System.in);

            int opcion = 3;
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
            
        } while (opcion != 3);
    }

 
    private void añadirAlumno(Scanner scanner) {
        if (numAlumnos < MAX_ALUMNOS) {
            System.out.println("Introduce los datos del alumno:");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Primer Apellido: ");
            String primerApellido = scanner.nextLine();

            System.out.println("Segundo Apellido (opcional): ");
            String segundoApellido = scanner.nextLine();

            System.out.println("Teléfono: ");
            String telefono = scanner.nextLine();

            System.out.println("Email: ");
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

    
    private void consultarDatosAlumnos(Scanner scanner) {
        if (numAlumnos > 0) {
            System.out.println("Listado de alumnos:");
            for (int i = 0; i < numAlumnos; i++) {
                System.out.println((i + 1) + ". " + alumnos[i].getIdAlumno() + " # " + alumnos[i].getNombreCompleto());
            }

            System.out.print("Escoger alumno (0: Volver al menú anterior): ");
            int seleccion = scanner.nextInt();

            if (seleccion > 0 && seleccion <= numAlumnos) {
                Alumno alumnoSeleccionado = alumnos[seleccion - 1];
                System.out.println("INFO ALUMNO:");
                System.out.println("ID: " + alumnoSeleccionado.getIdAlumno());
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
                    añadirProfesor(profesores, scanner);
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
    
    
	private static void añadirProfesor(Profesor[] profesores2, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}



	private static Profesor agregarProfesor() {
        Scanner scanner = new Scanner(System.in);

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

        System.out.print("Email del profesor (cadena@profesor.es): ");
        String email = scanner.nextLine();

        System.out.print("Número de documento del profesor (DNI o NIE): ");
        String numeroDocumento = scanner.nextLine();

        System.out.print("¿Es tutor? (0: no; 1: sí): ");
        boolean esTutor = scanner.nextInt() == 1;

        System.out.print("Sueldo del profesor (>0): ");
        double sueldo = scanner.nextDouble();

        System.out.print("Días de asuntos propios del profesor (>=0): ");
        int diasAsuntosPropios = scanner.nextInt();

        return new Profesor(nombre, primerApellido, segundoApellido, telefono,
                email, numeroDocumento, esTutor, sueldo, diasAsuntosPropios);
    }

    public static String[] getIdsProfesores() {
        return getIdsProfesores();
    }

  
    private static void consultarDatosProfesores(Profesor[] profesores, Scanner scanner) {
      
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



	private static void desmatricularAlumnoAsignatura(Asignatura[] asignaturas2, Alumno[] alumnos2, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}



	private static void borrarAsignatura(Asignatura[] asignaturas2, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}



	private static void ponerNotaAlumnoAsignatura(Asignatura[] asignaturas2, Alumno[] alumnos2, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}



	private static void matricularAlumnoAsignatura(Asignatura[] asignaturas2, Alumno[] alumnos2, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}



	private static void asignarProfesorAsignatura(Asignatura[] asignaturas2, Profesor[] profesores2, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}



	private static void consultarDatosAsignaturas(Asignatura[] asignaturas2, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}



	private static void añadirAsignatura(Asignatura[] asignaturas2, Profesor[] profesores2, Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
}






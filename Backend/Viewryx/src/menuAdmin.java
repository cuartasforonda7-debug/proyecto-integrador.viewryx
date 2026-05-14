
import java.util.Scanner;


public class menuAdmin {
    public static void menuAdmin() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do { 
            System.out.println("===== MENU ADMIN =====");
            System.out.println("1. Gestionar Proyectos");
            System.out.println("2. Gestionar Personal");
            System.out.println("3. Gestionar Actividades");
            System.out.println("4. Cerrar Sesion.");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    gestionarProyectos();
                    break;
                case 2:
                    gestionarPersonal();
                    break;
                case 3:
                    gestionarActividades();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;     
                default:
                    throw new AssertionError();
            }

        } while (opcion != 0);
    }
    
}
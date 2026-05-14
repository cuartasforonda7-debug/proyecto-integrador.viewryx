import java.util.Scanner;

public class menuPrincipal {
    public static void menuPrincipal() {
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1. Registrarse");
            System.out.println("2. Loguearse");
            System.out.println("3. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarUsuario();
                    break;
                case 2:
                    Usuario usuarioLogueado = login();
                    if (usuarioLogueado != null) {
                        if (usuarioLogueado.rol.equals("ADMIN")) {

                            menuAdmin();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 0);

    }
}

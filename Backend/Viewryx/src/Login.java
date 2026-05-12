public class Login {
    public static Usuario Login(String[] args) {

        System.out.println("correo:");
        String correo = sc.nextLine();

        for (int i = 0 < listausUarios.size(); i++) {

            Usuario u = listaUsuario.get(i);

            if (u.correo.equals(password)) {
                System.out.println(" Bienvenido " + u.nombre);
                return u;
            }

        }
        System.out.println(" credenciales incorrectas ");
        return null;
    }
}

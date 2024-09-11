package Model;

public class PatronMVC {
    // Modelo
    class Modelo {
        private String mensaje = "Hola desde el modelo";

        public String getMensaje() {
            return mensaje;
        }
    }
    // Vista
    class Vista {
        public void mostrarMensaje(String mensaje) {
            System.out.println(mensaje);
        }
    }
    // Controlador
    class Controlador {
        private Modelo modelo;
        private Vista vista;

        public Controlador(Modelo modelo, Vista vista) {
            this.modelo = modelo;
            this.vista = vista;
        }

        public void actualizarVista() {
            String mensaje = modelo.getMensaje();
            vista.mostrarMensaje(mensaje);
        }
    }
    public class MainMVC {
        public static void main(String[] args) {
            Modelo modelo = new Modelo();
            Vista vista = new Vista();
            Controlador controlador = new Controlador(modelo, vista);

            controlador.actualizarVista();
        }
    }

}

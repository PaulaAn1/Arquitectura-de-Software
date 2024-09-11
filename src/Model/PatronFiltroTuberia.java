package Model;

public class PatronFiltroTuberia {
    // Filtro que convierte a mayúsculas
    class FiltroMayusculas {
        public String procesar(String entrada) {
            return entrada.toUpperCase();
        }
    }

    // Filtro que añade signos de exclamación
    class FiltroExclamacion {
        public String procesar(String entrada) {
            return entrada + "!!!";
        }
    }

    // Tubería que conecta los filtros
    class Tuberia {
        private FiltroMayusculas filtroMayusculas = new FiltroMayusculas();
        private FiltroExclamacion filtroExclamacion = new FiltroExclamacion();

        public String procesar(String entrada) {
            String intermedio = filtroMayusculas.procesar(entrada);
            return filtroExclamacion.procesar(intermedio);
        }
    }

    public class PipeAndFilter {
        public static void main(String[] args) {
            Tuberia tuberia = new Tuberia();
            String resultado = tuberia.procesar("Hola mundo");
            System.out.println(resultado);
        }
    }
}

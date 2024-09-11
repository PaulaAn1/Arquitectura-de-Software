package Model;

public class PatronPorCapas {
    // Capa de acceso a datos
    class DataAccessLayer {
        public String getData() {
            return "Datos desde la base de datos";
        }
    }

    // Capa de lógica de negocio
    class BusinessLogicLayer {
        private DataAccessLayer dataAccessLayer = new DataAccessLayer();

        public String processData() {
            String data = dataAccessLayer.getData();
            return "Procesado: " + data;
        }
    }

    // Capa de presentación
    class PresentationLayer {
        private BusinessLogicLayer businessLogicLayer = new BusinessLogicLayer();

        public void display() {
            String processedData = businessLogicLayer.processData();
            System.out.println(processedData);
        }
    }

    public class Main {
        public static void main(String[] args) {
            PresentationLayer presentationLayer = new PresentationLayer();
            presentationLayer.display();
        }
    }
}

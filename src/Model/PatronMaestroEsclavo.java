package Model;

public class PatronMaestroEsclavo {
    import java.util.concurrent.*;

    class Tarea implements Callable<String> {
        private final int id;

        public Tarea(int id) {
            this.id = id;
        }

        @Override
        public String call() {
            return "Esclavo " + id + " ejecutó su tarea.";
        }
    }

    public class MaestroEsclavo {
        public static void main(String[] args) throws InterruptedException, ExecutionException {
            ExecutorService maestro = Executors.newFixedThreadPool(3);

            Future<String> resultado1 = maestro.submit(new Tarea(1));
            Future<String> resultado2 = maestro.submit(new Tarea(2));
            Future<String> resultado3 = maestro.submit(new Tarea(3));

            System.out.println(resultado1.get());
            System.out.println(resultado2.get());
            System.out.println(resultado3.get());

            maestro.shutdown();
        }
    }

}

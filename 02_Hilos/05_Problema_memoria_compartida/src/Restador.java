import java.util.concurrent.ThreadLocalRandom;

public class Restador implements Runnable {
    private Contador contador;
    private String nombre;
    public Restador(String nombre, Contador contador) {
        this.contador = contador;
        this.nombre = nombre;
    }
    @Override
    public void run() {
        // Decrementar el contador 200 veces esperando entre 50 y 150ms
        for(int i = 0; i < 1500; i++) {
            contador.decrementar();
            try {
                System.out.println("[RESTADOR] >> Valor actual: " + contador.valor());
                Thread.sleep(ThreadLocalRandom.current().nextLong(10, 150));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

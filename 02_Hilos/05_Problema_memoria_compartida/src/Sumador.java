import java.util.concurrent.ThreadLocalRandom;
public class Sumador extends Thread {
    private Contador contador;

    public Sumador(String nombre, Contador contador) {
        super(nombre);
        this.contador = contador;
    }

    @Override
    public void run() {
        // Incrementar el contador 300 veces esperando entre 50 y 150ms
        for(int i = 0; i < 1500; i++) {
            contador.incrementar();
            try {
                System.out.println("[SUMADOR] >> Valor actual: " + contador.valor());
                Thread.sleep(ThreadLocalRandom.current().nextLong(10, 150));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

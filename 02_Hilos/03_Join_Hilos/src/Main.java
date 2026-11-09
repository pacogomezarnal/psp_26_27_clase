
public class Main {
    public static void main(String[] args) {
        // Grupo impar
        ThreadGroup impar = new ThreadGroup("Grupo impar");
        // Grupo par
        ThreadGroup par = new ThreadGroup("Grupo par");

        // Generamos hilos como si no hubiera un mañana
        Thread localThread = null;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                localThread = new Thread(par, new EjemploInfoHilo(), "Hilo par " + i);
            } else {
                localThread = new Thread(impar, new EjemploInfoHilo(), "Hilo impar " + i);
            }
            if (i == 7){
                impar.interrupt();
            }
            localThread.setPriority(i+1);
            localThread.start();
            try{
               localThread.join();
            } catch (InterruptedException e) {
               e.printStackTrace();
            }

        }
    }
}


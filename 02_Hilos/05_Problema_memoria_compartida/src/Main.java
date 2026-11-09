public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Crea un instance de Contador con un valor inicial de 0
        Contador contador = new Contador(100);
        System.out.println("[MAIN] >> Valor inicial: " + contador.valor());

        // Crea y lanza 2 hilos (Sumador y Restador) que incrementan y decrementan el contador
        Sumador sumador = new Sumador("Sumador", contador);
        Restador restador = new Restador("Restador", contador);

        Thread hilo_restador = new Thread(restador);

        sumador.start();
        hilo_restador.start();


        sumador.join();
        hilo_restador.join();

        // Imprime el valor final del contador después de que ambos hilos hayan terminado
        System.out.println("[MAIN] >> Valor final: " + contador.valor());

    }
}

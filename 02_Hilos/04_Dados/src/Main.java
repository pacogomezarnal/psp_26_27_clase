public class Main {
    public static void main(String[] args) {
        Thread [] dados = new Thread[10];

        // Crear y lanzar los hilos de los dados
        for (int i = 0; i < dados.length; i++) {
            Dado dado = new Dado(6); // Crear un dado de 6 caras
            dados[i] = new Thread(dado);
            dados[i].start();
        }

        // Esperar a que todos los hilos terminen
        try{
            // for (int i = 0; i < dados.length; i++)
            for (Thread dado : dados) {
                dado.join();
            }
            System.out.println("Todos los dados han terminado de lanzar.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

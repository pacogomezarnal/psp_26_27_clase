public class Main{
    public static void main(String[] args) {

        //Creamos un grupo de hilos
        ThreadGroup grupoHilos = new ThreadGroup("Grupo de hilos");

        //Creamos 3 hilos y los asociamos al grupo de hilos
        Thread hilo1 = new Thread(grupoHilos, new Tarea(2000),
                "Hilo 1");
        Thread hilo2 = new Thread(grupoHilos, new Tarea(4000),
                "Hilo 2");
        Thread hilo3 = new Thread(grupoHilos, new Tarea(6000),
                "Hilo 3");

        //Iniciamos los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();

        //Preguntar la informacion de los hilos activos cada segundo
        while (grupoHilos.activeCount() > 0) {
            System.out.println(
                    "MAIN>> Hilos activos: " + grupoHilos.activeCount()
            );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


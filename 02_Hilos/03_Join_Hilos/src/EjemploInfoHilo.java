public class EjemploInfoHilo implements Runnable{
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("[" + threadName + "] : Iniciando.");
        System.out.println("[" + threadName + "] : Prioridad: " +
                Thread.currentThread().getPriority());
        System.out.println("[" + threadName + "] : Id  : " +
                Thread.currentThread().getId());
        System.out.println("[" + threadName + "] : Grupo: " +
                Thread.currentThread().getThreadGroup().getName());
        System.out.println("[" + threadName + "] : Estado: " +
                Thread.currentThread().getState());
        //Simulamos 1 segundo de trabajo
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.interrupted();
            e.printStackTrace();
        }
    }
}

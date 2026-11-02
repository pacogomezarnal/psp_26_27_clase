public class Tarea implements Runnable{
    private int tiempo;

    public Tarea(int tiempo){
        this.tiempo = tiempo;
    }
    //Logica de la tarea
    @Override
    public void run() {
        try{
            System.out.println(
                    Thread.currentThread().getName()+">> TRabajando..."
            );
            //Sacamos la informacion del nombre del hilo, el nombre del grupo y los hilos activos del grupo
            System.out.println(
                    Thread.currentThread().getName()+">> Grupo: "+Thread.currentThread().getThreadGroup().getName()
            );
            System.out.println(
                    Thread.currentThread().getName()+">> Hilos activos: "+Thread.currentThread().getThreadGroup().activeCount()
            );
            //Esperamos el tiempo que se le pasa por parametro al constructor
            Thread.sleep(tiempo);
            System.out.println(
                    Thread.currentThread().getName()+">> Tarea completada"
            );
        }catch (InterruptedException e){
            System.out.println(
                    Thread.currentThread().getName()+">> Hilo interrumpido"
            );
        }

    }
}

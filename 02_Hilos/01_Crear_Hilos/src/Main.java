public class Main {
    public static void main(String[] args) {
        //Crear un objeto de tipo MyRunnable
        MyRunnable myRunnable = new MyRunnable();
        //Crear mi primer hilo
        Thread thread = new Thread(myRunnable);
        thread.start();
        //Lanzar varios hilos
        //for (int i=0; i<5;i++){
        //    new Thread(myRunnable).start();
        //}

        //Creo dos objetos cuentaAtras
        Thread contador01 = new Thread(new CuentaAtras(5));
        Thread contador02 = new Thread(new CuentaAtras(6));

        //Lanzo los hilos
        contador01.start();
        contador02.start();
    }
}
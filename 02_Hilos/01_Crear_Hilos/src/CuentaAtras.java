public class CuentaAtras implements Runnable{
    //Definicion de variables
    private int cuentaAtras;
    //Se crea estática para que se pueda generar una para cada hilo
    private static int contadorHilos = 0;
    //Una variable por instancia
    private final int idHilo = contadorHilos;

    //Constructor
    public CuentaAtras(int cuentaAtras){
        this.cuentaAtras = cuentaAtras;
        contadorHilos++;
    }
    @Override
    public void run() {
        //Contador hacia atras
        while(cuentaAtras > 0){
            System.out.println("Hilo "+idHilo+": "+ cuentaAtras);
            cuentaAtras--;
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}

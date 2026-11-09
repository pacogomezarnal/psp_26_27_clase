import java.util.concurrent.ThreadLocalRandom;
public class Dado implements Runnable{
    //Numero de caras del dado
    private int caras;
    public Dado(int caras) {
        if (caras<1) {
            throw new IllegalArgumentException("El dado debe tener al menos una cara");
        }
        this.caras = caras;
    }

    @Override
    public void run() {
        int resultado_dado = ThreadLocalRandom.current().nextInt(caras) + 1;
        System.out.println("Resultado del dado: " + resultado_dado);
    }
}

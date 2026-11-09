public class Contador {
    private int cuenta;

    public Contador(int cuentaInicial) {
        this.cuenta = cuentaInicial;
    }

    public void incrementar() {
        this.cuenta++;
    }

    public void decrementar() {
        this.cuenta--;
    }

    public int valor(){
        return this.cuenta;
    }
}

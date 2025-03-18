public class Computador extends Dispositivo {
    private String tipoProcessador;

    public Computador(String sistemaOperacional, double armazenamento, String tipoProcessador) {
        super(sistemaOperacional, false, false, armazenamento);
        this.tipoProcessador = tipoProcessador;
    }

    @Override
    public void ligar() {
        ligado = true;
    }

    @Override
    public void desligar() {
        ligado = false;
    }

    @Override
    public void desbloquear() {
        desbloqueado = true;
    }

    @Override
    public void bloquear() {
        desbloqueado = false;
    }

    public void instalarPrograma(double tamanho) {
        if (armazenamento >= tamanho) {
            armazenamento -= tamanho;
        }
    }
}

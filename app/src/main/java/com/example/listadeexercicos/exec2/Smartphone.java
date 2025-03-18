public class Smartphone extends Dispositivo {
    private int qtdFotos;
    private int qtdAplicativos;

    public Smartphone(String sistemaOperacional, double armazenamento) {
        super(sistemaOperacional, false, false, armazenamento);
        this.qtdFotos = 0;
        this.qtdAplicativos = 0;
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

    public void tirarFoto() {
        if (armazenamento > 0.5) {
            qtdFotos++;
            armazenamento -= 0.5;
        }
    }

    public void instalarApp(double tamanho) {
        if (armazenamento >= tamanho) {
            qtdAplicativos++;
            armazenamento -= tamanho;
        }
    }
}

public abstract class Dispositivo{
    protected String sistemaOperacional;
    protected boolean desbloqueado;
    protected boolean ligado;
    protected double armazenamento;

    public Dispositivo(String sistemaOperacional, boolean desbloqueado, boolean ligado, double armazenamento) {
        this.sistemaOperacional = sistemaOperacional;
        this.desbloqueado = desbloqueado;
        this.ligado = ligado;
        this.armazenamento = armazenamento;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public boolean isDesbloqueado() {
        return desbloqueado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public abstract void ligar();

    public abstract void desligar();

    public abstract void desbloquear();

    public abstract void bloquear();

}
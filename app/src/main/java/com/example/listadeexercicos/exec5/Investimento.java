import java.time.LocalDate;

public interface Investimento {
    public String getNome();
    public double getValorInicial();
    public double calcularRetorno();
    public boolean precisaRevisao();
    public void revisar();
}

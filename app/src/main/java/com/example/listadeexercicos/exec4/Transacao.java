import java.time.LocalDate;

public interface Transacao {
    public double getValor();
    public String getDescricao();
    public LocalDate getData();
    public boolean precisaRevisao();
    public void exibirDetalhes();
}

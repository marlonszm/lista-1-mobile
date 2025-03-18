import java.time.LocalDate;
import android.util.Log;

public class Despesa implements Transacao {
    private String descricao;
    private double valor;
    private LocalDate data;
    private boolean revisada;

    public Despesa(String descricao, double valor, LocalDate data) {
        this.descricao = descricao;
        this.valor = -Math.abs(valor);
        this.data = data;
        this.revisada = false;
        Log.i("Financas", "Despesa criada: " + descricao + " - R$ " + valor + " em " + data);
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public LocalDate getData() {
        return data;
    }

    @Override
    public boolean precisaRevisao() {
        return !revisada;
    }

    @Override
    public void revisar() {
        revisada = true;
        Log.i("Financas", "Despesa revisada: " + descricao + " - R$ " + valor);
    }

    @Override
    public void exibirDetalhes() {
        Log.i("Financas", "Detalhes da Despesa - " + descricao + ": R$ " + valor + " em " + data);
    }
}

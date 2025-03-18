import java.time.LocalDate;
import android.util.Log;

public abstract class InvestimentoBase implements Investimento {
    protected String nome;
    protected double valorInicial;
    protected LocalDate dataAplicacao;
    protected boolean revisado;

    public InvestimentoBase(String nome, double valorInicial, LocalDate dataAplicacao) {
        this.nome = nome;
        this.valorInicial = valorInicial;
        this.dataAplicacao = dataAplicacao;
        this.revisado = false;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getValorInicial() {
        return valorInicial;
    }

    @Override
    public boolean precisaRevisao() {
        Log.i("Investimento", nome + " precisa de revisão: " + !revisado);
        return !revisado;
    }

    @Override
    public void revisar() {
        revisado = true;
        Log.i("Investimento", nome + " foi revisado.");
    }
}

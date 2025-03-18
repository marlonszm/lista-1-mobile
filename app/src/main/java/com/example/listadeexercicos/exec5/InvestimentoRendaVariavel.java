import java.time.LocalDate;
import android.util.Log;

public class InvestimentoRendaVariavel extends InvestimentoBase {
    private double percentualVariacao;

    public InvestimentoRendaVariavel(String nome, double valorInicial, LocalDate dataAplicacao, double percentualVariacao) {
        super(nome, valorInicial, dataAplicacao);
        this.percentualVariacao = percentualVariacao;
    }

    @Override
    public double calcularRetorno() {
        double retorno = valorInicial * (percentualVariacao / 100);
        Log.i("Investimento", nome + " - Retorno calculado: " + retorno);
        return retorno;
    }
}

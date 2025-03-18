import java.time.LocalDate;
import android.util.Log;

public class InvestimentoRendaFixa extends InvestimentoBase {
    private double taxaJurosAnual;

    public InvestimentoRendaFixa(String nome, double valorInicial, LocalDate dataAplicacao, double taxaJurosAnual) {
        super(nome, valorInicial, dataAplicacao);
        this.taxaJurosAnual = taxaJurosAnual;
    }

    @Override
    public double calcularRetorno() {
        int anos = LocalDate.now().getYear() - dataAplicacao.getYear();
        double retorno = valorInicial * Math.pow(1 + taxaJurosAnual / 100, anos) - valorInicial;
        Log.i("Investimento", nome + " - Retorno calculado: " + retorno);
        return retorno;
    }
}

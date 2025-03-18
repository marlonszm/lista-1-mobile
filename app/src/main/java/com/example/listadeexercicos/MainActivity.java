package com.example.listadeexercicos;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Exercício 1
        Carro carro = new Carro("f3rr1", 4, "Fiat", 2013, false, 160, 0);
        carro.abrir();
        carro.ligar();
        carro.acelerar(20);
        Moto moto = new Moto("12712571", 2, "Honda", 2015, false, 160, 0);
        moto.ligar();
        moto.acelerar(20);

        //Exercício 2
        Smartphone smartphone1 = new Smartphone("Android", true, false, 64, 200, 30);
        smartphone1.ligar();
        smartphone1.desbloquear();
        Log.i("Smartphone", "Sistema Operacional: " + smartphone1.getSistemaOperacional());
        Log.i("Smartphone", "Armazenamento: " + smartphone1.getArmazenamento() + " GB");
        Log.i("Smartphone", "Fotos: " + smartphone1.getQtdFotos());
        Log.i("Smartphone", "Aplicativos: " + smartphone1.getQtdAplicativos());
        Log.i("Smartphone", "Está ligado: " + smartphone1.isLigado());
        Log.i("Smartphone", "Está desbloqueado: " + smartphone1.isDesbloqueado());
        Log.i("Smartphone", "------------------------------");
        Computador computador1 = new Computador("Windows 10", true, false, 512, "Intel i7", 16);
        computador1.ligar();
        computador1.bloquear();
        Log.i("Computador", "Sistema Operacional: " + computador1.getSistemaOperacional());
        Log.i("Computador", "Armazenamento: " + computador1.getArmazenamento() + " GB");
        Log.i("Computador", "Processador: " + computador1.getProcessador());
        Log.i("Computador", "Memória RAM: " + computador1.getMemoriaRam() + " GB");
        Log.i("Computador", "Está ligado: " + computador1.isLigado());
        Log.i("Computador", "Está desbloqueado: " + computador1.isDesbloqueado());

        //Exercício 3
        ContatoPessoal contatoPessoal = new ContatoPessoal("João Silva", "123.456.789-00", "joao@gmail.com", "Rua A, 123", "Pai de dois filhos", "Amo futebol");
        contatoPessoal.imprimirInfo();
        ContatoProfissional contatoProfissional = new ContatoProfissional("Maria Oliveira", "987.654.321-00", "maria@empresa.com", "Av. B, 456", "Gerente de Projetos", "Engenharia");
        contatoProfissional.imprimirInfo();
        contatoPessoal.alterarEndereco("Rua B, 456");
        contatoProfissional.alterarCargo("Diretora de TI");
        Log.i("ContatoPessoal", "Novo Endereço: " + contatoPessoal.getEndereco());
        Log.i("ContatoProfissional", "Novo Cargo: " + contatoProfissional.getCargo());
        contatoPessoal.imprimirInfo();
        contatoProfissional.imprimirInfo();

        //Exercício 4
        Despesa despesa = new Despesa("Compra de supermercado", 200.50, LocalDate.of(2025, 3, 18));
        Receita receita = new Receita("Salário", 3000.00, LocalDate.of(2025, 3, 20));
        despesa.exibirDetalhes();
        receita.exibirDetalhes();
        despesa.revisar();
        receita.revisar();
        despesa.exibirDetalhes();
        receita.exibirDetalhes();
        Log.i("Financas", "Total de despesas: R$ " + despesa.getValor());
        Log.i("Financas", "Total de receitas: R$ " + receita.getValor());
        double saldoTotal = despesa.getValor() + receita.getValor();
        Log.i("Financas", "Saldo total: R$ " + saldoTotal);

        //Exercício 5
        Investimento rendaFixa = new InvestimentoRendaFixa("Investimento em CDB", 10000.00, LocalDate.of(2020, 1, 1), 6.5);
        Investimento rendaVariavel = new InvestimentoRendaVariavel("Ações", 5000.00, LocalDate.of(2021, 5, 15), 12.3);
        Log.i("Investimento", "Detalhes do Investimento: " + rendaFixa.getNome());
        Log.i("Investimento", "Valor Inicial: " + rendaFixa.getValorInicial());
        Log.i("Investimento", "Retorno Calculado: " + rendaFixa.calcularRetorno());
        Log.i("Investimento", "Precisa Revisão? " + rendaFixa.precisaRevisao());
        rendaFixa.revisar();
        Log.i("Investimento", "Após revisão: Precisa Revisão? " + rendaFixa.precisaRevisao());
        Log.i("Investimento", "Detalhes do Investimento: " + rendaVariavel.getNome());
        Log.i("Investimento", "Valor Inicial: " + rendaVariavel.getValorInicial());
        Log.i("Investimento", "Retorno Calculado: " + rendaVariavel.calcularRetorno());
        Log.i("Investimento", "Precisa Revisão? " + rendaVariavel.precisaRevisao());
        rendaVariavel.revisar();
        Log.i("Investimento", "Após revisão: Precisa Revisão? " + rendaVariavel.precisaRevisao());
    }
    }
}
package com.example.listadeexercicos;

import android.util.Log;

public class Carro extends Veiculo {
    private double velocidadeMax;
    private double velocidadeAtual;
    private boolean aberto;

    public Carro(String placa, int qtdRodas, String marca, int ano, boolean estado, double velocidadeMax, double velocidadeAtual) {
        super(placa, qtdRodas, marca, ano, estado);
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
    }
    public void abrir(){
        this.aberto = true;
    }

    public void fechar(){
        this.aberto = false;
    }

    @Override
    public void ligar() {
        if(!this.aberto){
            Log.i("Erro", "O carro está fechado");
        }
        else{
            estado = true;
        }
    }

    @Override
    public void desligar() {
        if(!this.aberto){
            Log.i("Erro", "O carro está fechado");
        }
        else{
            estado = false;
        }
    }

    @Override
    public void acelerar(double velocidade) {
        if(!estado){
            Log.i("Erro", "O carro está desligado");
        }
        else{
            if(velocidadeAtual > velocidadeMax){
                Log.i("Erro", "Atingiu o limite de velocidade");
            }
            else{
                velocidadeAtual+=velocidade;
                Log.i("Acelerar", "Velocidade atual: "+velocidadeAtual);
            }
        }
    }

    @Override
    public void desacelerar(double velocidade) {
        if(!estado){
            Log.i("Erro", "O carro está desligado");
        }
        else{
            if(velocidadeAtual <= 0){
                Log.i("Erro", "Não é possível desacelerar");
            }
            else{
                velocidadeAtual-=velocidade;
                Log.i("Acelerar", "Velocidade atual: "+velocidadeAtual);
            }
        }
    }
}

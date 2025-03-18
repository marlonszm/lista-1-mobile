package com.example.listadeexercicos;

import android.util.Log;

public class Moto extends Veiculo{
    private double velocidadeMax;
    private double velocidadeAtual;

    public Moto(String placa, int qtdRodas, String marca, int ano, boolean estado, double velocidadeMax, double velocidadeAtual) {
        super(placa, qtdRodas, marca, ano, estado);
        this.velocidadeMax = velocidadeMax;
        this.velocidadeAtual = velocidadeAtual;
    }

    @Override
    public void ligar() {
        estado = true;
    }

    @Override
    public void desligar() {
        estado = false;
    }

    @Override
    public void acelerar(double velocidade) {
        if(!estado){
            Log.i("Erro", "A moto está desligado");
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
            Log.i("Erro", "A moto está desligado");
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

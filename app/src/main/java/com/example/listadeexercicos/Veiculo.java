package com.example.listadeexercicos;

public abstract class Veiculo {
    protected String placa;
    protected int qtdRodas;
    protected String marca;
    protected int ano;
    protected boolean estado;

    public Veiculo(String placa, int qtdRodas, String marca, int ano, boolean estado) {
        this.placa = placa;
        this.qtdRodas = qtdRodas;
        this.marca = marca;
        this.ano = ano;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public abstract void ligar();

    public abstract void desligar();
    public abstract void acelerar(double velocidade);

    public abstract void desacelerar(double velocidade);

}

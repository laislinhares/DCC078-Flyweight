package org.example;

public class Passagem {
    private String nomePassageiro;
    private Destino destinoInicial;
    private Destino destinoFinal;

    public Passagem(String nomePassageiro, Destino destinoInicial, Destino destinoFinal) {
        this.nomePassageiro = nomePassageiro;
        this.destinoInicial = destinoInicial;
        this.destinoFinal = destinoFinal;
    }

    public String obterPassagem() {
        return "Passagem{" +
                "Nome do Passageiro=" + nomePassageiro +
                ", Destino Inicial=" + destinoInicial.getCidade() +
                ", Destino Final=" + destinoFinal.getCidade() +
                '}';
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;
public class Compra {
    private List<Passagem> passagens = new ArrayList<>();

    public void comprarPassagem(String nomePassageiro, String cidadeInicio, String cidadeFinal) {
        Destino destinoInicial = DestinoFactory.getDestino(cidadeInicio);
        Destino destinoFinal = DestinoFactory.getDestino(cidadeFinal);
        Passagem passagem = new Passagem(nomePassageiro, destinoInicial, destinoFinal);
        passagens.add(passagem);
    }

    public List<String> obterPassagens() {
        List<String> saida = new ArrayList<String>();
        for (Passagem passagem : this.passagens) {
            saida.add(passagem.obterPassagem());
        }
        return saida;
    }
}

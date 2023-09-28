import org.example.Compra;
import org.example.DestinoFactory;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CompraTest {

    @Test
    public void deveRetonarPassagens() {
        Compra compra = new Compra();
        compra.comprarPassagem("João", "Rio de Janeiro", "São Paulo");
        compra.comprarPassagem("Maria", "Belo Horizonte", "Salvador");
        compra.comprarPassagem("Ana", "Rio de Janeiro", "Porto Alegre");

        List<String> saida = Arrays.asList(
                "Passagem{Nome do Passageiro=João, Destino Inicial=Rio de Janeiro, Destino Final=São Paulo}",
                "Passagem{Nome do Passageiro=Maria, Destino Inicial=Belo Horizonte, Destino Final=Salvador}",
                "Passagem{Nome do Passageiro=Ana, Destino Inicial=Rio de Janeiro, Destino Final=Porto Alegre}"
        );

        assertEquals(saida, compra.obterPassagens());
    }

    @Test
    public void deveRetornarTotalDestinos() {
        Compra compra = new Compra();
        compra.comprarPassagem("João", "Rio de Janeiro", "São Paulo");
        compra.comprarPassagem("Maria", "Belo Horizonte", "Salvador");
        compra.comprarPassagem("Ana", "Rio de Janeiro", "Porto Alegre");

        assertEquals(5, DestinoFactory.getTotalDestinos());
    }
}

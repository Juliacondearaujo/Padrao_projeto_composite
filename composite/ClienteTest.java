package padroesestruturais_exercicios.composite;

import org.junit.jupiter.api.Test;
import padroesestruturais.composite.Disciplina;
import padroesestruturais.composite.Topico;
import padroesestruturais.composite.Unidade;

import static org.junit.jupiter.api.Assertions.*;
public class ClienteTest {


    @Test
    void deveRetornarPedidoCliente() {
        Caixas caixa1 = new Caixas("Caixa Principal");

        Caixas caixa2 = new Caixas("Caixa1");
        Produtos produtos1 = new Produtos("Capinha");
        caixa2.addEntrega(produtos1);

        Caixas caixa3 = new Caixas("Caixa2");
        Produtos produtos2 = new Produtos("Maquiagem");
        Produtos produtos3 = new Produtos("Roupa");
        caixa3.addEntrega(produtos2);
        caixa3.addEntrega(produtos3);

        Produtos pedido = new Produtos("Entrega") {
        };
        pedido.addEntrega(caixa1);
        pedido.addEntrega(caixa2);
        pedido.addEntrega(caixa3);

        Cliente cliente = new Cliente();
        cliente.setPedido(pedido);

        assertEquals("Produto: Entrega\n" +
                "Caixa: Caixa Principal\n" +
                "Caixa: Caixa1\n" +
                "Produto: Capinha\n" +
                "Caixa: Caixa2\n" +
                "Produto: Maquiagem\n" +
                "Produto: Roupa\n", cliente.getPedido());
    }

    @Test
    void deveRetornarExecacaoClienteSemPedido() {
        try {
            Cliente cliente = new Cliente();
            cliente.getPedido();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Cliente sem pedido", e.getMessage());
        }
    }

}

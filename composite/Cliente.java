package padroesestruturais_exercicios.composite;

import padroesestruturais.composite.Conteudo;

public class Cliente {

    private Entrega pedido;

    public void setPedido(Entrega pedido) {
        this.pedido = pedido;
    }

    public String getPedido() {
        if (this.pedido == null) {
            throw new NullPointerException("Cliente sem pedido");
        }
        return this.pedido.getEntrega();
    }
}



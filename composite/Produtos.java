package padroesestruturais_exercicios.composite;


import java.util.ArrayList;
import java.util.List;

public class Produtos extends Entrega {

    private List<Entrega> entregas;

    public Produtos(String descricao) {
        super(descricao);
        this.entregas = new ArrayList<Entrega>();
    }

    public void addEntrega(Entrega entrega) {
        this.entregas.add(entrega);
    }

    public String getEntrega() {
        String saida = "";
        saida = "Produto: " + this.getDescricao() + "\n";
        for (Entrega entrega : entregas) {
            saida += entrega.getEntrega();
        }
        return saida;
    }
}


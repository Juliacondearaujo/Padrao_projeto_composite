package padroesestruturais_exercicios.composite;

public abstract class Entrega {

    private String descricao;

    public Entrega(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getEntrega();
}

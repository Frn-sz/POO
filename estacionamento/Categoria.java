public class Categoria {
    private String descricao;
    private float valor;

    public Categoria(){}
    public Categoria(String descricao, float valor){
        this.descricao = descricao;
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}

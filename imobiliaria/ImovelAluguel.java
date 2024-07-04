/**
 * ImovelAluguel
 */
public class ImovelAluguel extends Imovel {

    private String modalidade;
    private float caucao;
    private float valorAluguel;

    public ImovelAluguel() {
    }

    public ImovelAluguel(Pessoa p, float area, String tipo, String endereco, int numero, String complemento,
                         String bairro,
                         String cidade, String estado, float caucao, float valorAluguel) {
        super(p, area, tipo, endereco, numero, complemento, bairro, cidade, estado);
        this.caucao = caucao;
        this.valorAluguel = valorAluguel;
    }

    public ImovelAluguel(Pessoa proprietario, float area, String tipo, float caucao,
                         float valorAluguel) {
        super(proprietario, area, tipo);
        this.caucao = caucao;
        this.valorAluguel = valorAluguel;
    }

    public ImovelAluguel(Pessoa proprietario, float area, String tipo, String cidade, float caucao,
                         float valorAluguel) {
        super(proprietario, area, tipo, cidade);

        this.caucao = caucao;
        this.valorAluguel = valorAluguel;
    }

    public float calcularIPTU(float fator) {
        return fator * this.getArea();
    }

    public float calcularTaxas(float iptu, float agua, float condominio) {
        return iptu + agua + condominio;
    }

    public String getModalidade() {
        return modalidade;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public float getCaucao() {
        return caucao;
    }

    public void setCaucao(float caucao) {
        this.caucao = caucao;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

}
public abstract class Imovel {
    private Pessoa proprietario;
    private float area;
    private String tipo;
    private String endereco;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;

    public Imovel() {

    }

    public Imovel(Pessoa p, float area, String tipo, String endereco, int numero, String complemento, String bairro,
                  String cidade, String estado) {
        this.tipo = tipo;
        this.proprietario = p;
        this.area = area;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public Imovel(Pessoa proprietario, float area, String tipo) {
        this.proprietario = proprietario;
        this.area = area;
        this.tipo = tipo;
    }

    public Imovel(Pessoa proprietario, float area, String tipo, String cidade) {
        this.proprietario = proprietario;
        this.area = area;
        this.tipo = tipo;
        this.cidade = cidade;
    }

    public float getArea() {
        return area;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEstado() {
        return estado;
    }

    public int getNumero() {
        return numero;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract float calcularIPTU(float fator);

}

public class Veiculo {
    private String placa;
    private long rg;
    private Categoria categoria;

    public Veiculo(){}

    public Veiculo(String placa, long rg, Categoria categoria){
        this.placa = placa;
        this.rg = rg;
        this.categoria = categoria;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}


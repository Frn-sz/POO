public class Estadia {
    private Veiculo veiculo;
    private int horas;
    float valor;


    public Estadia(){}

    public Estadia(Veiculo veiculo,int horas){
        this.veiculo =veiculo;
        this.horas = horas;
    }
    public float calcularEstadia(){
        this.valor = this.horas * this.veiculo.getCategoria().getValor();

        return this.valor;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }
}

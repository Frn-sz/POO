
public class ContaEspecial extends Conta {

    private float limit;

    public ContaEspecial() {
        super();
    }

    public ContaEspecial(int numero, float saldo, Pessoa pessoa, float limit) {
        super(numero, saldo, pessoa);
        this.limit = limit;
    }

    public float getLimit() {
        return limit;
    }

    public void setLimit(float limit) {
        this.limit = limit;
    }

    public float sacar(float valor) {
        if (this.getSaldo() - valor > 0 - this.getLimit())
            this.saldo -= valor;

        return this.saldo;
    }

}

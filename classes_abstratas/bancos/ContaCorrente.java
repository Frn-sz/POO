
public class ContaCorrente extends Conta {

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(int numero, float saldo, Pessoa correntista) {
        super(numero, saldo, correntista);
    }

    public float sacar(float valor) {
        if (this.saldo - valor > 0)
            this.saldo -= valor;

        return this.saldo;
    }
}
